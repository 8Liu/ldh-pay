package com.liudehuang.pay.controller;

import com.djcps.djbase.commons.exception.DJException;
import com.djcps.framework.httpformat.model.HttpResult;
import com.liudehuang.pay.entity.PayMentParam;
import com.liudehuang.pay.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author liudehuang
 * @date 2019/5/13 9:06
 */
@RestController
public class PayController {
    @Autowired
    private PayService payService;

    @GetMapping("/createOrder")
    HttpResult createOrder() throws DJException {
        PayMentParam param = new PayMentParam();
        param.setAmount(new BigDecimal(6));
        param.setOrderId("123456");
        param.setPayCode("ALIQR");
        param.setSystemId("105");
        param.setSubject("刘德煌会员");
        HttpResult result = payService.pay(param);
        return result;
    }
}
