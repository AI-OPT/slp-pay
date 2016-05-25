package com.ai.runner.center.pay.test.api.paycenter.impl;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.runner.center.pay.api.paycenter.interfaces.IPayCenterSV;
import com.ai.runner.center.pay.api.paycenter.param.TradeModifyReq;
import com.ai.runner.center.pay.api.paycenter.param.TradeReq;
import com.alibaba.fastjson.JSON;

/**
 * 支付平台流水服务测试类
 * Date: 2015年8月18日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class PayCenterSVImplTest {

    private static final Log LOG = LogFactory.getLog(PayCenterSVImplTest.class);
    
    @Autowired
    private IPayCenterSV payCenterSV;
    
    /**
     * 新增支付平台流水
     * 测试案例1：
     * 传入正确的支付平台流水参数，验证
     * 1.能够正确地返回支付流水号
     * 2.验证数据库pay_center_log, pay_center_log_state新增一条支付流水记录
     * 
     * @author fanpw
     * @ApiDocMethod
     */
    @Test
    public void testCreateTradeRecord() {
        TradeReq req =  new TradeReq();
        //req.setTenantId("BIS-ST");
        req.setOrderId("T20150907105820");
        req.setTradeOrderId("BIS-STT20150907105820");
        req.setSubject("缴费充值");
        req.setRequestSource("2");
        req.setPayRequestType(1);
        req.setPayAmount(10l);
        req.setPayOrgId("");
        req.setNotifyUrl("http://10.1.228.222:14111/Runner-Pay/nettenpay/spNotify");
        req.setReturnUrl("http://10.1.228.222:14111/Runner-Pay/nettenpay/spReturn");
        req.setMerchantUrl("http://localhost:8080/Payment-Platform/nettenpay/netTest");
        LOG.info(JSON.toJSONString(req));
        long payId = payCenterSV.createTradeRecord(req);
        assertTrue(payId > 0);
    }
    
    @Test
    public void testModifyTradeRecord() {
        TradeModifyReq req = new TradeModifyReq();
        req.setTenantId("BIS-ST");
        req.setOrderId("T20150907105820");
        req.setBuyerEmail("15010207836");
        req.setDrawEmail("hxzfb@huaxiangtelecom.cn");
        req.setStatus(2);
        req.setPayOrgSerial("2015090700001000590060050583");
        req.setNotifyId("123446");
        LOG.info(JSON.toJSONString(req));
        this.payCenterSV.modifyTradeRecord(req);
    }
   
}
