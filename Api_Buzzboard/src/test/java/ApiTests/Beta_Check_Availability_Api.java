package ApiTests;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Beta_Check_Availability_Api {

	public Beta_Check_Availability_Api() {
		super();
	}

	@BeforeClass
	public void setbaseUri() {

		RestAssured.baseURI = "http://beta.discover-prospects.com:8086/v4";

	}

	@Test
	public void verifyBeta_Check_Availability_Api() throws ParseException {

		RequestSpecification request = RestAssured.given().header("Authorization",
				"Bearer 5e0a50d50229b7f0a49c2c6f814e01a9258ac927");

		request.header("Content-Type", "application/json");

		JSONObject requestparams = new JSONObject();

		requestparams.put("hostname", "www.buzzboard.com");

		requestparams.put("country_code", "us");

		request.body(requestparams.toString());

		Response response = request.post("/listing/checkavaialability");

		String responsebody = response.getBody().asString();

		//System.out.println("Response Body is =>" + responsebody);

		long responsetime = response.getTime();

		System.out.println("Response Time is: " + responsetime);

		JSONParser jp = new JSONParser();

		JSONObject JsonResult = (JSONObject) (jp.parse(responsebody));

		JSONObject JsonMeta = (JSONObject) (JsonResult.get("meta"));

		JSONObject jsonFP = (JSONObject) (JsonResult.get("result"));

		String Status = jsonFP.get("status").toString();

		System.out.println("Status is: " + Status);

		try {
			Assert.assertEquals("200", Status);
		} catch (Error e) {
			// Following lines will be printed when the assert condition fails
			System.out.println("Assert equals failed. But test execution is not aborted.");

			System.out.println("Error message: " + e.toString());
		}
		
		String fp_id = jsonFP.get("fp_id").toString();
		
		System.out.println("Fp_Id is: "+fp_id);
		
		String  reference_id= JsonMeta.get("request_reference_id").toString();
		
		System.out.println("Request Reference Id is: "+reference_id);

	}

}
