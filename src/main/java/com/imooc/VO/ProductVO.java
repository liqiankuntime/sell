package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 *  商品种类VO
 * Created by Liqiankun on 2019/6/13
 * param:
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
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("food")
    private List<ProductInfoVO> productInfoVOList;
}
