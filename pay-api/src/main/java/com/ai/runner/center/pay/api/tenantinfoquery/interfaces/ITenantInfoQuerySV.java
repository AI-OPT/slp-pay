package com.ai.runner.center.pay.api.tenantinfoquery.interfaces;

import com.ai.runner.base.exception.CallerException;
import com.ai.runner.center.pay.api.tenantinfoquery.param.PartnerInfoParam;
import com.ai.runner.center.pay.api.tenantinfoquery.param.TenantInfoParam;


/**
 * 合作方信息查询服务
 *
 * Date: 2015年11月5日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public interface ITenantInfoQuerySV {

    /**
     * 获取分配的合作方编码
     * @param param 租户ID
     * @return 合作方编码
     * @throws CallerException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode PAY_0007
     */
    String getPartnerId(TenantInfoParam param) throws CallerException;
    
    /**
     * 通过合作方编码查询对应的租户信息
     * @param partnerId 合作方编码
     * @return 租户ID
     * @throws CallerException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode PAY_0008
     */
    String getTenantId(PartnerInfoParam param) throws CallerException;
    
}
