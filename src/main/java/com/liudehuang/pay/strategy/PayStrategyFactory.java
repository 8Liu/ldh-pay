package com.liudehuang.pay.strategy;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author liudehuang
 * @date 2019/5/13 13:45
 */
public class PayStrategyFactory {
    private static Map<String, PayStrategy> strategyBean = new ConcurrentHashMap<String, PayStrategy>();

    public static PayStrategy getPayStrategy(String classAddres) {
        try {
            if (StringUtils.isEmpty(classAddres)) {
                return null;
            }
            PayStrategy beanPayStrategy = strategyBean.get(classAddres);
            if (beanPayStrategy != null) {
                return beanPayStrategy;
            }
            // 1.使用Java的反射机制初始化子类
            Class<?> forName = Class.forName(classAddres);
            // 2.反射机制初始化对象
            PayStrategy payStrategy = (PayStrategy) forName.newInstance();
            strategyBean.put(classAddres, payStrategy);
            return payStrategy;
        } catch (Exception e) {
            return null;
        }

    }
}
