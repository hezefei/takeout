package com.itty.sell.service.impl;

import com.itty.sell.pojo.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {
    @Autowired
    ProductInfoServiceImpl productInfoService;
    @Test
    public void findById() {
    }

    @Test
    public void findUpAll() {
    }

    @Test
    public void findAll() {
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("方便面");
        productInfo.setProductPrice(new BigDecimal(2.50));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("纯天然，有点甜");
        productInfo.setProductIcon("http:xxx.com/xx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(1);
        ProductInfo result =  productInfoService.save(productInfo);
        Assert.assertNotNull(result);
    }
}