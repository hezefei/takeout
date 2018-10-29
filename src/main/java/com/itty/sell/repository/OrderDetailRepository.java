package com.itty.sell.repository;

import com.itty.sell.pojo.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
    /**
     * @Author hezefei
     * @Description  根据订单id来查找订单详情列表
     * @Date 23:51 2018/10/28
     * @Param [orderId]
     * @return java.util.List<com.itty.sell.dto.OrderDetail>
     **/
    List<OrderDetail> findByOrderId(String orderId);
}
