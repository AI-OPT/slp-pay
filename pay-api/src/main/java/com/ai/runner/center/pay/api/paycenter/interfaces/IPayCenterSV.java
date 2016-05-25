package com.ai.runner.center.pay.api.paycenter.interfaces;


import com.ai.runner.base.exception.CallerException;
import com.ai.runner.center.pay.api.paycenter.param.TradeModifyReq;
import com.ai.runner.center.pay.api.paycenter.param.TradeReq;


/**
 * 支付平台流水综合服务
 * Date: 2015年8月18日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public interface IPayCenterSV {

    /**
     * 创建交易记录
     * @param param 发起交易请求参数
     * @return 支付流水号
     * @throws CallerException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod 
     * @ApiCode PAY_0001
     */
    long createTradeRecord(TradeReq req) throws CallerException;
    
    /**
     * 修改交易记录
     * @param param 修改交易记录请求参数
     * @throws CallerException 可能抛出的异常信息
     * @author fanpw
     * @ApiDocMethod 
     * @ApiCode PAY_0002
     */
    void modifyTradeRecord(TradeModifyReq req) throws CallerException;
    
}
