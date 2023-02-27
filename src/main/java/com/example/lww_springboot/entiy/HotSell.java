package com.example.lww_springboot.entiy;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HotSell {
    //主键id
    private Integer id;
    //标题
    private String title;
    //价钱
    private Double price;
    //照片
    private String img;
}
