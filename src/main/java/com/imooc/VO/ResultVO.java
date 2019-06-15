package com.imooc.VO;

import lombok.Data;

/**
 * 返回给前端的VO对象
 * http请求返回端最外层对象
 * Created by Liqiankun on 2019/6/13
 * param:
 *
 * {
 *     code: 0,
 *     msg: "成功",
 *     data: [//数据里会有好多种类：比如有热销榜种类，女生喜欢种类，男士喜欢种类
 *          {
 *              "name": "热榜",
 *              "type": 1,
 *              "foods": [//每个种类下面有那些商品
 *                  {
 *                      "id": "123455",
 *                      "name": "皮蛋粥",
 *                      "price": 3.2,
 *                      "description": "味道很好",
 *                      "icon": "http://xxx.jpg"
 *                  },
 *                  {}
 *              ]
 *          },
 *          {
 *              "name": "女生喜欢",
 *              "type": 3,
 *              "foods": [//每个种类下面有那些商品
 *                  {
 *                      "id": "123456",
 *                      "name": "皮皮虾",
 *                      "price": 8.2,
 *                      "description": "味道不错",
 *                      "icon": "http://xxx.jpg"
 *                  },
 *                  {}
 *              ]
 *          },
 *     ]
 * }
 */

@Data
public class ResultVO<T> {

    /**错误码0：成功；1：失败*/
    private Integer code;

    /**提示信息*/
    private String msg;

    /**泛型数据；返回端具体数据*/
    private T data;
}
