package postman;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://rahulshettyacademy.com";
		 String response=given().relaxedHTTPSValidation().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body("{ \r\n"
		 		+ "\r\n"
		 		+ "    \"place_id\":\"b28c028e47cb83c491500f631db57dad\" \r\n"
		 		+ "\r\n"
		 		+ "} ").when().delete(" /maps/api/place/delete/json").then().log().all().assertThat().statusCode(200).extract().asString();
		 System.out.println(response);
	}

}
