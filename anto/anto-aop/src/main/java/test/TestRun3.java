package test;

import com.busi.test3.Greeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/6/7 19:56
 */
public class TestRun3 {
    public static void main(String[] args){
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring-application3.xml");
        Greeting greeting = (Greeting)context.getBean("greetingImpl");
        /**
         * xml配置中为所有的 Impl结尾的类都产生了代理且指定了增强实现
         */
        greeting.doSleep("java");
        greeting.doWork("C++");
        greeting.sayHello("C#");
    }
}
