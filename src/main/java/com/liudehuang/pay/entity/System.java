package com.liudehuang.pay.entity;

import lombok.Data;

/**
 * @author liudehuang
 * @date 2019/5/13 9:08
 */
@Data
public class System {
    /**
     * 自增id
     */
    private Integer id;
    /**
     * 系统id
     */
    private String systemId;
    /**
     * 系统名称
     */
    private String systemName;
    /**
     * 商户主体
     */
    private String merchant;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 更新时间
     */
    private String updateTime;
}
