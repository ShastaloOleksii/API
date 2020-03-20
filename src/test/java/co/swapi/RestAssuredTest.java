package co.swapi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class RestAssuredTest extends Father {

    @Test(description = "GET")
    public void getAllUsers() throws JSONException {
        Response response = when().get(BASEURLFIRSTPART + BASEURLPARTTWO + TOKEN);
        response.prettyPeek();

    }

    @Test(description = "GET")
    public void checkGenderUserId365() throws JSONException {
        Response response = when().get(BASEURLFIRSTPART + OTTO + BASEURLPARTTWO + TOKEN);
        response.prettyPeek();
        response.then().statusCode(200)
                .and()
                .assertThat()
                .body("result.gender", equalTo("male"));
    }

    @Test(description = "GET")
    public void checkNameUser365() {
        when().
                get(BASEURLFIRSTPART + OTTO + BASEURLPARTTWO + TOKEN).
                then().
                statusCode(200).assertThat()
                .body("result.first_name", equalTo("Otto"));

    }

    @Test(description = "GET")
    public void checkGenderUserId366() throws JSONException {
        Response response = when().get(BASEURLFIRSTPART + KENYON + BASEURLPARTTWO + TOKEN);
        response.prettyPeek();
        response.then().statusCode(200)
                .and()
                .assertThat()
                .body("result.gender", equalTo("male"));
    }

    @Test(description = "GET")
    public void checkNameUser366() {
        when().
                get(BASEURLFIRSTPART + KENYON + BASEURLPARTTWO + TOKEN).
                then().
                statusCode(200).assertThat()
                .body("result.first_name", equalTo("Kenyon"));


    }

    @Test(description = "POST")
    public void postCreateUserFemale() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.header("Authorization", BEARER);
        request.body(femaleData);
        Response response = request.post(BASEURLFIRSTPART).prettyPeek();
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 302);

    }

    @Test(description = "POST")
    public void postCreateUserMale() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.header("Authorization", BEARER);
        request.body(maleData);
        Response response = request.post(BASEURLFIRSTPART).prettyPeek();
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 302);

    }

    @Test(description = "DELETE")
    public void deleteUser() {
        RestAssured.baseURI = BASEURLFIRSTPART;

        Response response = null;
        try {
            response = RestAssured.given()
                    .contentType(ContentType.JSON).header("Authorization", BEARER)
                    .delete("/360").prettyPeek();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 204);
    }

    @Test(description = "PUT")
    public void testPUT() {
        RestAssured.baseURI = BASEURLFIRSTPART;
        Map<String, String> map = new HashMap<String, String>();
        map.put("first_name", "Luke");
        map.put("last_name", "SkyWalker");
        map.put("gender", "male");
        map.put("email", "luke9@skkky.com");
        map.put("status", "active");
        Response response =
                RestAssured.given().body(map)
                        .when()
                        .contentType(ContentType.JSON)
                        .header("Authorization", BEARER)
                        .put("/369").prettyPeek();
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

    }


    @Test(description = "PUT")
    public void testPUT362() {
        RestAssured.baseURI = BASEURLFIRSTPART;
        Map<String, String> map = new HashMap<String, String>();
        map.put("first_name", "Solomia");
        map.put("last_name", "Shastalo");
        map.put("gender", "female");
        map.put("email", "solomia2017@shas.com");
        map.put("status", "active");
        Response response =
                RestAssured.given().body(map)
                        .when()
                        .contentType(ContentType.JSON)
                        .header("Authorization", BEARER)
                        .put("/369").prettyPeek();
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

    }

    @Test(description = "DELETE")
    public void deleteUser373() {
        RestAssured.baseURI = BASEURLFIRSTPART;

        Response response = null;
        try {
            response = RestAssured.given()
                    .contentType(ContentType.JSON).header("Authorization", BEARER)
                    .delete("/373").prettyPeek();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 204);
    }

}
