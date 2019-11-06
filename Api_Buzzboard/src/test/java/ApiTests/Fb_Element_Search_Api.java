package ApiTests;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification; 

public class Fb_Element_Search_Api {
	
	public Fb_Element_Search_Api(){
		super();
	}
	
	@BeforeClass
	public void setbaseUri(){
		
		RestAssured.baseURI="http://beta.discover-prospects.com:8086/v4";
	}

	@SuppressWarnings("unchecked")
	@Test
	public void Verify_Fb_Element_Search_Api() throws ParseException{
		RequestSpecification request = RestAssured.given().header("Authorization",
				"Bearer 5e0a50d50229b7f0a49c2c6f814e01a9258ac927");
		
		request.header("Content-Type", "application/json");
		
		JSONObject requestparams = new JSONObject();
		
		requestparams.put("fp_id", "5b9b9dd40aa72c68b59881de");
		
		requestparams.put("country_code", "us");
		
		request.body(requestparams.toString());
		
		Response response = request.post("/fb_element/search");
		
		long responsetime = response.getTime();
		
		System.out.println(responsetime);
		
		String responsebody = response.getBody().prettyPrint();
		
		System.out.println(responsebody);
		
		//JSONParser jp = new JSONParser(); 

		//JSONObject jsonResult = (JSONObject) (jp.parse(responsebody));
		
		//String Status = jsonResult.get("status").toString();
		
		//System.out.println(Status);
		
		
		
		
	}
}
