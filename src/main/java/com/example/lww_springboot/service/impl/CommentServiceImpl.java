package com.example.lww_springboot.service.impl;

import com.example.lww_springboot.entiy.Comment;
import com.example.lww_springboot.mapper.CommentMapper;
import com.example.lww_springboot.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    CommentMapper commentMapper;

    @Override
    public int insertComment(Comment comment) {
        //准备评论时间
        Date date = new Date();
        //格式化时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        //格式化模板
        simpleDateFormat.applyPattern("yyyy-MM-dd HH:mm:ss");
        //开始格式化
        String newDate = simpleDateFormat.format(date);
        //设置在comment里面的time
        comment.setTime(newDate);
        return commentMapper.insertComment(comment);
    }
}
