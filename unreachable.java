package sample;
public class Example 
{
	public static void main(String args[])
	{
		try
		{
			int arr[]=new int[7];
			arr[10]=10/5;
		    System.out.println("Last Statement of try block");
	    }
		catch(Exception e)
	    {
	         System.out.println("Some Other Exception");
	    }
	 
	      System.out.println("Out of the try-catch block");
	   }
	}
