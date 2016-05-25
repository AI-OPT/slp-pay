package com.ai.runner.center.pay.service.atom.impl;

import org.springframework.stereotype.Component;

import com.ai.runner.center.pay.dao.mapper.bo.PayCenterLogState;
import com.ai.runner.center.pay.dao.mapper.factory.MapperFactory;
import com.ai.runner.center.pay.service.atom.interfaces.IPayCenterLogStateSV;


/**
 * 支付中心流水轨迹基础服务实现类
 * Date: 2015年8月18日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
@Component
public class PayCenterLogStateSVImpl implements IPayCenterLogStateSV {

    @Override
    public void savePayCenterLogState(PayCenterLogState log) {
        MapperFactory.getPayCenterLogStateMapper().insert(log);
    }

}
