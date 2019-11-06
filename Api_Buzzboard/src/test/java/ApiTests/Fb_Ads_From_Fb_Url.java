package ApiTests;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Fb_Ads_From_Fb_Url {
	
	public Fb_Ads_From_Fb_Url(){
		super();
	}
	
	@BeforeClass
	public void setbaseUri(){
			RestAssured.baseURI="http://beta.discover-prospects.com:8086/v4";
			
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void Verify_Fb_Ads_From_Fb_Url() throws ParseException{
		
		RequestSpecification request = RestAssured.given().header("Authorization",
				"Bearer 5e0a50d50229b7f0a49c2c6f814e01a9258ac927");
		
		request.header("Content-Type", "application/json");
		
		JSONObject requestparams = new JSONObject();
		
		requestparams.put("facebook_id", "290251584339448");
		
		request.body(requestparams.toString());
		
		Response response = request.post("/facebook/adds_info");
		
		long responsetime = response.getTime();
		
		System.out.println(responsetime);
		
		String responsebody = response.getBody().toString();
		
		//System.out.println(responsebody);
		
		JSONParser jp= new JSONParser();
		
		JSONObject JsonResult = (JSONObject) (jp.parse(responsebody));
		
		String Status = JsonResult.get("status").toString();
		
		System.out.println(Status);
		
		
		
		
		
	
	}
	

}
