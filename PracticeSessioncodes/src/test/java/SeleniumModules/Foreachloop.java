package SeleniumModules;

public class Foreachloop {
	
	public static void main(String[] args) {
		
		//Declaring integer type array variable and assign 5 values
		int var[] = {1,2,3,4,5};
		
		// creating for loop for printing the array element values
		for(int x:var)
		{
			System.out.println(var[x+1]);
		}
	}
		
	

}
