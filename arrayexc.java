package sample;
import java.util.Scanner;
public class array 
{
	private static Scanner sc;

	public static void main(String[] args)
	{
	int a[]=new int[5];
	int i,n,sum=0;
	sc = new Scanner(System.in);
	try
	{
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sum=a[2]+a[9];
		System.out.println(+sum);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("sum cannot be found");
	}
	}
}
