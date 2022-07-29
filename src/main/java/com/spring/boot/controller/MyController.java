package com.spring.boot.controller;

import com.spring.boot.common.User;
import com.spring.boot.jwt.resultMap;
import com.spring.boot.jwt.TokenUtil;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Controller层
 *
 * @author 代码的路
 * @date 2022/7/29
 */

@RestController
@RequestMapping("/homepage")
public class MyController {

    // 登录
    @PostMapping("/login")
    public resultMap toLogin(@RequestBody User user){

        // 数据应从数据库读取，此处简化
        String userId = "admin";
        String password = "admin";

        String token=null;

        // 若密码正确，生成token
        if(user!=null && user.getUserId().equals(userId) && user.getPassword().equals(password)){
            token = TokenUtil.sign(user);
        }

        resultMap res;
        if(token == null){
            res = new resultMap(400,userId,"登录失败，请重试");
        }else{
            res = new resultMap(200,userId,token);
        }

        System.out.println("user:" + user);
        System.out.println("token:" + token);

        return res;
    }


    // 个人中心
    @PostMapping("/personal")
    public List<User> Personal(@RequestBody User obj){

        // 数据应从数据库读取，此处简化
        User user = new User();
        user.setUserId("123");
        user.setUsername("代码的路");

        List<User> res = new ArrayList<>();
        res.add(user);
        System.out.println("res:" + res);
        return res;
    }

}
