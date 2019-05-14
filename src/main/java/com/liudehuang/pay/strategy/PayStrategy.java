package com.liudehuang.pay.strategy;

import com.djcps.djbase.commons.exception.DJException;
import com.djcps.framework.httpformat.model.HttpResult;
import com.liudehuang.pay.entity.PayMentParam;

/**
 * @author liudehuang
 * @date 2019/5/13 13:46
 */
public interface PayStrategy {

    HttpResult createPayOrder(PayMentParam param) throws DJException;
}
