package SI;
public class Baseball implements Coach 
{
	private IFortune ifortune;
	public Baseball(IFortune ifortune) 
	{
		this.ifortune = ifortune;
    }
	@Override
	public String getDailyWorkout() 
	{
		// TODO Auto-generated method stub
		return "Play the match of baseball";
	}
	@Override
	public String getDailyFortune() 
	{
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}
}