package com.liudehuang.pay.dao;

import com.liudehuang.pay.entity.AliConfiguration;
import com.liudehuang.pay.entity.WxConfiguration;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author liudehuang
 * @date 2019/5/13 9:24
 */
@Repository
public interface PayDao {
    /**
     * 获取ali支付配置
     * @param systemId
     * @param payCode
     * @return
     */
    AliConfiguration getAliConfiguration(@Param("systemId") String systemId, @Param("payCode") String payCode);

    /**
     * 获取微信支付配置
     * @param systemId
     * @param payCode
     * @return
     */
    WxConfiguration getWxConfiguration(@Param("systemId") String systemId, @Param("payCode") String payCode);
}
