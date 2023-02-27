package com.example.lww_springboot.service;

import com.example.lww_springboot.entiy.HotSell;

import java.util.List;

public interface HotSellService {
    /**
     * 获取所有的热卖信息
     * @return
     */
    List<HotSell> getHotSellAll();
}
