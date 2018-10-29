package com.itty.sell.service.impl;

import com.itty.sell.dtd.OrderDTO;
import com.itty.sell.enums.ResultEnum;
import com.itty.sell.exception.SellException;
import com.itty.sell.pojo.OrderDetail;
import com.itty.sell.pojo.ProductInfo;
import com.itty.sell.service.OrderService;
import com.itty.sell.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: hezefei
 * @Date: 2018/10/29 00:30
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ProductInfoService productInfoService;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {

        BigDecimal orderAmount = new BigDecimal(BigInteger.ZERO );
        //1、查询商品（数量，价格）
        List<OrderDetail> orderDetailsList=new ArrayList<>();
        for (OrderDetail orderDetail:orderDTO.getOrderDetailList()){
            ProductInfo info = productInfoService.findById(orderDetail.getProductId());
            if (info==null){
                throw new SellException(ResultEnum.PRODUCT_NOT_EXISTS);
            }
            //2、计算订单总价
            orderAmount = info.getProductPrice()
                    .multiply(new BigDecimal(orderDetail.getProductQuantity()))
                    .add(orderAmount);
        }



        //订单详情入库


        //3、写入订单数据库(orderMaster和orderDetail)

        //4、扣库存
       return null;
    }

    @Override
    public OrderDTO findOne() {
        return null;
    }

    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }
}
