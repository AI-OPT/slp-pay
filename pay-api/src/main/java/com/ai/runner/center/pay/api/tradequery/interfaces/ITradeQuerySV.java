package com.ai.runner.center.pay.api.tradequery.interfaces;

import java.util.List;

import com.ai.runner.base.exception.CallerException;
import com.ai.runner.center.pay.api.tradequery.param.BatchNoParam;
import com.ai.runner.center.pay.api.tradequery.param.MerchantOrderIdParam;
import com.ai.runner.center.pay.api.tradequery.param.TradeOrderIdParam;
import com.ai.runner.center.pay.api.tradequery.param.TradeRecord;

/**
 * 支付中心交易记录查询服务
 *
 * Date: 2015年10月29日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public interface ITradeQuerySV {
    
    /**
     * 按商户订单号查询单笔交易记录
     * @param param 商户订单号，租户ID
     * @return 交易记录
     * @throws CallerException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode PAY_0005
     */
    TradeRecord querySingleTradeRecordByMerchantOrderId(MerchantOrderIdParam param) throws CallerException; 

    /**
     * 按内部交易订单号查询单笔交易记录
     * @param param 内部交易订单号
     * @return 交易记录
     * @throws CallerException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod
     * @ApiCode PAY_0006
     */
    TradeRecord querySingleTradeRecordByTradeOrderId(TradeOrderIdParam param) throws CallerException; 
    
    /**
     * 查询同一批次的交易记录
     * @param param 批次号
     * @return 交易记录列表
     * @throws CallerException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod 
     * @ApiCode PAY_0013 
     */
    List<TradeRecord> queryTradeRecordsByBatchNo(BatchNoParam param) throws CallerException; 
}
