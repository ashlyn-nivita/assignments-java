import java.util.*;
import java.lang.*;
import java.io.*;
class power
{
	public static void main (String[] args) 
	{
		int i,n,p,r=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		p=sc.nextInt();
		for(i=1;i<=p;i++)
		{
			r=r*n;
		}
	System.out.println(+r);

	}
}
