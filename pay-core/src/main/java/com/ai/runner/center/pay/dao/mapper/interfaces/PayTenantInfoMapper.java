package com.ai.runner.center.pay.dao.mapper.interfaces;

import com.ai.runner.center.pay.dao.mapper.bo.PayTenantInfo;
import com.ai.runner.center.pay.dao.mapper.bo.PayTenantInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayTenantInfoMapper {
    int countByExample(PayTenantInfoCriteria example);

    int deleteByExample(PayTenantInfoCriteria example);

    int deleteByPrimaryKey(String partnerId);

    int insert(PayTenantInfo record);

    int insertSelective(PayTenantInfo record);

    List<PayTenantInfo> selectByExample(PayTenantInfoCriteria example);

    PayTenantInfo selectByPrimaryKey(String partnerId);

    int updateByExampleSelective(@Param("record") PayTenantInfo record, @Param("example") PayTenantInfoCriteria example);

    int updateByExample(@Param("record") PayTenantInfo record, @Param("example") PayTenantInfoCriteria example);

    int updateByPrimaryKeySelective(PayTenantInfo record);

    int updateByPrimaryKey(PayTenantInfo record);
}