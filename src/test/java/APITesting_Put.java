import java.util.ArrayList;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class APITesting_Put {

public static void main(String args[]) {getResponseStatus();}

 
public static void getResponseStatus(){
	
	String payload = "{  \"id\": 0,  \"category\": {    \"id\": 0,    \"name\": \"string\"  },  \"name\": \"doggie\",  \"photoUrls\": [    \"string\"  ],  \"tags\": [    {      \"id\": 0,      \"name\": \"string\"    }  ],  \"status\": \"available\"}";
     given().contentType(ContentType.JSON)
     .body(payload).when().post("https://petstore.swagger.io/v2/pet").then().assertThat().statusCode(200);
     
     System.out.println("The response status is success");
}

}