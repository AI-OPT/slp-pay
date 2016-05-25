package com.ai.runner.center.pay.service.business.interfaces;

import java.util.List;

import com.ai.runner.base.exception.BusinessException;
import com.ai.runner.center.pay.api.tenantconfig.param.TenantConfigParam;
import com.ai.runner.center.pay.api.tenantconfig.param.TenantConfigQryParam;


/**
 * 租户配置服务
 * Date: 2015年12月10日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author LiangMeng
 */
public interface ITenantConfigCombSV {

    /**
     * 创建租户配置信息
     * @param param
     * @throws BusinessException
     * @author LiangMeng
     * @ApiDocMethod
     */
    void createTenantConfig(TenantConfigParam param) throws BusinessException;
    /**
     * 修改租户配置信息
     * @param param
     * @throws BusinessException
     * @author LiangMeng
     * @ApiDocMethod
     */
    void createOrModifyTenantConfig(TenantConfigParam param) throws BusinessException;
    
    /**
     * 通过租户id查询租户配置信息
     * @param param
     * @return
     * @throws BusinessException
     * @author LiangMeng
     * @ApiDocMethod
     */
    List<TenantConfigParam> queryTenantConfigByTenantId(TenantConfigQryParam param) throws BusinessException;
    /**
     * 通过配置类型查询租户配置信息
     * @param param
     * @return
     * @throws BusinessException
     * @author LiangMeng
     * @ApiDocMethod
     */
    TenantConfigParam queryTenantConfigByConfigTypeId(TenantConfigQryParam param) throws BusinessException;
    
}
