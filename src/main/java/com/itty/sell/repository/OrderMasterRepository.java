package com.itty.sell.repository;

import com.itty.sell.pojo.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
    /**
     * @Author hezefei
     * @Description  根据买家的openid(账号)来查询订单列表，并使用分页
     * @Date 23:41 2018/10/28
     * @Param
     * @return
     **/
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
