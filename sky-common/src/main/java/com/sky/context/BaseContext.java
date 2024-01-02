package com.sky.context;

//使用ThreadLocal的工具类
//ThreadLocal可以保存线程的局部变量
//因为一次请求Tomcat会启动一个线程，所以可以在解析JWT令牌的时候保存用户id便于service层使用
public class BaseContext {

    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
        return threadLocal.get();
    }

    public static void removeCurrentId() {
        threadLocal.remove();
    }

}
