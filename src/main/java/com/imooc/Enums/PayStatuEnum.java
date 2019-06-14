package com.imooc.Enums;

import lombok.Getter;

/**
 * Created by Liqiankun on 2019/6/14
 * param:
 */

@Getter
public enum PayStatuEnum {
    WAIT(0, "未支付"),
    SUCCESS(1, "支付成功"),
    ;
    private Integer code;
    private String msg;

    PayStatuEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
