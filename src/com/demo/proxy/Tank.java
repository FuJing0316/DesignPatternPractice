package com.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: fujing
 * @Date: 2021/10/6
 * @Description: 动态代理 之 JDK动态代理
 * @Version: 1.0
 */
public class Tank implements MoveAble {
    public static void main(String[] args) {
        Tank tank = new Tank();
        //将生成的代理类保存在工程目录
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");

        //Jdk动态代理：通过二进制字节码分析类的属性和方法
        MoveAble m = (MoveAble) Proxy.newProxyInstance(
                Tank.class.getClassLoader(),  //指定将代理对象装载进内存的类加载器
                new Class[]{MoveAble.class},  //指定被代理对象实现的接口列表 （数组）
                new LogInvokeHandler(tank)); //代理逻辑

        m.move();//执行代理对象中的move方法
    }

    @Override
    public void move() {
        System.out.println("tank start move:calcal...");
        long start = System.currentTimeMillis();

        //模拟坦克移动了一会时间
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("tank move period:" + (end - start));
    }

    private static class LogInvokeHandler implements InvocationHandler {
        Tank tank;

        public LogInvokeHandler(Tank tank) {
            this.tank = tank;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("proxy method{} " + method.getName() + " start!");
            Object o = method.invoke(tank, args);
            System.out.println("proxy method{} " + method.getName() + " end!");
            return o;
        }
    }
}



