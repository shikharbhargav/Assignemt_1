import java.util.ArrayList;

import static io.restassured.RestAssured.*;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class APITesting {

public static void main(String args[]) {getResponseStatus();}

 
public static void getResponseStatus(){
     given().pathParam("status", "pending").when().get("https://petstore.swagger.io/v2/pet/findByStatus?status={status}").then().assertThat().statusCode(200);
     int statusCode= given().pathParam("status", "pending").when().get("https://petstore.swagger.io/v2/pet/findByStatus?status={status}").getStatusCode();
     System.out.println("The response status is "+statusCode);
}

}