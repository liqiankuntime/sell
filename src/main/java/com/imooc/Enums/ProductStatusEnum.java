package com.imooc.Enums;

import lombok.Getter;

/**
 * 商品状态的枚举
 * Created by Liqiankun on 2019/6/12
 * param:
 */

@Getter//包含了生成get的方法，就可以不用在写get的方法了
public enum ProductStatusEnum {

    UP(0, "在架"),
    Down(1, "下架")
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
