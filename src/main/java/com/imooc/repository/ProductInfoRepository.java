package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品的Dao层
 * Created by Liqiankun on 2019/6/12
 * param:
 */                                                                        //商品对象主键的类型
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    //通过商品的状态查找上架的商品
    List<ProductInfo> findByProductStatus(Integer ProductStatus);

}
