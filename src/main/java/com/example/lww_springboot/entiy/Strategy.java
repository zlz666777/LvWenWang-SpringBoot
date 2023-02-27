package com.example.lww_springboot.entiy;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Strategy {
    private Integer id;
    private String abs;
    private String cover;
    private String place;
    private Integer watch;
    private Double price;
    private String title;
    private String classify;
}
