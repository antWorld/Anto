package test;

import com.busi.test4.Greeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/6/7 19:56
 */
public class TestRun4 {
    public static void main(String[] args){
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring-application4.xml");
        Greeting greeting = (Greeting)context.getBean("greetingImpl");
        /**
         * xml 为所有的切面类自动创建了代理，示例中的切面指定do开头的方法指定了增强实现
         */
        greeting.doSleep("java");
        greeting.doWork("C++");
        greeting.sayHello("C#");
    }
}
