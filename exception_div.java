package sample;
import java.util.Scanner;
public class Division 
{
	private static Scanner sc;

	public static void main(String[] args)
	{
		int a,b,result;
		sc = new Scanner(System.in);
		try
		{
			a=sc.nextInt();
			b=sc.nextInt();
			result=a/b;
			System.out.println("Result:"+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dividing by zero not possible");
		}
	}
}
	
