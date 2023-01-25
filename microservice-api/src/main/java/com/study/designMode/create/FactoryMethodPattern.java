package com.study.designMode.create;

/**
 * @className: FactoryMethodPattern
 * @description: TODO 创建型模式 - 工厂方法模式
 * @author: Txc
 * @date: 2022/11/9 19:55
 **/
public class FactoryMethodPattern {

    /** 客户端 */
    public static void main(String[] args) {
        WatchFactory iphoneFactory = new IphoneFactory();
        Watch iphoneWatch = iphoneFactory.createProduct();
        iphoneWatch.viewTime();

        WatchFactory oppoFactory = new OppoFactory();
        Watch oppoWatch = oppoFactory.createProduct();
        oppoWatch.viewTime();
    }

}

/** 抽象手表 */
interface Watch {

    /** 查看时间 */
    void viewTime();

}

/** 具体手表 Iphone */
class Iphone implements Watch {

    @Override
    public void viewTime() {
        System.out.println("使用苹果手表查看时间");
    }
}
/** 具体手表 Oppo */
class Oppo implements Watch {

    @Override
    public void viewTime() {
        System.out.println("使用Oppo手表查看时间");
    }
}

/** 抽象工厂 */
interface WatchFactory {

    Watch createProduct();

}

/** 具体手表工厂 Iphone */
class IphoneFactory implements WatchFactory {

    @Override
    public Watch createProduct() {
        return new Iphone();
    }
}
/** 具体手表工厂 Oppo */
class OppoFactory implements  WatchFactory {

    @Override
    public Watch createProduct() {
        return new Oppo();
    }
}
