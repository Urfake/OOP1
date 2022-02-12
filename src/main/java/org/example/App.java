package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Miner miner = (context.getBean("getMiner1", Miner.class));
        miner.run();

        Miner miner1 = (context.getBean("getMiner2", Miner.class));
        miner1.run();

        context.close();

        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (context1.getBean("getHello", HelloWorld.class));
        helloWorld.hello();
    }
}
