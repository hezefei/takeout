package com.itty.sell.dtd;

import com.itty.sell.pojo.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Auther: hezefei
 * @Date: 2018/10/29 00:17
 * @Description:
 */
@Data
public class OrderDTO {
    //订单编号
    private String orderId;
    //买家名字
    private String buyerName;
    //买家电话
    private String buyerPhone;
    //买家地址
    private String buyerAddress;
    //买家微信Openid
    private String buyerOpenid;
    //订单总金额
    private BigDecimal orderAmount;
    //订单状态，默认为0新订单
    private Integer orderStatus;
    //支付状态，默认为0未支付
    private Integer payStatus;
    //订单创建时间
    private Date createTime;
    //订单更新时间
    private Date updateTime;
    //订单详情
    private List<OrderDetail> orderDetailList;
}
