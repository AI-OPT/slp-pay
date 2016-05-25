package com.ai.runner.center.pay.util;

import java.util.List;

import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;
import com.ai.runner.center.pay.api.terminalorgrelquery.param.TerminalOrgRelVo;
import com.ai.runner.center.pay.constants.CacheNSMapper;
import com.alibaba.fastjson.JSONArray;

/**
 * 从缓存中获取终端与支付机构关系对象
 *
 * Date: 2015年11月5日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public final class TerminalOrgRelUtil {

    private TerminalOrgRelUtil() {
        
    }
    
    public static List<TerminalOrgRelVo> getTerminalOrgRels(String tenantId, String requestSource) {
        ICacheClient cacheClient = CacheFactoryUtil
                .getCacheClient(CacheNSMapper.CACHE_PAY_TERMINAL_ORG_REL);
        String key = tenantId + "." + requestSource;
        String data = cacheClient.hget(CacheNSMapper.CACHE_PAY_TERMINAL_ORG_REL, key);
        return JSONArray.parseArray(data, TerminalOrgRelVo.class);
    }
}
