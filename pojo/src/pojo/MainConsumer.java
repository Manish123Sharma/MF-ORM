package pojo;
public class MainConsumer
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Consumer c1 = new Consumer(Factory.getObject());
		c1.work();
//		Producer producer1 = new FastProducer();
//		producer1.first();
	}
}