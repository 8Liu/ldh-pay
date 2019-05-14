package com.liudehuang.pay.service;

import com.djcps.djbase.commons.exception.DJException;
import com.djcps.framework.httpformat.model.HttpResult;
import com.liudehuang.pay.entity.PayMentParam;

/**
 * @author liudehuang
 * @date 2019/5/13 13:43
 */
public interface PayService {

    HttpResult pay(PayMentParam param) throws DJException;

    String hello();
}
