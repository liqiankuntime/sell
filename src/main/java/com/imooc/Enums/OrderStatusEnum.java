package com.imooc.Enums;

import lombok.Getter;

/**
 * Created by Liqiankun on 2019/6/14
 * param:
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISH(1, "完结"),//卖家接单后
    CANCLE(2, "已取消")
    ;

    private Integer code;
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
