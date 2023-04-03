interface car
{
	void accelerate();
}
class bmw implements car 
{
	@Override
	public void accelerate()
	{
		System.out.println("accelerate");
	}
}
class civic implements car
{
	@Override
	public void accelerate()
	{
		System.out.println("accelerate");
	}
}
public class cau3lab8
{
	public static void main (String[] args)
	{
		bmw b = new bmw();
		civic c = new civic();
		b.accelerate();
		c.accelerate();
	}
}