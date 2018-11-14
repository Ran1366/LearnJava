import java.util.*;

public class Splits
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		String[] aa = a.split(",");
		for(String aaa : aa)
		{
			System.out.print(aaa+",");
		}
	}
}