package com.imooc.dataobject;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * 商品DAO
 */
@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;
    //商品名字
    private String productName;
    //商品价格
    private BigDecimal productPrice;
    //库存
    private Integer productStock;
    //商品描述
    private String productDescription;
    //商品图标
    private String productIcon;
    //状态；1:下架；0：正常
    private Integer productStatus;
    //类目编码
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
