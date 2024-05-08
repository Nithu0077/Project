package postman;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class put {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://rahulshettyacademy.com";
		 String response=given().relaxedHTTPSValidation().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body("{ \r\n"
		 		+ "\r\n"
		 		+ "\"place_id\":\207c5521f9bd4e274ae1d47addb4ce84\", \r\n"
		 		+ "\r\n"
		 		+ "\"address\":\"70 Summer walk, USA\", \r\n"
		 		+ "\r\n"
		 		+ "\"key\":\"qaclick123\" \r\n"
		 		+ "\r\n"
		 		+ "} \r\n"
		 		+ "\r\n"
		 		+ " ").when().put("/maps/api/place/update/json").then().log().all().assertThat().statusCode(200).extract().asString();
		 System.out.println(response);
	
	}

}
