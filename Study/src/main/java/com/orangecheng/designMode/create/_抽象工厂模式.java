package com.orangecheng.designMode.create;

/**
 * @className: AbstractFactoryPattern
 * @description: TODO 创建型模式 - 抽象工厂模式
 * @author: Txc
 * @date: 2022/11/9 19:55
 **/
public class _抽象工厂模式 {



}

/** 抽象工厂 */
interface AbstractFactory{

    Mask createMask(String param);

    Glove createGlove(String param);

}

/** 具体工厂 */
class SuperFactory implements AbstractFactory{

    @Override
    public Mask createMask(String param) {
        if (param.equals("防疫")){
            return new N95();
        }else if (param.equals("防毒")){
            return new Antivirus();
        }
        return null;
    }

    @Override
    public Glove createGlove(String param) {
        if (param.equals("防疫")){
            return new Medical();
        }else if (param.equals("保暖")){
            return new Warm();
        }
        return null;
    }
}

/** 口罩 */
interface Mask{

}

class N95 implements Mask{

}

class Antivirus implements Mask{

}

/** 手套 */
interface Glove{

}

class Medical implements Glove{

}

class Warm implements Glove{

}

