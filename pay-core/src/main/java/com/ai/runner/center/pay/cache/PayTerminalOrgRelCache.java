package com.ai.runner.center.pay.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ai.opt.sdk.cache.base.AbstractCache;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;
import com.ai.runner.center.pay.api.terminalorgrelquery.param.TerminalOrgRelVo;
import com.ai.runner.center.pay.constants.CacheNSMapper;
import com.ai.runner.center.pay.dao.mapper.bo.PayTerminalOrgRel;
import com.ai.runner.center.pay.dao.mapper.bo.PayTerminalOrgRelCriteria;
import com.ai.runner.center.pay.dao.mapper.factory.MapperFactory;
import com.ai.runner.center.pay.util.CacheFactoryUtil;
import com.alibaba.fastjson.JSON;

/**
 * 终端与支付机构关系缓存
 *
 * Date: 2015年11月5日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
@Component
public class PayTerminalOrgRelCache extends AbstractCache {

    @Override
    public void write() throws Exception {
        List<PayTerminalOrgRel> payTerminalOrgRelList = MapperFactory.getChgTerminalOrgRelMapper()
                .selectByExample(new PayTerminalOrgRelCriteria());
        if (CollectionUtil.isEmpty(payTerminalOrgRelList)) {
            return;
        }

        ICacheClient cacheClient = CacheFactoryUtil
                .getCacheClient(CacheNSMapper.CACHE_PAY_TERMINAL_ORG_REL);

        Map<String, List<TerminalOrgRelVo>> terminalOrgRelVoMap = new HashMap<String, List<TerminalOrgRelVo>>();
        for (PayTerminalOrgRel payTerminalOrgRel : payTerminalOrgRelList) {
            TerminalOrgRelVo relVo = new TerminalOrgRelVo();
            relVo.setTenantId(payTerminalOrgRel.getTenantId());
            relVo.setRequestSource(payTerminalOrgRel.getRequestSource());
            relVo.setPayOrgCode(payTerminalOrgRel.getPayOrgCode());
            relVo.setIcoName(payTerminalOrgRel.getIcoName());
            String key = payTerminalOrgRel.getTenantId() + "."
                    + payTerminalOrgRel.getRequestSource();
            List<TerminalOrgRelVo> relVoList = terminalOrgRelVoMap.get(key);
            if(relVoList == null) {
                relVoList = new ArrayList<TerminalOrgRelVo>();
                terminalOrgRelVoMap.put(key, relVoList);
            }
            relVoList.add(relVo);
        }

        for(Map.Entry<String, List<TerminalOrgRelVo>> entry : terminalOrgRelVoMap.entrySet()) {
            cacheClient.hset(CacheNSMapper.CACHE_PAY_TERMINAL_ORG_REL, entry.getKey(),
                    JSON.toJSONString(entry.getValue()));
        }
    }

}
