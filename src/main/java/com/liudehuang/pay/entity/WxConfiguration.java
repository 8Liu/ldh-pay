package com.liudehuang.pay.entity;

import lombok.Data;

/**
 * @author liudehuang
 * @date 2019/5/13 13:24
 */
@Data
public class WxConfiguration extends Configuration{
    /**
     * 自增id
     */
    private Integer id;
    /**
     * 主键id
     */
    private String fid;
    /**
     * 微信appId
     */
    private String appId;
    /**
     * 微信商户号
     */
    private String mchId;
    /**
     * 微信商户密钥
     */
    private String mchKey;
    /**
     * 签名加密类型
     */
    private String signType;
    /**
     * 编码
     */
    private String charset;
    /**
     * 网关地址
     */
    private String gateway;
    /**
     * 支付方式
     */
    private String payCode;
    /**
     * 商户主体
     */
    private String merchant;
    /**
     * 该微信支付配置是否启用
     */
    private Integer status;

}
