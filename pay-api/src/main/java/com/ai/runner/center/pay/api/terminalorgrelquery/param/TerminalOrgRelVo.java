package com.ai.runner.center.pay.api.terminalorgrelquery.param;

import java.io.Serializable;

/**
 * 终端与支付机构关系.<br>
 * Date: 2015年8月20日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public class TerminalOrgRelVo implements Serializable {

    private static final long serialVersionUID = 6686985535670751206L;

    /**
     * 租户ID
     */
    private String tenantId;

    /**
     * 终端来源:<br>
     * 1:web<br>
     * 2:wap<br>
     * 3:app<br>
     * 4:微信<br>
     */
    private String requestSource;

    /**
     * 支付机构代码
     */
    private String payOrgCode;

    /**
     * 图标名称
     */
    private String icoName;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(String requestSource) {
        this.requestSource = requestSource;
    }

    public String getPayOrgCode() {
        return payOrgCode;
    }

    public void setPayOrgCode(String payOrgCode) {
        this.payOrgCode = payOrgCode;
    }

    public String getIcoName() {
        return icoName;
    }

    public void setIcoName(String icoName) {
        this.icoName = icoName;
    }
}
