package com.example.lww_springboot.mapper;

import com.example.lww_springboot.entiy.QueryObject;
import com.example.lww_springboot.entiy.Strategy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StrategyMapper {
    /**
     * 查询所有旅游攻略信息
     * @return
     */
    List<Strategy> selectAll(@Param("queryObject") QueryObject queryObject);
}
