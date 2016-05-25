package com.ai.runner.center.pay.api.tenantconfig.interfaces;
import java.util.List;

import com.ai.runner.base.exception.CallerException;
import com.ai.runner.center.pay.api.tenantconfig.param.TenantConfigParam;
import com.ai.runner.center.pay.api.tenantconfig.param.TenantConfigQryParam;


/**
 * 租户配置信息服务
 * Date: 2015年12月10日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author LiangMeng
 */
public interface ITenantConfigSV {

    /**
     * 创建租户配置信息
     * @throws CallerException 可能抛出的异常信息
     * @author LiangMeng
     * @ApiDocMethod 
     * @ApiCode PAY_0009
     */
    void createTenantConfig(TenantConfigParam param) throws CallerException;
    /**
     * 修改租户配置信息
     * @param param
     * @throws CallerException
     * @author LiangMeng
     * @ApiDocMethod
     * @ApiCode PAY_0010
     */
    void createOrModifyTenantConfig(TenantConfigParam param) throws CallerException;
    
    /**
     * 通过租户id查询租户配置信息
     * @throws CallerException 可能抛出的异常信息
     * @author LiangMeng
     * @ApiDocMethod
     * @ApiCode PAY_0011
     */
    List<TenantConfigParam> queryTenantConfigByTenantId(TenantConfigQryParam param) throws CallerException;
    /**
     * 通过配置类型查询租户配置信息
     * @throws CallerException 可能抛出的异常信息
     * @author LiangMeng
     * @ApiDocMethod
     * @ApiCode PAY_0012
     */
    TenantConfigParam queryTenantConfigByConfigTypeId(TenantConfigQryParam param) throws CallerException;
    
}
