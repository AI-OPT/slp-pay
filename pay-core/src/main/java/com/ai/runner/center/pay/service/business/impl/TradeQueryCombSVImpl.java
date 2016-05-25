package com.ai.runner.center.pay.service.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ai.opt.sdk.util.BeanUtils;
import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.runner.base.exception.BusinessException;
import com.ai.runner.center.pay.api.tradequery.param.TradeRecord;
import com.ai.runner.center.pay.dao.mapper.bo.PayCenterLog;
import com.ai.runner.center.pay.service.atom.interfaces.IPayCenterLogSV;
import com.ai.runner.center.pay.service.business.interfaces.ITradeQueryCombSV;

/**
 * 交易记录查询业务具体实现
 * 
 * Date: 2015年10月29日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
@Service
@Transactional
public class TradeQueryCombSVImpl implements ITradeQueryCombSV {

    @Autowired
    private IPayCenterLogSV payCenterLogSV;

    @Override
    public TradeRecord querySingleTradeRecordByMerchantOrderId(String tenantId,
            String merchantOrderId) throws BusinessException {
        PayCenterLog payCenterLog = this.payCenterLogSV.getPayCenterLogByMerchantOrderId(tenantId,
                merchantOrderId);
        if (payCenterLog == null) {
            return null;
        }
        TradeRecord record = new TradeRecord();
        BeanUtils.copyProperties(record, payCenterLog);
        return record;
    }

    @Override
    public TradeRecord querySingleTradeRecordByTradeOrderId(String tenantId, String tradeOrderId)
            throws BusinessException {
        PayCenterLog payCenterLog = this.payCenterLogSV.getPayCenterLogByTradeOrderId(tenantId,
                tradeOrderId);
        if (payCenterLog == null) {
            return null;
        }
        TradeRecord record = new TradeRecord();
        BeanUtils.copyProperties(record, payCenterLog);
        return record;
    }

    @Override
    public List<TradeRecord> queryTradeRecordsByBatchNo(String tenantId, String batchNo,
            String payOrgSerial) throws BusinessException {
        List<TradeRecord> tradeRecordList = new ArrayList<TradeRecord>();
        List<PayCenterLog> payCenterLogs = this.payCenterLogSV.getPayCenterLogsByBatchNo(tenantId,
                batchNo, payOrgSerial);
        if (CollectionUtil.isEmpty(payCenterLogs)) {
            return tradeRecordList;
        }

        for (PayCenterLog payCenterLog : payCenterLogs) {
            TradeRecord record = new TradeRecord();
            BeanUtils.copyProperties(record, payCenterLog);
            tradeRecordList.add(record);
        }
        return tradeRecordList;
    }

}
