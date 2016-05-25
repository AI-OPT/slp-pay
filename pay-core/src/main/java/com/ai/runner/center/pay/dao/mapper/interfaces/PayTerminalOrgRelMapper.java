package com.ai.runner.center.pay.dao.mapper.interfaces;

import com.ai.runner.center.pay.dao.mapper.bo.PayTerminalOrgRel;
import com.ai.runner.center.pay.dao.mapper.bo.PayTerminalOrgRelCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayTerminalOrgRelMapper {
    int countByExample(PayTerminalOrgRelCriteria example);

    int deleteByExample(PayTerminalOrgRelCriteria example);

    int deleteByPrimaryKey(Long relId);

    int insert(PayTerminalOrgRel record);

    int insertSelective(PayTerminalOrgRel record);

    List<PayTerminalOrgRel> selectByExample(PayTerminalOrgRelCriteria example);

    PayTerminalOrgRel selectByPrimaryKey(Long relId);

    int updateByExampleSelective(@Param("record") PayTerminalOrgRel record, @Param("example") PayTerminalOrgRelCriteria example);

    int updateByExample(@Param("record") PayTerminalOrgRel record, @Param("example") PayTerminalOrgRelCriteria example);

    int updateByPrimaryKeySelective(PayTerminalOrgRel record);

    int updateByPrimaryKey(PayTerminalOrgRel record);
}