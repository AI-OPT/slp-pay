package com.ai.runner.center.pay.service.atom.interfaces;

import java.util.List;

import com.ai.runner.center.pay.dao.mapper.bo.PayTenantConfig;

/**
 * 支付机构信息服务接口
 * Date: 2015年12月10日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author LiangMeng
 */
public interface IPayTenantConfigSV {

    void savePayTenantConfig(PayTenantConfig config); 
    
    void createOrModifyTenantConfig(PayTenantConfig config); 
    
    List<PayTenantConfig> getPayTenantConfigByTenantId(String tenantId);
    
    PayTenantConfig getPayTenantConfigByConfigType(String tenantId, String configType);
}
