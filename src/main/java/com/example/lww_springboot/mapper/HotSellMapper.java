package com.example.lww_springboot.mapper;

import com.example.lww_springboot.entiy.HotSell;

import java.util.List;

public interface HotSellMapper {
    /**
     * 获取所有热卖信息
     * @return
     */
    List<HotSell> getHotSellAll();
}
