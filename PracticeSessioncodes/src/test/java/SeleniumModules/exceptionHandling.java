package SeleniumModules;

public class exceptionHandling {

	public static void main(String[] args) {
		
		int num;
		
		try {
			num = 50/0;  //Code throwing arithmetic exception is placed in the try block
		} catch (Exception e) {
			
			System.out.println("Exception Details-"+e);
		}
		
		System.out.println("rest of the code");
		
		

	}

}
