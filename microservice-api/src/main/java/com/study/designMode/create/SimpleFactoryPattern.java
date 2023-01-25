package com.study.designMode.create;

/**
 * @className: SimpleFactoryPattern
 * @description: TODO 创建型模式 - 简单工厂模式，又称之为静态工厂模式
 * @author: Txc
 * @date: 2022/11/9 19:53
 **/
public class SimpleFactoryPattern {

    //客户端访问
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Phone huaWei = simpleFactory.createPhone("HuaWei");
        Phone xiaoMi = simpleFactory.createPhone("XiaoMi");
        huaWei.call();
        xiaoMi.call();
    }

}

/** 抽象手机 */
interface Phone{

    /** 打电话功能 */
    void call();

}

/** 具体手机 HuaWei */
class HuaWei implements Phone{

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}

/** 具体手机 XiaoMi */
class XiaoMi implements Phone{

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}

/** 手机工厂 */
class SimpleFactory{

    public Phone createPhone(String phone){
        if (phone.equals("HuaWei")){
            return new HuaWei();
        }else if(phone.equals("XiaoMi")){
            return new XiaoMi();
        }
        return null;
    }

}
