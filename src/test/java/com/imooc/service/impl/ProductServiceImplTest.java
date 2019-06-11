package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Liqiankun on 2019/6/12
 * param:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;
    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("123455");
        System.out.println("findOne:"+productInfo.toString());
        Assert.assertEquals("123455", productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        System.out.println("findOne:"+productInfoList.toString());
        Assert.assertNotEquals(0, productInfoList.size());
    }

    @Test
    public void findAll() {
        PageRequest request = new PageRequest(0, 2);
        Page<ProductInfo> productInfoPage = productService.findAll(request);
        System.out.println("findOne:"+productInfoPage.toString());
        System.out.println("Page:"+ productInfoPage.getTotalElements());

    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo(
                "123456",
                "皮皮虾",
                new BigDecimal(9.2),
                80,
                "很好吃",
                "http://xxx.jpg",
                0,
                10
        );
        ProductInfo result = productService.save(productInfo);
        System.out.println("result:"+ result.toString());


    }
}