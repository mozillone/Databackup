package SeleniumModules;

public class classOne 
{
	public static void main(String args[])
	{
		System.out.println("Inside the main Method");
		
		classTwo object2 = new classTwo();
		
		object2.two();
	}
}
class classTwo
{
	public void two()
	{
		System.out.println("Inside class two");
	}
	
}
