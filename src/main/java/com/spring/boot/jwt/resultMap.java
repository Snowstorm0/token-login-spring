package com.spring.boot.jwt;


/**
 * 返回数据类型
 *
 * @author 代码的路
 * @date 2022/7/29
 */
public class  resultMap {

    private Integer code;//状态码
    private String token;//token
    private String userId;//userId

    // 无参构造器
    public resultMap(){
        super();
    }

    public resultMap(Integer code, String userId, String token){
        super();
        this.code=code;
        this.userId=userId;
        this.token=token;
    }

    public static void code(int i) {
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public Object getUserId() {
        return userId;
    }
    public void setUserId(Object result) {
        this.userId = userId;
    }

}