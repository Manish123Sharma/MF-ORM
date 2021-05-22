package Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prototype
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Prototype.xml");
		ICouch coach=(ICouch)context.getBean("myTennisCoach1");
		coach.setName("Manish");
		ICouch coach1 = (ICouch)context.getBean("myTennisCoach1");
		coach1.setName("Sharma");
//		System.out.println("The Name of the Coach is : ");
		System.out.println(coach+"\n"+coach1);
		System.out.println("The Object is equal : "+coach.equals(coach1));
		System.out.println(coach.getName()+"\n"+coach1.getName());
		((ClassPathXmlApplicationContext)context).close();
	}
}