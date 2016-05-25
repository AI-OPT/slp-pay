package com.ai.runner.center.pay.cache;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.opt.sdk.cache.base.AbstractCache;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;
import com.ai.runner.center.pay.constants.CacheNSMapper;
import com.ai.runner.center.pay.dao.mapper.bo.PayTenantInfo;
import com.ai.runner.center.pay.dao.mapper.bo.PayTenantInfoCriteria;
import com.ai.runner.center.pay.dao.mapper.factory.MapperFactory;
import com.ai.runner.center.pay.util.CacheFactoryUtil;
import com.alibaba.fastjson.JSON;

/**
 * 支付中心管理的租户信息缓存实现类
 * 
 * Date: 2015年11月5日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
@Component
public class PayTenantInfoCache extends AbstractCache {

    @Override
    public void write() throws Exception {
        List<PayTenantInfo> tenantInfos = MapperFactory.getPayTenantInfoMapper().selectByExample(
                new PayTenantInfoCriteria());
        if (CollectionUtil.isEmpty(tenantInfos)) {
            return;
        }

        ICacheClient cacheClient = CacheFactoryUtil
                .getCacheClient(CacheNSMapper.CACHE_PAY_TENANT_INFO);
        for (PayTenantInfo tenantInfo : tenantInfos) {
            String keyOne = tenantInfo.getTenantId();
            String keyTwo = tenantInfo.getPartnerId();
            String tenantInfoJson = JSON.toJSONString(tenantInfo);
            cacheClient.hset(CacheNSMapper.CACHE_PAY_TENANT_INFO, keyOne, tenantInfoJson);
            cacheClient.hset(CacheNSMapper.CACHE_PAY_TENANT_INFO, keyTwo, tenantInfoJson);
        }
    }

}
