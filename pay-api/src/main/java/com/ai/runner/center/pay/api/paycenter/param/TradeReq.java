package com.ai.runner.center.pay.api.paycenter.param;

import com.ai.runner.base.vo.BaseInfo;

/**
 * 发起交易请求参数.<br>
 * Date: 2015年8月18日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public class TradeReq extends BaseInfo {
    
    private static final long serialVersionUID = -7071791805911991579L;

    /**
     * 订单号,必填
     */
    private String orderId;
    
    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 原订单号<br>
     * 交易类型为退款时必填<br>
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
     * 订单金额,必填
     */
    private Long payAmount;

    /**
     * 支付机构编码
     */
    private String payOrgId;
    
    /**
     * 第三方支付平台交易流水号<br>
     * 交易类型为退款时必填<br>
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
