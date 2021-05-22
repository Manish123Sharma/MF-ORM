package firstIOCget;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MyApp
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		Coach coach=(Coach)context.getBean("ccoach3");
//		Coach coach1=(Coach)context.getBean("address3");
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getName());
		System.out.println(coach.toString());
	}
}