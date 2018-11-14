class Base
{
	public Base()
	{
		System.out.println("父类的无参构造器");
	}
}
public class Subclass extends Base
{
	
	static int a = 9;
	static {
		a = 6;
	}
	public Subclass()
	{
		System.out.println("子类的无参构造器");
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Subclass test = new Subclass();
			
	}
}
