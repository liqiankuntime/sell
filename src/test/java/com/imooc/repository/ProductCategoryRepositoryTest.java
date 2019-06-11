package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Liqiankun on 2019/6/10
 * param:
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private  ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findById(1).get();
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveOneTest(){
        ProductCategory productCategory = new ProductCategory("大众所爱", 5);
        repository.save(productCategory);
        Assert.assertNotNull(repository);
    }

    @Test
    public void updateTest(){
//        ProductCategory productCategory = new ProductCategory();
//        productCategory.setCategoryId(2);
//        productCategory.setCategoryName("男士所爱");
//        productCategory.setCategoryType(4);
//        repository.save(productCategory);


        ProductCategory productCategory = repository.findById(1).get();
        productCategory.setCategoryType(10);
        repository.save(productCategory);

    }

    @Test
    public void findByCategoryTypeTest(){
        List list = Arrays.asList(2,3,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);

        Assert.assertNotEquals(0, result.size());
    }
}