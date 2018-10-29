package com.itty.sell.repository;

import com.itty.sell.pojo.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author hezefei
 * @Description  
 * @Date 19:39 2018/10/25
 * @Param
 * @return 
 **/
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    /**
     * 传入类型列表，查询包含列表中类型的所有数据
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> types);
}
