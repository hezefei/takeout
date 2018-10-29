package com.itty.sell.service.impl;

import com.itty.sell.pojo.ProductInfo;
import com.itty.sell.enums.ProductStatusEnum;
import com.itty.sell.repository.ProductInfoRepository;
import com.itty.sell.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: hezefei
 * @Date: 2018/10/26 02:09
 * @Description:
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductInfoRepository  repository;

    @Override
    public ProductInfo findById(String id) {
        return repository.findOne(id);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

}
