package com.ai.runner.center.pay.dao.mapper.interfaces;

import com.ai.runner.center.pay.dao.mapper.bo.PayCenterLog;
import com.ai.runner.center.pay.dao.mapper.bo.PayCenterLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayCenterLogMapper {
    int countByExample(PayCenterLogCriteria example);

    int deleteByExample(PayCenterLogCriteria example);

    int deleteByPrimaryKey(Long payId);

    int insert(PayCenterLog record);

    int insertSelective(PayCenterLog record);

    List<PayCenterLog> selectByExample(PayCenterLogCriteria example);

    PayCenterLog selectByPrimaryKey(Long payId);

    int updateByExampleSelective(@Param("record") PayCenterLog record, @Param("example") PayCenterLogCriteria example);

    int updateByExample(@Param("record") PayCenterLog record, @Param("example") PayCenterLogCriteria example);

    int updateByPrimaryKeySelective(PayCenterLog record);

    int updateByPrimaryKey(PayCenterLog record);
}