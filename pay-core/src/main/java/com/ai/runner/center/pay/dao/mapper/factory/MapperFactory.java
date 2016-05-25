package com.ai.runner.center.pay.dao.mapper.factory;

import javax.annotation.PostConstruct;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.runner.center.pay.dao.mapper.interfaces.PayCenterLogMapper;
import com.ai.runner.center.pay.dao.mapper.interfaces.PayCenterLogStateMapper;
import com.ai.runner.center.pay.dao.mapper.interfaces.PayTenantConfigMapper;
import com.ai.runner.center.pay.dao.mapper.interfaces.PayTenantInfoMapper;
import com.ai.runner.center.pay.dao.mapper.interfaces.PayTerminalOrgRelMapper;


@Component
public class MapperFactory {

    @Autowired
    private SqlSessionTemplate st;

    private static SqlSessionTemplate sqlSessionTemplate;

    @PostConstruct
    void init() {
        setSqlSessionTemplate(st);
    }
    
    public static void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        MapperFactory.sqlSessionTemplate = sqlSessionTemplate;
    }
    
    /**
     * 支付中心流水表
     * @return
     * @author fanpw
     * @ApiDocMethod
     */
    public static PayCenterLogMapper getPayCenterLogMapper() {
        return sqlSessionTemplate.getMapper(PayCenterLogMapper.class);
    }
    
    /**
     * 支付中心流水轨迹表
     * @return
     * @author fanpw
     * @ApiDocMethod
     */
    public static PayCenterLogStateMapper getPayCenterLogStateMapper() {
        return sqlSessionTemplate.getMapper(PayCenterLogStateMapper.class);
    }
    
    /**
     * 终端与支付机构的关系表
     * @return
     * @author fanpw
     * @ApiDocMethod
     */
    public static PayTerminalOrgRelMapper getChgTerminalOrgRelMapper() {
        return sqlSessionTemplate.getMapper(PayTerminalOrgRelMapper.class);
    }
    
    /**
     * 租户信息表
     * @return
     * @author fanpw
     * @ApiDocMethod
     */
    public static PayTenantInfoMapper getPayTenantInfoMapper() {
        return sqlSessionTemplate.getMapper(PayTenantInfoMapper.class);
    }
    /**
     * 租户配置信息表
     * @return
     * @author LiangMeng
     * @ApiDocMethod
     */
    public static PayTenantConfigMapper getPayTenantConfigMapper() {
        return sqlSessionTemplate.getMapper(PayTenantConfigMapper.class);
    }
}
