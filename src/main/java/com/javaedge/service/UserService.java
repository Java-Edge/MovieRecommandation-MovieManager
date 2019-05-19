package com.javaedge.service;

import com.javaedge.common.Page;
import com.javaedge.po.User;

/**
 * @author JavaEdge
 */
public interface UserService {

    /**
     * 查询用户列表
     * @param page
     * @param rows
     * @param username
     * @return
     */
    Page<User> findUserList(Integer page, Integer rows, String username);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Integer id);

    /**
     * 编辑用户
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 更新用户信息
     * @param user
     */
    void updateUser(User user);

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);
}
