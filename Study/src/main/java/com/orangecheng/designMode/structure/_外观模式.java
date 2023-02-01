package com.orangecheng.designMode.structure;

/**
 * @className: FacadePattern
 * @description: TODO 设计模式 - 外观模式
 * @author: Txc
 * @date: 2022/11/9 20:10
 **/
public class _外观模式 {

    public static void main(String[] args) {
        new Facade().prove();
    }

}

class SubFlowOne {
    boolean isTrue(){
        return true;
    }
}

class SubFlowTwo {
    boolean isTrue(){
        return true;
    }
}

class SubFlowThree {
    boolean isTrue(){
        return true;
    }
}

class Facade {
    public SubFlowOne subFlowOne = new SubFlowOne();
    public SubFlowTwo subFlowTwo = new SubFlowTwo();
    public SubFlowThree subFlowThree = new SubFlowThree();

    boolean prove(){
        return subFlowOne.isTrue()&&subFlowTwo.isTrue()&&subFlowThree.isTrue();
    }
}
