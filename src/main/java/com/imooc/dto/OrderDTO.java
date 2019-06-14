package com.imooc.dto;

import com.imooc.Enums.OrderStatusEnum;
import com.imooc.Enums.PayStatuEnum;
import com.imooc.dataobject.OrderDetail;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Liqiankun on 2019/6/14
 * param:
 */
@Data
public class OrderDTO {

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
    private Integer orderStatus;

    /**支付状态 默认未支付*/
    private Integer payStatu;

    /**订单创建时间*/
    private Date createTime;

    /**更新时间*/
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
