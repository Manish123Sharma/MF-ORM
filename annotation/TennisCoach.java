package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("tcoach")
public class TennisCoach implements Coach
{
	@Autowired
	//define a private field for dependency
	private IFortune ifortune;
//	public TennisCoach(IFortune ifortune) {
//		this.ifortune=ifortune;
//	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Tennis";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getDailyFortune();
	}
}