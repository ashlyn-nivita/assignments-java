import java.util.*;
import java.lang.*;
import java.io.*;
class sort
{
	public static void main (String[] args)
	{
	int n,i,j,t;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int a[]=new int[n];
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		
	}
	for (i = 0; i < n; i++) 
            {
            for (j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
            }
	for(i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
	
	}
}
