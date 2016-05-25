package com.ai.runner.center.pay.test.api.tradequery.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.runner.center.pay.api.tradequery.interfaces.ITradeQuerySV;
import com.ai.runner.center.pay.api.tradequery.param.BatchNoParam;
import com.ai.runner.center.pay.api.tradequery.param.MerchantOrderIdParam;
import com.ai.runner.center.pay.api.tradequery.param.TradeOrderIdParam;
import com.ai.runner.center.pay.api.tradequery.param.TradeRecord;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

/**
 * 支付中心交易记录查询服务测试类
 *
 * Date: 2015年10月29日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/context/core-context.xml" })
public class TradeQuerySVImplTest {

    private static final Log LOG = LogFactory.getLog(TradeQuerySVImplTest.class);
    
    @Autowired
    private ITradeQuerySV tradeQuerySV;
    
    @Test
    public void testQuerySingleTradeRecordByMerchantOrderId() {
        MerchantOrderIdParam qryParam = new MerchantOrderIdParam();
        qryParam.setTenantId("BIS-ST");
        qryParam.setMerchantOrderId("T20150907105820");
        LOG.info(JSON.toJSONString(qryParam));
        TradeRecord record = this.tradeQuerySV.querySingleTradeRecordByMerchantOrderId(qryParam);
        LOG.info(JSON.toJSONString(record));
    }
    
    @Test
    public void testQuerySingleTradeRecordByTradeOrderId() {
        TradeOrderIdParam qryParam = new TradeOrderIdParam();
        //qryParam.setTenantId("BIS-ST");
        qryParam.setTradeOrderId("BIS-STT20150907105820");
        LOG.info(JSON.toJSONString(qryParam));
        TradeRecord record = this.tradeQuerySV.querySingleTradeRecordByTradeOrderId(qryParam);
        LOG.info(JSON.toJSONString(record));
    }
    
    @Test
    public void testQueryTradeRecordsByBatchNo() {
        BatchNoParam qryParam = new BatchNoParam();
        qryParam.setTenantId("BIS-ST");
        qryParam.setBatchNo("2015111000001747105");
        LOG.info(JSON.toJSONString(qryParam));
        List<TradeRecord> tradeRecordList = this.tradeQuerySV.queryTradeRecordsByBatchNo(qryParam);
        LOG.info(JSONArray.toJSONString(tradeRecordList));
    }
}
