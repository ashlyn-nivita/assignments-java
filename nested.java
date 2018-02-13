package sample;
public class NestingDemo 
{
	public static void main(String args[])
	{
	try
    {
		try
		{
			try
			{
				int arr[]= {1,2,3,4};
				System.out.println(arr[0]);
			}
			catch(ArithmeticException k)
			{
				System.out.print("Arithmetic Exception");
		        System.out.println(" handled in try-block3");
		    }
		}
		    catch(ArithmeticException k2 )
		    {
		    	System.out.print("Arithmetic Exception");
		     	System.out.println(" handled in main try-block");
		    }
		    catch(ArrayIndexOutOfBoundsException e)
		    {
		    	System.out.print("ArrayIndexOutOfBoundsException");
		     	System.out.println(" handled in main try-block");
		    }
		    catch(Exception e5)
		    {
		    	System.out.print("Exception");
		     	System.out.println(" handled in main try-block");
		    }
	}
	finally
	{
		System.out.println("end");
	}
	}
}
