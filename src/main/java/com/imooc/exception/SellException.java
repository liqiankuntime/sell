package com.imooc.exception;

import com.imooc.Enums.ResultEnum;

/**
 * Created by Liqiankun on 2019/6/15
 * param:
 */
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum){

        super(resultEnum.getMsg());
        System.out.println("SellExce:::"+ resultEnum);
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
