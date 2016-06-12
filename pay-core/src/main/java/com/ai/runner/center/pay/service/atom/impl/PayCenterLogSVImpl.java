package com.ai.runner.center.pay.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.runner.center.pay.dao.mapper.bo.PayCenterLog;
import com.ai.runner.center.pay.dao.mapper.bo.PayCenterLogCriteria;
import com.ai.runner.center.pay.dao.mapper.bo.PayCenterLogCriteria.Criteria;
import com.ai.runner.center.pay.dao.mapper.factory.MapperFactory;
import com.ai.runner.center.pay.service.atom.interfaces.IPayCenterLogSV;

/**
 * 支付中心流水基础服务实现类
 * Date: 2015年8月18日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
@Component
public class PayCenterLogSVImpl implements IPayCenterLogSV {

    @Override
    public void savePayCenterLog(PayCenterLog log) {
        MapperFactory.getPayCenterLogMapper().insert(log);
    }

    @Override
    public void modifyPayCenterLog(PayCenterLog log) {
        PayCenterLogCriteria sql = new PayCenterLogCriteria();
        Criteria criteria = sql.createCriteria(); 
        criteria.andTenantIdEqualTo(log.getTenantId());
        criteria.andOrderIdEqualTo(log.getOrderId());
        MapperFactory.getPayCenterLogMapper().updateByExampleSelective(log, sql);
    }

    @Override
    public PayCenterLog getPayCenterLogByMerchantOrderId(String tenantId, String merchantOrderId) {
        PayCenterLogCriteria sql = new PayCenterLogCriteria();
        Criteria criteria = sql.createCriteria();  
        if(!StringUtil.isBlank(tenantId)) {
            criteria.andTenantIdEqualTo(tenantId);
        }
        criteria.andOrderIdEqualTo(merchantOrderId);   
        List<PayCenterLog> payCenterLogs = MapperFactory.getPayCenterLogMapper().selectByExample(sql);
        if(CollectionUtil.isEmpty(payCenterLogs)) {
            return null;
        }
        
        return payCenterLogs.get(0);
    }
    
    @Override
    public PayCenterLog getPayCenterLogByTradeOrderId(String tenantId, String tradeOrderId) {
        PayCenterLogCriteria sql = new PayCenterLogCriteria();
        Criteria criteria = sql.createCriteria(); 
        if(!StringUtil.isBlank(tenantId)) {
            criteria.andTenantIdEqualTo(tenantId);
        }
        criteria.andTradeOrderIdEqualTo(tradeOrderId);
        List<PayCenterLog> payCenterLogs = MapperFactory.getPayCenterLogMapper().selectByExample(sql);
        if(CollectionUtil.isEmpty(payCenterLogs)) {
            return null;
        }
        
        return payCenterLogs.get(0);    
    }    

    @Override
    public PayCenterLog getPayCenterLogByPayId(long payId) {
        return MapperFactory.getPayCenterLogMapper().selectByPrimaryKey(payId);
    }

    @Override
    public List<PayCenterLog> getPayCenterLogsByBatchNo(String tenantId, String batchNo,
            String payOrgSerial) {
        PayCenterLogCriteria sql = new PayCenterLogCriteria();
        Criteria criteria = sql.createCriteria();  
        if(!StringUtil.isBlank(tenantId)) {
            criteria.andTenantIdEqualTo(tenantId);
        }
        criteria.andBatchNoEqualTo(batchNo);
        if(!StringUtil.isBlank(payOrgSerial)) {
            criteria.andPayOrgSerialEqualTo(payOrgSerial);
        }
        return MapperFactory.getPayCenterLogMapper().selectByExample(sql);
    }

}
