package com.liudehuang.pay.strategy.impl;

import com.djcps.djbase.commons.base.BaseService;
import com.djcps.djbase.commons.exception.DJException;
import com.djcps.framework.httpformat.model.HttpResult;
import com.djcps.pay.alipay.AliPayConfig;
import com.djcps.pay.alipay.DefaultAliPayClient;
import com.djcps.pay.alipay.request.AliPayTradePrecreateRequest;
import com.djcps.pay.alipay.response.AliPayTradePrecreateResponse;
import com.djcps.pay.common.http.OkHttpRequest;
import com.liudehuang.pay.dao.PayDao;
import com.liudehuang.pay.entity.AliConfiguration;
import com.liudehuang.pay.entity.Configuration;
import com.liudehuang.pay.entity.PayMentParam;
import com.liudehuang.pay.strategy.PayStrategy;
import com.liudehuang.pay.util.SnowflakeIdUtils;
import com.liudehuang.pay.util.SpringContextUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author liudehuang
 * @date 2019/5/13 14:08
 */
public class AliQrPayStrategyImpl extends BaseService implements PayStrategy {
    private Map<String, Configuration> map = new ConcurrentHashMap<>();

    @Override
    public HttpResult createPayOrder(PayMentParam param) throws DJException {
        PayDao payDao = (new SpringContextUtil()).getBean(PayDao.class);
        String key = param.getSystemId()+param.getPayCode();
        AliConfiguration aliConfiguration = null;
        if(map.get(key)!=null){
            aliConfiguration = (AliConfiguration) map.get(key);
        }else {
            aliConfiguration = payDao.getAliConfiguration(param.getSystemId(), param.getPayCode());
            map.put(key,aliConfiguration);
        }
        AliPayConfig config = new AliPayConfig(aliConfiguration.getGateway(),aliConfiguration.getAppId(),aliConfiguration.getMerchantPrivatekey(),aliConfiguration.getAlipayPublickey(),aliConfiguration.getNotifyUrl(),aliConfiguration.getReturnUrl(),aliConfiguration.getSignType());
        DefaultAliPayClient client = new DefaultAliPayClient(config,new OkHttpRequest());
        AliPayTradePrecreateRequest request = new AliPayTradePrecreateRequest();
        request.setSubject(param.getSubject());
        request.setOutTradeNo(SnowflakeIdUtils.nextId());
        request.setTotalAmount(param.getAmount());
        AliPayTradePrecreateResponse response = (AliPayTradePrecreateResponse) client.execute(request);
        return toSuccessClient(response.getQrCode());
    }
}
