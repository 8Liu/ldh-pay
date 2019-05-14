package com.liudehuang.pay.enums;

/**
 * @author liudehuang
 * @date 2019/5/13 14:22
 */
public enum  PayCodeEnum {
    ALISDK(""),

    ALIQR("com.liudehuang.pay.strategy.impl.AliQrPayStrategyImpl"),

    WXSDK(""),

    WXQR("");
    private String className;

    PayCodeEnum(String className){
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
