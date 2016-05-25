package com.ai.runner.center.pay.api.tenantconfig.param;

import com.ai.runner.base.vo.BaseInfo;
/**
 * 租户配置信息维护参数
 * Date: 2015年12月10日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author LiangMeng
 */
public class TenantConfigParam extends BaseInfo {
    private static final long serialVersionUID = 8596778056278427146L;
    /**
     * 合作方ID
     */
    private String partnerId;
    /**
     * 配置类型
     */
    private String configType;
    /**
     * 配置信息
     */
    private String configInfo;
    /**
     * 状态
     */
    private String state;

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId == null ? null : partnerId.trim();
    }

    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType == null ? null : configType.trim();
    }

    public String getConfigInfo() {
        return configInfo;
    }

    public void setConfigInfo(String configInfo) {
        this.configInfo = configInfo == null ? null : configInfo.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}