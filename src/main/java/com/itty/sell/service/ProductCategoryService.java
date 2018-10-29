package com.itty.sell.service;

import com.itty.sell.pojo.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
    ProductCategory findOne(Integer id);

    List<ProductCategory> findAll();

    ProductCategory save(ProductCategory productCategory);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> types);


}
