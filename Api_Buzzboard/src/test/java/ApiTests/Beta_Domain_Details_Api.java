package ApiTests;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Beta_Domain_Details_Api {

	public Beta_Domain_Details_Api() {
		super();

	}

	@BeforeClass
	public void setbaseURI() {

		RestAssured.baseURI = "http://beta.discover-prospects.com:8086/v4";

	}

	@Test
	public void VerifyBeta_Domain_Details_Api() throws ParseException {

		RequestSpecification request = RestAssured.given().header("Authorization",
				"Bearer 5e0a50d50229b7f0a49c2c6f814e01a9258ac927");

		request.header("Content-Type", "application/json");

		JSONObject requestparams = new JSONObject();

		requestparams.put("domain", "cescany.com");

		request.body(requestparams.toString());

		Response response = request.post("/domain/details");

		String responsebody = response.getBody().asString();

		//System.out.println("Response Body is =>" + responsebody);

		long responsetime = response.getTime();

		System.out.println("Response Time is: " + responsetime);

		JSONParser jp = new JSONParser();

		JSONObject JsonResult = (JSONObject) (jp.parse(responsebody));

		// System.out.println("Status : "+jsonResult.get("status"));

		String Status = JsonResult.get("status").toString();

		System.out.println("Status is: " + Status);

		JSONObject JsonData = (JSONObject) (JsonResult.get("data"));

		//System.out.println(JsonData);

		JSONObject JsonRegister = (JSONObject) (JsonData.get("registration"));

		//System.out.println(JsonRegister);
		
		System.out.println("Created Date : " + JsonRegister.get("createdDate"));

		System.out.println("RegistrarName : " + JsonRegister.get("registrarName"));

		System.out.println("ExpiresDate : " + JsonRegister.get("expiresDate"));

		System.out.println("UpdatedDate : " + JsonRegister.get("updatedDate"));

		System.out.println("Registrant : " + JsonRegister.get("registrant"));

		//JSONObject JsonNameServer = (JSONObject) (JsonRegister.get("name_servers"));

		//System.out.println(JsonNameServer);

		//JSONObject Jsonmeta = (JSONObject) (JsonResult.get("meta"));

		//System.out.println(Jsonmeta);

	}
}
