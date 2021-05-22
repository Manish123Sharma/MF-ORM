package annotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("ccoach5")
public class CricketCoach implements Coach
{
	@Autowired
	private IFortune ifortune;

	public String getDailyWorkout() {
		return "do exercise";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getDailyFortune();
	}
}