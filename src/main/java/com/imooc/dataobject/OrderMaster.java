package com.imooc.dataobject;

import com.imooc.Enums.OrderStatusEnum;
import com.imooc.Enums.PayStatuEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 买家订单主表： 所有订单
 * Created by Liqiankun on 2019/6/14
 * param:
 */

@Entity
@DynamicUpdate
@Data
public class OrderMaster {

    /**订单Id*/
    @Id
    private String orderId;

    /**买家名字*/
    private String buyerName;

    /**卖家手机号*/
    private String buyerPhone;

    /**买家地址*/
    private String buyerAddress;

    /**买家微信Openid*/
    private String buyerOpenid;

    /**订单总金额*/
    private BigDecimal orderAmount;

    /**订单状态 默认为新下单*/
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /**支付状态 默认未支付*/
    private Integer payStatu = PayStatuEnum.WAIT.getCode();

    /**订单创建时间*/
    private Date createTime;

    /**更新时间*/
    private Date updateTime;

    public OrderMaster() {
    }

    public OrderMaster(String orderId, String buyerName, String buyerPhone, String buyerAddress, String buyerOpenid, BigDecimal orderAmount) {
        this.orderId = orderId;
        this.buyerName = buyerName;
        this.buyerPhone = buyerPhone;
        this.buyerAddress = buyerAddress;
        this.buyerOpenid = buyerOpenid;
        this.orderAmount = orderAmount;
    }
}
