package com.yjq.programmer.dao;

import com.yjq.programmer.domain.Office;
import com.yjq.programmer.domain.OfficeExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigInteger;
import java.util.List;

public interface OfficeMapper {
    BigInteger countByExample(OfficeExample example);

    int deleteByExample(OfficeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Office record);

    int insertSelective(Office record);

    List<Office> selectByExample(OfficeExample example);

    Office selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Office record, @Param("example") OfficeExample example);

    int updateByExample(@Param("record") Office record, @Param("example") OfficeExample example);

    int updateByPrimaryKeySelective(Office record);

    int updateByPrimaryKey(Office record);
}