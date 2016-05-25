package com.ai.runner.center.pay.api.tenantinfoquery.impl;

import org.springframework.stereotype.Component;

import com.ai.opt.sdk.util.StringUtil;
import com.ai.runner.base.exception.BusinessException;
import com.ai.runner.base.exception.CallerException;
import com.ai.runner.center.pay.api.tenantinfoquery.interfaces.ITenantInfoQuerySV;
import com.ai.runner.center.pay.api.tenantinfoquery.param.PartnerInfoParam;
import com.ai.runner.center.pay.api.tenantinfoquery.param.TenantInfoParam;
import com.ai.runner.center.pay.constants.ExceptCodeConstants;
import com.ai.runner.center.pay.util.TenantInfoUtil;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * 合作方信息查询服务
 *
 * Date: 2015年11月5日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
@Service
@Component
public class TenantInfoQuerySVImpl implements ITenantInfoQuerySV {
    
    @Override
    public String getPartnerId(TenantInfoParam param) throws CallerException {
        if (param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:合作方信息查询请求参数不能为空");
        }
        
        if (StringUtil.isBlank(param.getTenantId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        
        return TenantInfoUtil.getPartnerId(param.getTenantId());
    }

    @Override
    public String getTenantId(PartnerInfoParam param) throws CallerException {
        if (param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:租户信息查询请求参数不能为空");
        }
        
        if (StringUtil.isBlank(param.getPartnerId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:合作方编码不能为空");
        }
        
        return TenantInfoUtil.getTenantId(param.getPartnerId());
    }

}
