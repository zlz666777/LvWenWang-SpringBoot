package com.example.lww_springboot.entiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResponseBean {
    private Integer code;//响应状态
    private String msg;//消息
    private Object data;//数据
}
