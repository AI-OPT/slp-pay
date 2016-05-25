package com.ai.runner.center.pay.service.business.interfaces;

import java.util.List;

import com.ai.runner.base.exception.BusinessException;
import com.ai.runner.center.pay.api.tradequery.param.TradeRecord;

/**
 * 交易记录查询业务实现
 * 
 * Date: 2015年10月29日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public interface ITradeQueryCombSV {

    /**
     * 按商户订单号查询单笔交易记录
     * @param tenantId
     * @param merchantOrderId
     * @return
     * @throws BusinessException
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode
     */
    TradeRecord querySingleTradeRecordByMerchantOrderId(String tenantId, String merchantOrderId)
            throws BusinessException;

    /**
     * 按内部交易订单号查询单笔交易记录
     * @param tenantId
     * @param tradeOrderId
     * @return
     * @throws BusinessException
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode
     */
    TradeRecord querySingleTradeRecordByTradeOrderId(String tenantId, String tradeOrderId)
            throws BusinessException;
    
    /**
     * 查询同一批次的交易记录
     * @param tenantId
     * @param batchNo
     * @param payOrgSerial
     * @return
     * @throws BusinessException
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode
     */
    List<TradeRecord> queryTradeRecordsByBatchNo(String tenantId, String batchNo,
            String payOrgSerial) throws BusinessException;
}
