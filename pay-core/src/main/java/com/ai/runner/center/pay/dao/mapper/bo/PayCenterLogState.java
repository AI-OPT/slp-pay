package com.ai.runner.center.pay.dao.mapper.bo;

import java.sql.Timestamp;

public class PayCenterLogState {
    private Long payId;

    private String tenantId;

    private String orderId;

    private String batchNo;

    private String oriOrderId;

    private String tradeOrderId;

    private String subject;

    private String requestSource;

    private Integer payRequestType;

    private Long payAmount;

    private String payOrgId;

    private String payOrgSerial;

    private String buyerEmail;

    private String returnEmail;

    private String drawEmail;

    private String notifyUrl;

    private String returnUrl;

    private String merchantUrl;

    private String notifyId;

    private Timestamp createTime;

    private Integer status;

    private Timestamp statusChgTime;

    private Integer checkStatus;

    private Timestamp checkTime;

    private String serviceNum;

    private String detailData;

    private String sendDetailData;

    private String receiveDetailData;

    private String reserved1;

    private String reserved2;

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
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public String getOriOrderId() {
        return oriOrderId;
    }

    public void setOriOrderId(String oriOrderId) {
        this.oriOrderId = oriOrderId == null ? null : oriOrderId.trim();
    }

    public String getTradeOrderId() {
        return tradeOrderId;
    }

    public void setTradeOrderId(String tradeOrderId) {
        this.tradeOrderId = tradeOrderId == null ? null : tradeOrderId.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(String requestSource) {
        this.requestSource = requestSource == null ? null : requestSource.trim();
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
        this.payOrgId = payOrgId == null ? null : payOrgId.trim();
    }

    public String getPayOrgSerial() {
        return payOrgSerial;
    }

    public void setPayOrgSerial(String payOrgSerial) {
        this.payOrgSerial = payOrgSerial == null ? null : payOrgSerial.trim();
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail == null ? null : buyerEmail.trim();
    }

    public String getReturnEmail() {
        return returnEmail;
    }

    public void setReturnEmail(String returnEmail) {
        this.returnEmail = returnEmail == null ? null : returnEmail.trim();
    }

    public String getDrawEmail() {
        return drawEmail;
    }

    public void setDrawEmail(String drawEmail) {
        this.drawEmail = drawEmail == null ? null : drawEmail.trim();
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl == null ? null : returnUrl.trim();
    }

    public String getMerchantUrl() {
        return merchantUrl;
    }

    public void setMerchantUrl(String merchantUrl) {
        this.merchantUrl = merchantUrl == null ? null : merchantUrl.trim();
    }

    public String getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(String notifyId) {
        this.notifyId = notifyId == null ? null : notifyId.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getStatusChgTime() {
        return statusChgTime;
    }

    public void setStatusChgTime(Timestamp statusChgTime) {
        this.statusChgTime = statusChgTime;
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

    public String getServiceNum() {
        return serviceNum;
    }

    public void setServiceNum(String serviceNum) {
        this.serviceNum = serviceNum == null ? null : serviceNum.trim();
    }

    public String getDetailData() {
        return detailData;
    }

    public void setDetailData(String detailData) {
        this.detailData = detailData == null ? null : detailData.trim();
    }

    public String getSendDetailData() {
        return sendDetailData;
    }

    public void setSendDetailData(String sendDetailData) {
        this.sendDetailData = sendDetailData == null ? null : sendDetailData.trim();
    }

    public String getReceiveDetailData() {
        return receiveDetailData;
    }

    public void setReceiveDetailData(String receiveDetailData) {
        this.receiveDetailData = receiveDetailData == null ? null : receiveDetailData.trim();
    }

    public String getReserved1() {
        return reserved1;
    }

    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1 == null ? null : reserved1.trim();
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2 == null ? null : reserved2.trim();
    }

    public String getReserved3() {
        return reserved3;
    }

    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3 == null ? null : reserved3.trim();
    }
}