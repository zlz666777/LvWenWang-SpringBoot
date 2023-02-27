package com.example.lww_springboot.service.impl;

import com.example.lww_springboot.entiy.HotSell;
import com.example.lww_springboot.mapper.HotSellMapper;
import com.example.lww_springboot.service.HotSellService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class HotSellServiceImpl implements HotSellService {
    @Resource
    HotSellMapper hotSellMapper;

    @Override
    public List<HotSell> getHotSellAll() {
        return hotSellMapper.getHotSellAll();
    }
}
