package com.yjq.programmer.dao.my;

import org.apache.ibatis.annotations.Param;

import java.util.Map;


public interface MyAppointMapper {

    // 根据时间范围获取交易的订单总数
    Integer getAppointTotalByDate(@Param("queryMap") Map<String, Object> queryMap);
}
