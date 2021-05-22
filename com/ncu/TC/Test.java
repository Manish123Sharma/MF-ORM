package com.ncu.TC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test 
{
    public static void main(String[] args) 
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
     Iworker fp = (Iworker)context.getBean("lwork", Iworker.class);
//	    IWorker p = new Producer(fp);
        Consumer c = new Consumer(fp);
        c.consumer();
    }
}