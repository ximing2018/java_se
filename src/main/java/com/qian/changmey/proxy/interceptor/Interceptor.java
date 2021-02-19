package com.qian.changmey.proxy.interceptor;

import java.lang.reflect.Method;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.proxy.interceptor
 * @ClassName: Interceptor
 * @Author: changmey
 * @Description:
 * @Date: 2021/1/3 13:46
 * @Version: 1.0
 */
public interface Interceptor {


    boolean before(Object proxy, Object target, Method method, Object[] args);
    void around(Object proxy, Object target, Method method, Object[] args);
    void after(Object proxy, Object target, Method method, Object[] args);
}
