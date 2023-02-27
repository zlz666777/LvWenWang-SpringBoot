package com.example.lww_springboot.service;

import com.example.lww_springboot.entiy.Comment;

public interface CommentService {
    /**
     * 插入评论
     * @param comment
     * @return
     */
    int insertComment(Comment comment);
}
