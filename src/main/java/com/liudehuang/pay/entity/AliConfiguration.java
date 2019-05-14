package com.liudehuang.pay.entity;

import lombok.Data;

/**
 * @author liudehuang
 * @date 2019/5/13 9:07
 */
@Data
public class AliConfiguration extends Configuration{
    /**
     * 自增id
     */
    private Integer id;
    /**
     * 主键id
     */
    private String fid;
    /**
     * 网关地址
     */
    private String gateway;
    /**
     * 阿里appId
     */
    private String appId;
    /**
     * 商户私钥
     */
    private String merchantPrivatekey;
    /**
     * 支付宝公钥
     */
    private String alipayPublickey;
    /**
     * 异步回调地址
     */
    private String notifyUrl;
    /**
     * 同步回调地址
     */
    private String returnUrl;
    /**
     * 签名加密类型
     */
    private String signType;
    /**
     * 字符编码
     */
    private String charset;
    /**
     * json/xml
     */
    private String format;
    /**
     * 商户主体
     */
    private String merchant;
    /**
     * ALISDK/ALIQR
     */
    private String payCode;
    /**
     * 该支付宝配置是否启用
     */
    private Integer status;


}
