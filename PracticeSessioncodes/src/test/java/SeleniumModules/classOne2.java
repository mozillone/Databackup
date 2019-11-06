package SeleniumModules;

public class classOne2 
{
	public void one()
	{
		System.out.println("Inside the main Method");
	}
	
	
		
		
		
	
}
class classTwo2
{
	public static void main(String args[])
	{
		System.out.println("Inside class two");
		
		classOne2 object2 = new classOne2();
		
		object2.one();
	}
	
}
