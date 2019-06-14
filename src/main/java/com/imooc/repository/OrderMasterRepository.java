package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Liqiankun on 2019/6/14
 * param:
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    //查询某个人的订单
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
