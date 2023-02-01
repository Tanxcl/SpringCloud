package com.orangecheng.designMode.action;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: ObserverPattern
 * @description: TODO 设计模式 - 观察者模式:也称之为发布订阅模式，定义对象间的一种一对多的依赖关系，使得每一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新
 * @author: Txc
 * @date: 2022/11/9 20:13
 **/
public class _观察者模式 {

    public static void main(String[] args) {
        ZhangSan zhangSan = new ZhangSan();
        zhangSan.borrow(new CreditOne());
        zhangSan.borrow(new CreditTwo());
        System.out.println("借钱");
        /*state改变，ZhangSan有钱*/
        zhangSan.notifyCredits();

    }

}

/** 抽象借贷人 */
interface Debit {

    void borrow(Credit credit);
    void notifyCredits();
}

/** 具体借贷人 */
class ZhangSan implements Debit {

    private List<Credit> allCredit = new ArrayList<>();
    private int state = 0; //0表示没钱 1表示有钱

    @Override
    public void borrow(Credit credit) {
        allCredit.add(credit);
    }

    @Override
    public void notifyCredits() {
        allCredit.forEach(credit -> credit.takeMoney());
    }
}

/** 抽象放贷人 */
interface Credit {
    void takeMoney();
}

/** 具体放贷人 */
class CreditOne implements Credit {

    @Override
    public void takeMoney() {
        System.out.println("找ZhangSan还钱");
    }
}

class CreditTwo implements Credit {

    @Override
    public void takeMoney() {
        System.out.println("找ZhangSan还钱");
    }
}
