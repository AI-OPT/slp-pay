package com.ai.runner.center.pay.api.paycenter.param;

import com.ai.runner.base.vo.BaseInfo;

/**
 * 修改交易记录请求参数.<br>
 * Date: 2015年8月18日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public class TradeModifyReq extends BaseInfo {

    private static final long serialVersionUID = 3998682776158841822L;

    /**
     * 订单号,必填
     */
    private String orderId;
    
    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 内部交易订单号
     */
    private String tradeOrderId;

    /**
     * 终端来源:<br>
     * 1:web<br>
     * 2:wap<br>
     * 3:app<br>
     * 4:微信<br>
     */
    private String requestSource;

    /**
     * 支付机构编码
     */
    private String payOrgId;

    /**
     * 第三方支付平台交易流水号
     */
    private String payOrgSerial;

    /**
     * 通知ID
     */
    private String notifyId;

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
     * 买家支付账号
     */
    private String buyerEmail;

    /**
     * 退款目标账号
     */
    private String returnEmail;

    /**
     * 提现账号
     */
    private String drawEmail;
    
    /**
     * 付款详细数据
     */
    private String detailData;    
    
    /**
     * 发送报文明细数据
     */
    private String sendDetailData;

    /**
     * 接收报文明细数据
     */
    private String receiveDetailData;

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

    public String getTradeOrderId() {
        return tradeOrderId;
    }

    public void setTradeOrderId(String tradeOrderId) {
        this.tradeOrderId = tradeOrderId;
    }

    public String getRequestSource() {
        return requestSource;
    }

    public void setRequestSource(String requestSource) {
        this.requestSource = requestSource;
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

    public String getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(String notifyId) {
        this.notifyId = notifyId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public String getReturnEmail() {
        return returnEmail;
    }

    public void setReturnEmail(String returnEmail) {
        this.returnEmail = returnEmail;
    }

    public String getDrawEmail() {
        return drawEmail;
    }

    public String getDetailData() {
        return detailData;
    }

    public void setDetailData(String detailData) {
        this.detailData = detailData;
    }

    public void setDrawEmail(String drawEmail) {
        this.drawEmail = drawEmail;
    }

    public String getSendDetailData() {
        return sendDetailData;
    }

    public void setSendDetailData(String sendDetailData) {
        this.sendDetailData = sendDetailData;
    }

    public String getReceiveDetailData() {
        return receiveDetailData;
    }

    public void setReceiveDetailData(String receiveDetailData) {
        this.receiveDetailData = receiveDetailData;
    }

}
