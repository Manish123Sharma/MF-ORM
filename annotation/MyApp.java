package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
		CricketCoach cricket1=(CricketCoach)context.getBean("ccoach5",CricketCoach.class);
    	
//    	System.out.println(cricket.getDailyWorkout());
    	System.out.println(cricket1.getDailyFortune());
    	TennisCoach tennis=(TennisCoach)context.getBean("tcoach",TennisCoach.class);
    	
//    	System.out.println(tennis.getDailyWorkout());
    	System.out.println(tennis.getDailyFortune());
	}
}