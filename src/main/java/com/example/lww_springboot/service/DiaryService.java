package com.example.lww_springboot.service;

import com.example.lww_springboot.entiy.Diary;
import com.example.lww_springboot.entiy.QueryObject;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface DiaryService {
    /**
     * 获取基本的所有日记
     * @return
     */
    PageInfo<Diary> getDiaryAllByBasic(QueryObject queryObject);

    /**
     * 根据文章id查询游记信息
     * @param id 文章id
     * @return 游记信息
     */
    Diary queryById(Integer id);

    /**
     * 新增游记
     * @param diary
     * @return
     */
    int insert(Diary diary);

    /**
     * 通过id删除文章信息
     * @param id 文章id
     * @return 受影响行数
     */
    int deleteById(Integer id);

    /**
     * 更新游记信息
     * @param diary 游记信息
     * @return 受影响行数
     */
    int updateDiary(Diary diary);

    /**
     * 获取热门城市前5名
     * @return
     */
    List<Diary> hotCity();

    /**
     * 花费统计
     * @param num1
     * @param num2
     * @return
     */
    int countMoney(Integer num1,Integer num2);
}
