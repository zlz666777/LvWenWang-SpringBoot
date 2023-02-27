package com.example.lww_springboot.mapper;

import com.example.lww_springboot.entiy.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * 根据用户名和密码查询用户
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User queryById(Integer id);
}
