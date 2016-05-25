package com.ai.runner.center.pay.util;

import com.ai.opt.sdk.components.sequence.util.SeqUtil;

/**
 * 支付中心序列工具类
 * Date: 2015年8月13日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public final class PaySeqUtil {
    
    private PaySeqUtil() {
        
    }
    
    /**
     * 获取支付流水号
     * @return
     * @author fanpw
     * @ApiDocMethod
     */
    public static Long createPayId() {
        return SeqUtil.getNewId("PAY_CENTER_LOG$PAY_ID$SEQ");
    }
}
