package firstIOC;
public class TennisCoach implements Coach
{
	private IFortune ifortune;
	public TennisCoach(IFortune ifortune)
	{
		this.ifortune=ifortune;
	}
	@Override
	public String getDailyWorkout()
	{
		// TODO Auto-generated method stub
		return "Practice Tennis";
	}
	@Override
	public String getDailyFortune()
	{
		// TODO Auto-generated method stub
		return ifortune.getDailyFortune();
	}
}