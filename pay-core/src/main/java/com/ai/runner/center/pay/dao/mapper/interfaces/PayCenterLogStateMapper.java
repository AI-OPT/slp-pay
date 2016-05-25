package com.ai.runner.center.pay.dao.mapper.interfaces;

import com.ai.runner.center.pay.dao.mapper.bo.PayCenterLogState;
import com.ai.runner.center.pay.dao.mapper.bo.PayCenterLogStateCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayCenterLogStateMapper {
    int countByExample(PayCenterLogStateCriteria example);

    int deleteByExample(PayCenterLogStateCriteria example);

    int insert(PayCenterLogState record);

    int insertSelective(PayCenterLogState record);

    List<PayCenterLogState> selectByExample(PayCenterLogStateCriteria example);

    int updateByExampleSelective(@Param("record") PayCenterLogState record, @Param("example") PayCenterLogStateCriteria example);

    int updateByExample(@Param("record") PayCenterLogState record, @Param("example") PayCenterLogStateCriteria example);
}