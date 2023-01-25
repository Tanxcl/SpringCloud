package com.study.designMode.structure;

/**
 * @className: DecoratorPattern
 * @description: TODO 设计模式 - 装饰模式
 * @author: Txc
 * @date: 2022/11/9 20:09
 **/
public class DecoratorPattern {

    /** 客户端 */
    public static void main(String[] args) {
        SecondRobot secondRobot = new SecondRobot(new FirstRobot());
        secondRobot.doSomething();
        secondRobot.doMore();
    }

}

/** 抽象机器人 */
interface Robot {
    void doSomething();
}

/** 第一代 */
class FirstRobot implements Robot {

    @Override
    public void doSomething() {
        System.out.println("唱歌");
        System.out.println("跳舞");
    }
}

/** 第二代 */
class SecondRobot implements Robot {

    public Robot robot;

    public SecondRobot(Robot robot){
        this.robot = robot;
    }

    @Override
    public void doSomething() {
        robot.doSomething();
    }

    public void doMore(){
        System.out.println("扫地");
        System.out.println("对话");
    }
}
