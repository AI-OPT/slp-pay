package com.ai.runner.center.pay.api.tenantconfig.param;

import com.ai.runner.base.vo.BaseInfo;
/**
 * 租户配置信息查询参数
 * Date: 2015年12月10日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author LiangMeng
 */
public class TenantConfigQryParam extends BaseInfo {
    private static final long serialVersionUID = -2934283921250768599L;
    /**
     * 配置类型
     */
    private String configType;

    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType == null ? null : configType.trim();
    }

}