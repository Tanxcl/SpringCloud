package com.orangecheng.designMode.structure;

/**
 * @className: AdapterPattern
 * @description: TODO 设计模式 - 适配器模式
 * @author: Txc
 * @date: 2022/11/9 19:57
 **/
public class AdapterPattern {

    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Speaker());
        System.out.println(adapter.translate());
    }

}

class Speaker {
    public String speak(){
        return "CHINA NO.1";
    }
}

interface Translator {
    String translate();
}

class Adapter implements Translator {

    public Speaker speaker;

    public Adapter(Speaker speaker){
        this.speaker = speaker;
    }

    @Override
    public String translate() {
        String before = speaker.speak();
        //加工
        String after = new String(before+" - 中国第一");
        return after;
    }
}
