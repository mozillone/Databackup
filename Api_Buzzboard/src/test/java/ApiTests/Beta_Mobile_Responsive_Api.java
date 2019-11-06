package ApiTests;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeClass;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class Beta_Mobile_Responsive_Api {

	public Beta_Mobile_Responsive_Api() {
		super();
	}

	@BeforeClass
	public void setbaseUri() {

		RestAssured.baseURI = "http://beta.discover-prospects.com:8086/v4";

	}

	@BeforeClass
	public void Verify_Mobile_Responsive_Api() throws ParseException {

		RequestSpecification request = RestAssured.given().header("Authorization",
				"Bearer 5e0a50d50229b7f0a49c2c6f814e01a9258ac927");

		request.header("Content-Type", "application/json");

		JSONObject requestparams = new JSONObject();

		requestparams.put("url", "http://www.crownad.com");

		requestparams.put("country_code", "us");

		request.body(requestparams.toString());

		Response response = request.post("/website/responsive");

		long responsetime = response.getTime();

		System.out.println(responsetime);

		String responsebody = response.getBody().toString();

		//System.out.println(responsebody);

		JSONParser jp = new JSONParser();

		JSONObject JsonResult = (JSONObject) (jp.parse(responsebody));

		String Status = JsonResult.get("status").toString();

		System.out.println(Status);

		String responsive = JsonResult.get("responsive").toString();

		System.out.println(responsive);

		String mobile_compatible = JsonResult.get("mobile_compatible").toString();

		System.out.println(mobile_compatible);

		String mobile_url = JsonResult.get("mobile_url").toString();

		System.out.println(mobile_url);
		
		JSONObject jsonMeta = (JSONObject) (JsonResult.get("meta"));
		
		System.out.println("request_reference_id: " +jsonMeta.get("request_reference_id"));

	}

}
