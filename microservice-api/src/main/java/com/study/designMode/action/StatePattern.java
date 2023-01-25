package com.study.designMode.action;

/**
 * @className: StatePattern
 * @description: TODO 设计模式 - 状态模式
 * @author: Txc
 * @date: 2022/11/9 20:14
 **/
public class StatePattern {

    public static void main(String[] args) {
        Context zhangSan = new Context();
        zhangSan.changeState(new Happy());
        zhangSan.doSomething();
        zhangSan.changeState(new Sad());
        zhangSan.doSomething();
    }

}

interface State {
    void doWork();
}

class Happy implements State {

    @Override
    public void doWork() {
        System.out.println("积极主动");
    }
}

class Angry implements State {

    @Override
    public void doWork() {
        System.out.println("无精打采");
    }
}

class Sad implements State {

    @Override
    public void doWork() {
        System.out.println("啥也不干");
    }
}

class Context {

    private State state;
    public void changeState(State state){
        this.state = state;
    }

    public void doSomething(){
        state.doWork();
    }
}
