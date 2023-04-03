interface shape
{
	void draw();
}
class rectangele implements shape 
{
	@Override
	public void draw()
	{
		System.out.println("draw");
	}
}
class circle implements shape 
{
	@Override
	public void draw()
	{
		System.out.println("draw");
	}
}
public class cau1lab8
{
	public static void main (String[] args)
	{
		rectangele r = new rectangele();
		circle c = new circle();
		r.draw();
		c.draw();
	}
}