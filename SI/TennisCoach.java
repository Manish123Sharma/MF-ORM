package SI;
public class TennisCoach implements Coach 
{
	//define a private field for dependency
	private IFortune ifortune;
	public TennisCoach(IFortune ifortune) 
	{
		this.ifortune=ifortune;
	}
	@Override
	public String getDailyWorkout() 
	{
		// TODO Auto-generated method stub
		return "Play the match of tennis";
	}
	@Override
	public String getDailyFortune() 
	{
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}
}