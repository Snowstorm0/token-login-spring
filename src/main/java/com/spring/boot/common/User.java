package com.spring.boot.common;

import lombok.Data;

/**
 * 用户类
 *
 * @author 代码的路
 * @date 2022/7/29
 */

@Data
public class User {

    private String userId;
    private String username;
    private String password;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
