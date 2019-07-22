package com.arts.service.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>
 * 1.
 * </p>
 *
 * @author : wukong
 * @version : 1.0.0
 * @date : 2019-07-19
 */
public class CostTimeHandler implements InvocationHandler {

    // 目标对象
    private Object targetObject;

    public Object newProxyInstance(Object targetObject){
        this.targetObject=targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object ret;
        try{
            long startTime = System.currentTimeMillis();
            ret=method.invoke(targetObject, args);
            System.out.println("\n"+method.getName()+"-耗时："+(System.currentTimeMillis() - startTime));
        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }
        return ret;
    }
}
