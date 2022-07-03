import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;

import java.io.IOException;
import java.util.List;
import java.util.logging.*;

/**
 * @className: Test
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/7/2 11:27
 **/
@SpringBootTest
public class Test {

    Logger log = Logger.getLogger("Test");

    @org.junit.Test
    public void test(){

        //设置级别消息
        log.severe("severe");
        log.warning("warning");
        log.info("info");   //jul默认的日志级别 info
        log.config("config");
        log.fine("fine");
        log.finer("finer");
        log.finest("finest");
    }

    //自定义日志级别
    @org.junit.Test
    public void test2 () throws Exception{

        //自定义配置日志级别

        //关闭默认配置
        log.setUseParentHandlers(false);

        //创建ConsoleHandler
        ConsoleHandler consoleHandler = new ConsoleHandler();

        //创建简单格式转换对象
        SimpleFormatter simpleFormatter = new SimpleFormatter();

        //进行关联
        consoleHandler.setFormatter(simpleFormatter);
        log.addHandler(consoleHandler);

        log.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);

        //场景FileHandler 文件输出
        FileHandler fileHandler = new FileHandler("E://WorkSpace/jul.log");
        fileHandler.setFormatter(simpleFormatter);
        log.addHandler(fileHandler);


        //日志输出
        log.severe("severe");
        log.warning("warning");
        log.info("info");   //jul默认的日志级别 info
        log.config("config");
        log.fine("fine");
        log.finer("finer");
        log.finest("finest");
        System.out.println("");
        System.out.println("222");
    }
}
