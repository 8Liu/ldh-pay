package com.liudehuang.pay.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author liudehuang
 * @date 2019/5/13 13:50
 */
@Data
public class PayMentParam {
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 系统id
     */
    private String systemId;
    /**
     * 支付类型:ALISDK/ALIQR
     */
    private String payCode;
    /**
     * 订单描述
     */
    private String subject;
    /**
     * 价格
     */
    private BigDecimal amount;
}
