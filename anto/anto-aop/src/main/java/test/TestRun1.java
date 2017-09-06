package test;

import com.busi.test1.Apoly;
import com.busi.test1.GreetingImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/6/7 17:18
 */
public class TestRun1 {
    public static void main(String[] args){
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring-application1.xml");
        GreetingImpl greeting = (GreetingImpl)context.getBean("greetingAdviceProxy");
        greeting.say("Java");

        Apoly apoly = (Apoly)greeting;
    }
}
