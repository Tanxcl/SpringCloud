package com.orangecheng.designMode.create;

/**
 * @className: SingletonPattern
 * @description: TODO 创建型模式 - 单例模式
 * @author: Txc
 * @date: 2022/11/9 19:53
 **/
public class _单例模式 {

}

/**
 * 饿汉式
 */
class Hungry{

    private static final Hungry hungry = new Hungry();

    private Hungry(){

    }

    public static Hungry getInstance(){
        return hungry;
    }

}

/**
 * 懒汉式
 */
class Lazy{

    private static volatile Lazy lazy = null;

    private Lazy(){

    }

    /**
     * 方法一 : 在方法上加锁
     * 出现的问题 : 每次去获取对象都需要先获取锁，并发性能非常地差，极端情况下，可能会出现卡顿现象。
     */
    public static synchronized Lazy getInstance(){
        if (lazy == null){
            lazy = new Lazy();
        }
        return lazy;
    }

    /**
     * 方法二 ：使用代码块
     */
    public static Lazy getInstanceTwo(){
        if (lazy == null){                //线程A和线程B同时看到singleton = null，如果不为null，则直接返回singleton
            synchronized (Lazy.class){    //线程A或线程B获得该锁进行初始化
                if (lazy == null){        //其中一个线程进入该分支，另外一个线程则不会进入该分支
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }

}

/**
 * 总结 ：
 * （1）单例模式常见的写法有两种：懒汉式、饿汉式
 *
 * （2）懒汉式：在需要用到对象时才实例化对象，正确的实现方式是：Double Check + Lock，解决了并发安全和性能低下问题
 *
 * （3）饿汉式：在类加载时已经创建好该单例对象，在获取单例对象时直接返回对象即可，不会存在并发安全和性能问题。
 *
 * （4）在开发中如果对内存要求非常高，那么使用懒汉式写法，可以在特定时候才创建该对象；
 *
 * （5）如果对内存要求不高使用饿汉式写法，因为简单不易出错，且没有任何并发安全和性能问题
 *
 * （6）为了防止多线程环境下，因为指令重排序导致变量报NPE，需要在单例对象上添加volatile关键字防止指令重排序
 *
 * （7）最优雅的实现方式是使用枚举，其代码精简，没有线程安全问题，且 Enum 类内部防止反射和反序列化时破坏单例。
 **/
