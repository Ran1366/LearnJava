class Base
{
	public Base()
	{
		System.out.println("������޲ι�����");
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
		System.out.println("������޲ι�����");
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Subclass test = new Subclass();
			
	}
}
