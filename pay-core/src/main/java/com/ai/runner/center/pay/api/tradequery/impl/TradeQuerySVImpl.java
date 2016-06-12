package com.ai.runner.center.pay.api.tradequery.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.opt.sdk.util.StringUtil;
import com.ai.runner.base.exception.BusinessException;
import com.ai.runner.base.exception.CallerException;
import com.ai.runner.center.pay.api.tradequery.interfaces.ITradeQuerySV;
import com.ai.runner.center.pay.api.tradequery.param.BatchNoParam;
import com.ai.runner.center.pay.api.tradequery.param.MerchantOrderIdParam;
import com.ai.runner.center.pay.api.tradequery.param.TradeOrderIdParam;
import com.ai.runner.center.pay.api.tradequery.param.TradeRecord;
import com.ai.runner.center.pay.constants.ExceptCodeConstants;
import com.ai.runner.center.pay.service.business.interfaces.ITradeQueryCombSV;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * 支付中心交易记录查询服务
 *
 * Date: 2015年10月29日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
@Service
@Component
public class TradeQuerySVImpl implements ITradeQuerySV {

    private static final Log LOG = LogFactory.getLog(TradeQuerySVImpl.class);
    
    @Autowired
    private ITradeQueryCombSV tradeQueryCombSV;
    
    @Override
    public TradeRecord querySingleTradeRecordByMerchantOrderId(MerchantOrderIdParam param)
            throws CallerException {
        LOG.info("按商户订单号查询单笔交易记录开始");
        TradeRecord record = null;
        if (param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:单笔交易查询参数不能为空");
        }
        
//        if (StringUtil.isBlank(param.getTenantId())) {
//            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
//        }
//        
        if (StringUtil.isBlank(param.getMerchantOrderId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:商户订单号不能为空");
        }
        
        record = tradeQueryCombSV.querySingleTradeRecordByMerchantOrderId(param.getTenantId(),
                param.getMerchantOrderId());
        LOG.info("按商户订单号查询单笔交易记录结束");        
        return record;
    }

    @Override
    public TradeRecord querySingleTradeRecordByTradeOrderId(TradeOrderIdParam param)
            throws CallerException {
        LOG.info("按内部交易订单号查询单笔交易记录开始");
        TradeRecord record = null;
        if (param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:单笔交易查询参数不能为空");
        }
                
        if (StringUtil.isBlank(param.getTradeOrderId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:内部交易订单号不能为空");
        }
        
        record = tradeQueryCombSV.querySingleTradeRecordByTradeOrderId(param.getTenantId(),
                param.getTradeOrderId());
        LOG.info("按内部交易订单号查询单笔交易记录结束");        
        return record;
    }

    @Override
    public List<TradeRecord> queryTradeRecordsByBatchNo(BatchNoParam param) throws CallerException {
        LOG.info("查询同一批次的交易记录开始");
        if (param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:单笔交易查询参数不能为空");
        }
                
        if (StringUtil.isBlank(param.getBatchNo())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:批次号不能为空");
        }
        
        return tradeQueryCombSV.queryTradeRecordsByBatchNo(param.getTenantId(), param.getBatchNo(),
                param.getPayOrgSerial());
    }

}
