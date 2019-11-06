package SeleniumModules;

public class deleteDemo {

	public static void main(String[] args) {
		
		StringBuffer object1 = new StringBuffer("ABCD1234EFGH");
		
		System.out.println("object1 before using delete() method for deleting '1234'- ");
		
		System.out.println(object1);
		
		//deletes a set of characters from the StringBuffer's object.
		object1.delete(4, 8);
		
		System.out.println("object1 After using delete() method for deleting '1234'- ");
		
		System.out.println(object1);
		
		//reverses the characters in StringBuffer's object.
		object1.reverse();
		
		System.out.println(object1);
		
		StringBuffer object2 = new StringBuffer("I HATE YOU");
		
		String str = "LOVE";
		
		System.out.println("object2 before using replace() method - ");
		System.out.println(object2);
		
		object2.replace(2, 6, str);
		
		System.out.println("object2 after using replace() method - ");
		System.out.println(object2);

	}

}
