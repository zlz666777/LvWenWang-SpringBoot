package com.example.lww_springboot.service.impl;

import com.example.lww_springboot.entiy.QueryObject;
import com.example.lww_springboot.entiy.Strategy;
import com.example.lww_springboot.mapper.StrategyMapper;
import com.example.lww_springboot.service.StrategyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StrategyServiceImpl implements StrategyService {
    @Resource
    StrategyMapper strategyMapper;

    @Override
    public List<Strategy> selectAll(QueryObject queryObject) {
        System.out.println(queryObject);
        //调用mapper查询攻略信息
        return strategyMapper.selectAll(queryObject);
    }
}
