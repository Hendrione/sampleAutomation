package com.one.ui.automation.api;

import com.one.ui.automation.model.RestaurantResponse;
import io.restassured.http.Header;
import io.restassured.response.Response;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class RestaurantApi extends PageObject {

    public RestaurantResponse getRestaurantDetails(){
        Response response = given()
                .header(new Header("content-type", "application/json"))
                .header(new Header("user-key", "31ec89855a51ace324bd464634a1eb0f"))
                .queryParam("res_id", "7419572")
                .when()
                .get("https://developers.zomato.com/api/v2.1/restaurant")
                .then()
                .statusCode(200)
                .extract().response();

        response.getBody().prettyPrint();
        return response.as(RestaurantResponse.class);
    }
}
