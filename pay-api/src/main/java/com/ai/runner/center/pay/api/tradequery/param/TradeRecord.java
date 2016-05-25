package com.ai.runner.center.pay.api.tradequery.param;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 交易记录.<br>
 * Date: 2015年8月18日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public class TradeRecord implements Serializable {
    
    private static final long serialVersionUID = 8531164767863918124L;

    /**
     * 支付流水号
     */
    private Long payId;
    
    /**
     * 租户ID
     */
    private String tenantId;
    
    /**
     * 订单号
     */
    private String orderId;
    
    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 原订单号
     */
    private String oriOrderId;

    /**
     * 内部交易订单号
     */
    private String tradeOrderId;

    /**
     * 订单名称
     */
    private String subject;

    /**
     * 终端来源:<br>
     * 1:web<br>
     * 2:wap<br>
     * 3:app<br>
     * 4:微信<br>
     */
    private String requestSource;

    /**
     * 支付请求类型:<br>
     * 1:支付 <br>
     * 2:退款 <br>
     * 3:提现 <br>
     */
    private Integer payRequestType;

    /**
     * 订单金额
     */
    private Long payAmount;
    
    /**
     * 支付机构编码
     */
    private String payOrgId;

    /**
     * 第三方支付平台交易流水号
     */
    private String payOrgSerial;
    
    /**
     * 服务器异步通知地址
     */
    private String notifyUrl;

    /**
     * 页面跳转同步通知地址
     */
    private String returnUrl;

    /**
     * 中断地址
     */
    private String merchantUrl;

    /**
     * 通知ID
     */
    private String notifyId;

    /**
     * 发起支付时间(选择支付平台后点确认支付时的时间)
     */
    private Timestamp createTime;

    /**
     * 支付状态:<br>
     * -1：申请支付<br>
     * 1：待支付（向第三方支付发起支付）<br>
     * 2：支付交易成功<br>
     * 3：支付失败<br>
     * 5：申请退款<br>
     * 6：接受退款申请<br>
     * 7：退款申请失败 <br>
     * 8：退款成功<br>
     * 9：退款失败<br>
     * 10：退款到账<br>
     * 11：提现成功<br>
     * 12：提现失败<br>
     */
    private Integer status;

    /**
     * 最后状态变更的日期
     */
    private Timestamp statusChgTime;

    /**
     * 对帐、轧帐的状态:<br>
     * 0：未对账<br>
     * 1：两边对账一致<br>
     * 2：对端多出未处理<br>
     * 3：我端多出未处理<br>
     * 4：对端多出已处理<br>
     * 5：我端多出已处理<br>
     */
    private Integer checkStatus;

    /**
     * 对帐/轧帐的时间，只有在check_status为<br>
     * 已对帐的情况下有意义。
     */
    private Timestamp checkTime;
    
    /**
     * 付款详细数据
     */
    private String detailData; 

    /**
     * 保留字段1
     */
    private String reserved1;

    /**
     * 保留字段2
     */
    private String reserved2;

    /**
     * 保留字段3
     */
    private String reserved3;

    public Long getPayId() {
        return payId;
    }

    public void setPayId(Long payId) {
        this.payId = payId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getOriOrderId() {
        return oriOrderId;
    }

    public void setOriOrderId(String oriOrderId) {
        this.oriOrderId = oriOrderId;
    }

    public String getTradeOrderId() {
        return tradeOrderId;
    }

    public void setTradeOrderId(String tradeOrderId) {
        this.tradeOrderId = tradeOrderId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(String requestSource) {
        this.requestSource = requestSource;
    }

    public Integer getPayRequestType() {
        return payRequestType;
    }

    public void setPayRequestType(Integer payRequestType) {
        this.payRequestType = payRequestType;
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayOrgId() {
        return payOrgId;
    }

    public void setPayOrgId(String payOrgId) {
        this.payOrgId = payOrgId;
    }

    public String getPayOrgSerial() {
        return payOrgSerial;
    }

    public void setPayOrgSerial(String payOrgSerial) {
        this.payOrgSerial = payOrgSerial;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getMerchantUrl() {
        return merchantUrl;
    }

    public void setMerchantUrl(String merchantUrl) {
        this.merchantUrl = merchantUrl;
    }

    public String getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(String notifyId) {
        this.notifyId = notifyId;
    }

    public Timestamp getCreateTime() {
        if(createTime == null) {
            return null;
        }
        
        return new Timestamp(createTime.getTime());
    }

    public void setCreateTime(Timestamp createTime) {
        if(createTime != null) {
            this.createTime = new Timestamp(createTime.getTime());
        }
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getStatusChgTime() {
        if(statusChgTime == null) {
            return null;
        }
        
        return new Timestamp(statusChgTime.getTime());
    }

    public void setStatusChgTime(Timestamp statusChgTime) {
        if(statusChgTime != null) {
            this.statusChgTime = new Timestamp(statusChgTime.getTime());
        }
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Timestamp getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
    }

    public String getDetailData() {
        return detailData;
    }

    public void setDetailData(String detailData) {
        this.detailData = detailData;
    }

    public String getReserved1() {
        return reserved1;
    }

    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    public String getReserved3() {
        return reserved3;
    }

    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3;
    }
}
