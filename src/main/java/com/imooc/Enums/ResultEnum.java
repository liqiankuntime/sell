package com.imooc.Enums;

import lombok.Getter;

/**
 * Created by Liqiankun on 2019/6/15
 * param:
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10, "商品不存在"),
    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
