package com.imooc.controller;


import com.imooc.Enums.ResultEnum;
import com.imooc.VO.ResultVO;
import com.imooc.converter.OrderForm2OrderDTOConverter;
import com.imooc.dto.OrderDTO;
import com.imooc.exception.SellException;
import com.imooc.form.OrderForm;
import com.imooc.service.BuyerService;
import com.imooc.service.OrderService;
import com.imooc.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.transform.Result;
import java.util.*;

@RestController
@RequestMapping("/buyer/order")
@Slf4j

public class BuyerOrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private BuyerService buyerService;

    @PostMapping("/create")
    //创建订单
    public ResultVO<Map<String, String>> create(@Valid OrderForm orderForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            log.error("【创建订单】参数不正确，orderForm={}", orderForm);
            throw new SellException(
                ResultEnum.PARAM_ERROR.getCode(),
                bindingResult.getFieldError().getDefaultMessage()
            );
        }
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderForm);
        if(CollectionUtils.isEmpty(orderDTO.getOrderDetailList())){
            log.error("【创建订单】购物车不能为空");
            throw new SellException(ResultEnum.CART_EMPTY);

        }
        orderService.create(orderDTO);

        OrderDTO createResult = orderService.create(orderDTO);
        Map<String, String> map = new HashMap<>();
        map.put("orderId", createResult.getOrderId());

        return ResultVOUtil.success(map);
    }

    //订单列表
    @GetMapping("/list")
    public ResultVO<List<OrderDTO>> list(
        @RequestParam("openid") String openid,
        @RequestParam(value="page", defaultValue = "0") Integer page,
        @RequestParam(value="size", defaultValue = "10") Integer size

    ){
        if(StringUtils.isEmpty(openid)){
            log.error("【查询订单列表】openid为空");
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        PageRequest pageRequest = new PageRequest(page, size);
        Page<OrderDTO> orderDTOPage = orderService.findList(openid, pageRequest);
        return ResultVOUtil.success(orderDTOPage.getContent());
    }
    //订单详情
    @GetMapping("/detai")
    public ResultVO<OrderDTO> detail(
            @RequestParam("openid") String openid,
            @RequestParam("orderId") String orderId
    ){

        //TODO 不安全，因为没有权限校验，这个时候谁都能查，应该是自己查自己的
//        OrderDTO orderDTO = orderService.findOne(orderId);

        //安全做法是要校验是否属于本人的
        OrderDTO orderDTO = buyerService.findOrderOne(openid, orderId);
        return ResultVOUtil.success(orderDTO);
    }

    //取消订单
    @PostMapping("/cancel")
    public ResultVO<OrderDTO> cancel(
            @RequestParam("openid") String openid,
            @RequestParam("orderId") String orderId
    ){
        //TODO 不安全，因为没有权限校验，这个时候谁都能查，应该是自己查自己的
//        OrderDTO orderDTO = orderService.findOne(orderId);
//        orderService.cancel(orderDTO);

        //安全做法
        buyerService.cancelOrder(openid, orderId);
        return ResultVOUtil.success();
    }
}
