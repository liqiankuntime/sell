package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity//数据库映射成对象
@DynamicUpdate//数据库自动修改日期
@Data
//Data包含了生成get和set以及同String的方法，就可以不用在写get和set的方法了
public class ProductCategory {
    @Id//主键
    @GeneratedValue//自增类型
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
















































