package com.ai.runner.center.pay.service.business.interfaces;

import com.ai.runner.base.exception.BusinessException;
import com.ai.runner.center.pay.api.paycenter.param.TradeModifyReq;
import com.ai.runner.center.pay.api.paycenter.param.TradeReq;


/**
 * 支付平台流水服务业务定义类
 * Date: 2015年8月18日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public interface IPayCenterCombSV {

    /**
     * 保存支付平台流水
     * @param req
     * @return
     * @throws BusinessException
     * @author fanpw
     * @ApiDocMethod
     */
    long savePayCenterLog(TradeReq req) throws BusinessException;
    
    /**
     * 更新支付平台流水
     * @param req
     * @throws BusinessException
     * @author fanpw
     * @ApiDocMethod
     */
    void updatePayCenterLog(TradeModifyReq req) throws BusinessException;
    
}
