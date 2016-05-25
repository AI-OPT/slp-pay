package com.ai.runner.center.pay.api.terminalorgrelquery.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.ai.opt.sdk.util.CollectionUtil;
import com.ai.opt.sdk.util.StringUtil;
import com.ai.runner.base.exception.BusinessException;
import com.ai.runner.base.exception.CallerException;
import com.ai.runner.center.pay.api.terminalorgrelquery.interfaces.ITerminalOrgRelQuerySV;
import com.ai.runner.center.pay.api.terminalorgrelquery.param.TerminalOrgRelQryParam;
import com.ai.runner.center.pay.api.terminalorgrelquery.param.TerminalOrgRelVo;
import com.ai.runner.center.pay.constants.ExceptCodeConstants;
import com.ai.runner.center.pay.util.TerminalOrgRelUtil;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * 终端与支付机构关系查询服务
 * Date: 2015年8月20日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
@Service
@Component
public class TerminalOrgRelQuerySVImpl implements ITerminalOrgRelQuerySV {

    private static final Log LOG = LogFactory.getLog(TerminalOrgRelQuerySVImpl.class);
        
    @Override
    public List<TerminalOrgRelVo> queryTerminalOrgRels(TerminalOrgRelQryParam param)
            throws CallerException {
        LOG.info("终端与支付机构关系查询开始");
        if (param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:终端与支付机构关系查询请求参数不能为空");
        }
        
        if (StringUtil.isBlank(param.getTenantId())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
                
        if(StringUtil.isBlank(param.getRequestSource())) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "获取参数失败:终端来源不能为空");
        }
        
        List<TerminalOrgRelVo> relVoList = TerminalOrgRelUtil.getTerminalOrgRels(
                param.getTenantId(), param.getRequestSource());
        if(CollectionUtil.isEmpty(relVoList)) {
            return new ArrayList<TerminalOrgRelVo>();
        }
        LOG.info("终端与支付机构关系查询结束");
        return relVoList;
    }

}
