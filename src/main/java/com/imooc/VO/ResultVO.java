package com.imooc.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * {
 *     "code":0,
 *     "msg":"成功"，
 *     "data":[
 *          {
 *              "name":"热榜",
 *              "type": 1,
 *              "foods": [
 *                  {
 *                      "id":"123",
 *                      "name":"皮蛋",
 *                      "price":3.2,
 *                      "description": "好吃",
 *                      "icon": "http://xxx.com"
 *                  }
 *              ]
 *          }
 *     ]
 * }
 */
@Data
public class ResultVO<T> {
    /**错误码*/
    private Integer code;
    private String msg;
    private T data;
}
