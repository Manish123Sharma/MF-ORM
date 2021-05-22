package firstIOC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MyApp
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		Coach coach=(Coach)context.getBean("myTCoach1");
		Coach coach1=(Coach)context.getBean("myBCoach1");
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach1.getDailyFortune());
	}
}