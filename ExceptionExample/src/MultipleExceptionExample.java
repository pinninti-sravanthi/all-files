
public class MultipleExceptionExample {
public static void main(String[] args) {
	try
	{
		try
		{
		int a[]=new int[4];
		a[5]=8;
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	try
	{
		int var=15/0;
		System.out.println(var);
	}	
	catch (Exception e) {
	System.out.println(e.getMessage());
	}
	
	}
	catch (Exception e) {
	System.out.println(e.getMessage());
	}
	}
}
