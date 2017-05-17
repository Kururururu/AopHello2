package aophello1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 2017-05-17.
 */
public class HelloMain {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aophello1.xml");
        IPrintMsg printMsg = (IPrintMsg)ctx.getBean("printMsg");

        printMsg.sayHello1();
        printMsg.sayHello2();

    }
}
