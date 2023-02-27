package com.example.lww_springboot.controller;

import com.example.lww_springboot.entiy.Comment;
import com.example.lww_springboot.entiy.ResponseBean;
import com.example.lww_springboot.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommentController {
    @Autowired
    CommentService commentService;

    @RequestMapping("/insertComment")
    @ResponseBody
    public ResponseBean insertComment(@RequestBody Comment comment){
        int row = commentService.insertComment(comment);
        if(row>0) return new ResponseBean(200,"新增评论成功",null);
        else return new ResponseBean(500,"新增评论失败",null);
    }
}
