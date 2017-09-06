package test;

import com.busi.test2.Greeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/6/7 19:56
 */
public class TestRun2 {
    public static void main(String[] args){
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring-application2.xml");
        Greeting greeting = (Greeting)context.getBean("greetingProxy");
        greeting.doSleep("java");
        greeting.doWork("C++");
        //sayHello 方法调用时没有进行环绕增强，因切点中只包含了do开头的方法
        greeting.sayHello("C#");
    }
}
