package test;

import com.busi.test5.Greeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author antoWorld
 * @description 描述
 * @create 2017/6/7 19:56
 */
public class TestRun5 {
    public static void main(String[] args){
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring-application5.xml");
        Greeting greeting = (Greeting)context.getBean("greetingImpl");
        /**
         * xml 为所有的切面类自动创建了代理，示例中的切面指定do开头的方法指定了增强实现
         */
        greeting.doEat("java");
    }
}
