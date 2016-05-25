package com.ai.runner.center.pay.test.api.tenantinfoquery.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.opt.sdk.appserver.CacheServiceStart;
import com.ai.runner.center.pay.api.tenantinfoquery.interfaces.ITenantInfoQuerySV;
import com.ai.runner.center.pay.api.tenantinfoquery.param.PartnerInfoParam;
import com.ai.runner.center.pay.api.tenantinfoquery.param.TenantInfoParam;
import com.alibaba.fastjson.JSON;

/**
 * 合作方信息查询服务测试类
 *
 * Date: 2015年11月5日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class TenantInfoQuerySVImplTest {
    
    private static final Log LOG = LogFactory.getLog(TenantInfoQuerySVImplTest.class);
    
    @Autowired
    private ITenantInfoQuerySV tenantInfoQuerySV;
    
    @Test
    public void testWrite() throws Exception {
        CacheServiceStart.main(new String[] {});
    }

    @Test
    public void testGetPartnerId() {
        TenantInfoParam param = new TenantInfoParam();
        param.setTenantId("BIS-ST");
        LOG.info(JSON.toJSONString(param));
        String partnerId = this.tenantInfoQuerySV.getPartnerId(param);
        LOG.info("返回的合作方编码： " + partnerId);
    }

    @Test
    public void testGetTenantId() {
        PartnerInfoParam param = new PartnerInfoParam();
        param.setPartnerId("00001");
        LOG.info(JSON.toJSONString(param));
        String tenantId = this.tenantInfoQuerySV.getTenantId(param);
        LOG.info("返回的租户ID： " + tenantId);
    }

}
