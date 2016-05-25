package com.ai.runner.center.pay.api.tradequery.param;

import com.ai.runner.base.vo.BaseInfo;

/**
 * 商户订单号入参.<br>
 * Date: 2015年8月18日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public class MerchantOrderIdParam extends BaseInfo {

    private static final long serialVersionUID = -5611965352621441423L;

    /**
     * 租户订单号，必填项
     */
    private String merchantOrderId;

    public String getMerchantOrderId() {
        return merchantOrderId;
    }

    public void setMerchantOrderId(String merchantOrderId) {
        this.merchantOrderId = merchantOrderId;
    }
}
