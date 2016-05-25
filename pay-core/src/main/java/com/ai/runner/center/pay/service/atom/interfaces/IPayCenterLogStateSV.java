package com.ai.runner.center.pay.service.atom.interfaces;

import com.ai.runner.center.pay.dao.mapper.bo.PayCenterLogState;


/**
 * 支付中心流水轨迹表基础服务接口定义
 * Date: 2015年8月18日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public interface IPayCenterLogStateSV {

    void savePayCenterLogState(PayCenterLogState log);
    
}
