package com.itty.sell.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: hezefei
 * @Date: 2018/10/26 01:55
 * @Description:
 */
@Entity

@Data
public class ProductInfo {
    //商品编号
    @Id
    private String productId;
    //商品名字
    private String productName;
    //商品价格
    private BigDecimal productPrice;
    //商品库存量
    private Integer productStock;
    //商品描述
    private String productDescription;
    //商品小图
    private String productIcon;
    //商品状态，0正常，1下架
    private Integer productStatus;
    //商品分类编号
    private Integer categoryType;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
    public ProductInfo() {
    }
}