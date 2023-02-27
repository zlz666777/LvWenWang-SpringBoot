package com.example.lww_springboot.service;

import com.example.lww_springboot.entiy.QueryObject;
import com.example.lww_springboot.entiy.Strategy;

import java.util.List;

public interface StrategyService {
    /**
     * 查询所有旅游攻略
     * @return
     */
    List<Strategy> selectAll(QueryObject queryObject);
}
