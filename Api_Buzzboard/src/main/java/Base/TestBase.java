package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
 public	static Properties prop;
 
 public static FileInputStream fis;
	
	public TestBase() throws FileNotFoundException{
		
		prop = new Properties();
		
		fis = new FileInputStream("D:\\Scripts\\4195\\workspace\\Api_Buzzboard\\src\\main\\java\\Config\\config.properties");
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
