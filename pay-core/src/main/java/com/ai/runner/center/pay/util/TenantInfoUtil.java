package com.ai.runner.center.pay.util;

import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;
import com.ai.runner.center.pay.constants.CacheNSMapper;
import com.ai.runner.center.pay.dao.mapper.bo.PayTenantInfo;
import com.alibaba.fastjson.JSON;

/**
 * 从缓存中获取合作方信息
 *
 * Date: 2015年11月5日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public final class TenantInfoUtil {

    private TenantInfoUtil() {
        
    }
    
    /**
     * 获取合作方编码
     * @param tenantId
     * @return
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode
     */
    public static String getPartnerId(String tenantId) {
        ICacheClient cacheClient = CacheFactoryUtil
                .getCacheClient(CacheNSMapper.CACHE_PAY_TENANT_INFO);
        String data = cacheClient.hget(CacheNSMapper.CACHE_PAY_TENANT_INFO, tenantId);
        PayTenantInfo tenantInfo = JSON.parseObject(data, PayTenantInfo.class);
        if(tenantInfo == null) {
            return null;
        }
        
        return tenantInfo.getPartnerId();
    }
    
    /**
     * 通过合作方编码查询对应的租户ID
     * @param partnerId
     * @return
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode
     */
    public static String getTenantId(String partnerId) {
        ICacheClient cacheClient = CacheFactoryUtil
                .getCacheClient(CacheNSMapper.CACHE_PAY_TENANT_INFO);
        String data = cacheClient.hget(CacheNSMapper.CACHE_PAY_TENANT_INFO, partnerId);
        PayTenantInfo tenantInfo = JSON.parseObject(data, PayTenantInfo.class);
        if(tenantInfo == null) {
            return null;
        }
        
        return tenantInfo.getTenantId();
    }
}
