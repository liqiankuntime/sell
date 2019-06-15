package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单详情表
 * Created by Liqiankun on 2019/6/14
 * param:
 */

@Entity
@DynamicUpdate
@Data
public class OrderDetail {


    @Id
    private String detailId;

    /**订单Id*/
    private String orderId;

    /**要购买商品的Id*/
    private String productId;

    /**要购买商品的名称*/
    private String productName;

    /**要购买商品的单价*/
    private BigDecimal productPrice;

    /**
     * 要购买商品的数量
     */
    private Integer priductQuantity;

    /**要购买商品的图表 */
    private String productIcon;

    private Date createTime;

    private Date updateTime;

    public OrderDetail() {
    }

    public OrderDetail(String detailId, String orderId, String productId, String productName, BigDecimal productPrice, Integer productQuantity, String productIcon) {
        this.detailId = detailId;
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.priductQuantity = productQuantity;
        this.productIcon = productIcon;
    }
}
