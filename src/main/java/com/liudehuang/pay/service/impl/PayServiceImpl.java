package com.liudehuang.pay.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.djcps.djbase.commons.exception.DJException;
import com.djcps.framework.httpformat.model.HttpResult;
import com.liudehuang.pay.dao.PayDao;
import com.liudehuang.pay.entity.AliConfiguration;
import com.liudehuang.pay.entity.PayMentParam;
import com.liudehuang.pay.enums.PayCodeEnum;
import com.liudehuang.pay.service.PayService;
import com.liudehuang.pay.strategy.PayStrategy;
import com.liudehuang.pay.strategy.PayStrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liudehuang
 * @date 2019/5/13 13:43
 */
@Service
public class PayServiceImpl implements PayService {
    @Autowired
    private PayDao payDao;

    @Override
    public HttpResult pay(PayMentParam param) throws DJException {
        String payCode = param.getPayCode();
        String className = PayCodeEnum.valueOf(payCode).getClassName();
        PayStrategy payStrategy = PayStrategyFactory.getPayStrategy(className);
        return payStrategy.createPayOrder(param);
    }

    @Override
    public String hello(){
        AliConfiguration aliqr = payDao.getAliConfiguration("105", "ALIQR");
        return JSONObject.toJSONString(aliqr);
    }
}
