package com.example.lww_springboot.entiy;

import lombok.Data;

@Data
public class Comment {
    private Integer id;
    private String content;
    private Integer uid;
    private Integer artId;
    private String time;
    private String type;
    private User user;//评论人的信息
}
