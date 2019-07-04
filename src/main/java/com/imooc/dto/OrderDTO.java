package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.Enums.OrderStatusEnum;
import com.imooc.Enums.PayStatuEnum;
import com.imooc.dataobject.OrderDetail;
import com.imooc.utils.serializer.Date2LongSerializer;
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
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)

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
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /**更新时间*/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
