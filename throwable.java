package sample;
public class Test 
{
	static void avg()throws ArithmeticException
	{
		System.out.println("Exception caught");
		throw new ArithmeticException("demo");
	}
public static void main(String args[])
{
	try
	{
		avg();
	}
	catch(ArithmeticException e)
	{
		System.out.println("caught"+e);
	}
}
}
