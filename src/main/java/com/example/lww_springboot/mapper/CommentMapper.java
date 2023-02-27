package com.example.lww_springboot.mapper;

import com.example.lww_springboot.entiy.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMapper {
    /**
     * 通过文章id查询对应的评论信息
     * @param id 文章id
     * @return 评论集合
     */
    List<Comment> queryListByArtId(@Param("id") Integer id, @Param("type") String type);

    /**
     * 插入评论
     * @param comment 评论信息
     * @return 受影响行数
     */
    int insertComment(Comment comment);

    /**
     * 通过文章id查询评论数量
     * @param artId
     * @return
     */
    int queryCountByArtId(@Param("artId") Integer artId);
}
