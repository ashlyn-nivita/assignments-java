package sample;
import java.util.Scanner;
public class multiple 
{
	public static void main(String[] args)
	{
		int a[]=new int[10];
		int i,div,sum;
		Scanner sc=new Scanner(System.in);
		try
		{
		for(i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		div=a[3]/0;
		sum=a[5]+a[11];
		System.out.println(+sum+div);
		}
		catch(ArithmeticException e)
		{
			System.out.println("dividing by zero");
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("array element not found");
		}
	}
}
