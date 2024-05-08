package postman;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://rahulshettyacademy.com";
		 String response=given().relaxedHTTPSValidation().log().all().queryParam("key","qaclick123").queryParam("place_id","a90503cc64e55cecd6da5acff053ec39").header("Content-Type","application/json").when().get("/maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().asString();
		 System.out.println(response);
	}

}
