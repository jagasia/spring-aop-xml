package com.cts.hrms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Mathematics m=(Mathematics) ctx.getBean("maths");
        m.calculateSum();
        System.out.println(m.getResult());
        m.calculateDifference();
        System.out.println(m.getResult());
        m.calculateProduct();
        System.out.println(m.getResult());
    }
}
