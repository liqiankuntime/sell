package com.imooc.utils;

import java.util.Random;

/**
 * Created by Liqiankun on 2019/6/15
 * param:
 */
public class KeyUtil {

    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;
        System.out.println("timeee:::" + System.currentTimeMillis()+"randor:::"+number+">"+System.currentTimeMillis() + String.valueOf(number));
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
