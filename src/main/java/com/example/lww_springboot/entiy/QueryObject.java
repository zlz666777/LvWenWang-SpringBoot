package com.example.lww_springboot.entiy;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QueryObject {
    //当前页，默认第一页
    private Integer currentPage=1;
    //容量，默认每页显示4条数据
    private Integer pageSize=4;
    //接收最新或最热
    private String basic;
    //接收天数
    private String money;
    //接收金额
    private String day;
    //分类信息
    private String classify;
}
