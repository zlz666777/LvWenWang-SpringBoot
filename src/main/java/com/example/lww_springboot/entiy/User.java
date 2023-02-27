package com.example.lww_springboot.entiy;

import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String code;
    private String headImg;
}
