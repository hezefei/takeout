package com.itty.sell.controller;

import com.itty.sell.VO.ProductInfoVO;
import com.itty.sell.VO.ProductVO;
import com.itty.sell.VO.ResultVO;
import com.itty.sell.pojo.ProductCategory;
import com.itty.sell.pojo.ProductInfo;
import com.itty.sell.service.ProductCategoryService;
import com.itty.sell.service.ProductInfoService;
import com.itty.sell.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: hezefei
 * @Date: 2018/10/26 14:48
 * @Description:
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private ProductCategoryService productCategoryService;
    @GetMapping("/list")
    public ResultVO list(){
        //查询所有上架商品
        List<ProductInfo> upAll = productInfoService.findUpAll();
        ArrayList<Integer> list = new ArrayList<>();
        for (ProductInfo productInfo:upAll){
            list.add(productInfo.getCategoryType());
        }
        List<ProductCategory> byCategoryTypeIn = productCategoryService.findByCategoryTypeIn(list);
        //数据拼装
        ArrayList<ProductVO> productVO = new ArrayList<>();

        for (ProductCategory roductCategory:byCategoryTypeIn){
            ProductVO productVO1=new ProductVO();
            productVO1.setCategoryName(roductCategory.getCategoryName());
            productVO1.setCategoryType(roductCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();

            for (ProductInfo productInfo1:upAll){
                if (productInfo1.getCategoryType().equals(roductCategory.getCategoryType())){
                    ProductInfoVO productInfoVO=new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo1,productInfoVO);

                    productInfoVOList.add(productInfoVO);
                }
            }

            productVO1.setProductInfoVOList(productInfoVOList);
            productVO.add(productVO1);
        }

        return ResultVOUtil.success(productVO);
    }
}
