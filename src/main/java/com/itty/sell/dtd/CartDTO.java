package com.itty.sell.dtd;

import lombok.Data;

/**
 * @Auther: hezefei
 * @Date: 2018/10/29 00:21
 * @Description:购物车
 */
@Data
public class CartDTO {
    //商品id
    private String productId;
    //数量
    private Integer productQuantity;
    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}