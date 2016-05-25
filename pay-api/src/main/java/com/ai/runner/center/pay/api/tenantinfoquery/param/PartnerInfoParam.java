package com.ai.runner.center.pay.api.tenantinfoquery.param;

import java.io.Serializable;

/**
 * 合作方信息参数
 *
 * Date: 2015年11月5日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author fanpw
 */
public class PartnerInfoParam implements Serializable {

    private static final long serialVersionUID = -2293538400210918799L;
    
    /**
     * 合作方编码
     */
    private String partnerId;

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

}
