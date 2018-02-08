package sample;
public class allocate 
{
	public static void main(String[] args)
	{
		try
		{
			long data[]=new long[10000000];
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("mandate");
		
	}

}
