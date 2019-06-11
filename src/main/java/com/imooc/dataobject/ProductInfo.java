package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 商品：对象；一个商品对象具有如下定义的属性
 * Created by Liqiankun on 2019/6/11
 * param:
 */

@Entity//数据库映射成对象
@DynamicUpdate//数据库自动修改日期
@Data//Data包含了生成get和set以及同String的方法，就可以不用在写get和set的方法了
public class ProductInfo {

    @Id
    private String productId;

    /**名字*/
    private String productName;

    /**单价*/
    private BigDecimal productPrice;

    /**库存*/
    private Integer productStock;

    /**描述*/
    private String productDescription;

    /**小图*/
    private String productIcon;

    /***/
    private Integer productType;

    /**状态 0：正常；1：下架*/
    private Integer productStatus;

    /**类目编码: 商品和类目的关系用这个字段标示，即：这个商品属于哪个类目下的*/
    private Integer categoryType;

    public ProductInfo() {
    }

    public ProductInfo(String productId, String productName, BigDecimal productPrice, Integer productStock, String productDescription, String productIcon, Integer productStatus, Integer categoryType) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productDescription = productDescription;
        this.productIcon = productIcon;
        this.productStatus = productStatus;
        this.categoryType = categoryType;
    }
}
