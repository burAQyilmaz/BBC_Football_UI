package com.exchangerate_API;

import io.cucumber.java.BeforeAll;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.hasKey;

public class ExchangeRate {

    String url = "https://v6.exchangerate-api.com/v6/1fc80820c72b0163bc9c7536/latest/USD";

    Response response;

    @Before
    public void test() {

        response = given().accept(ContentType.JSON)
                .get(url).prettyPeek()
                .then()
                .extract().response();
    }

    @Test
    public void test1() {

        response.then().statusCode(200);
    }

    @Test
    public void test2() {

        int totalNumber = response
                .path("conversion_rates.size()");

        System.out.println("Count the total number of currencies returned within the response: " + totalNumber);

    }

    @Test
    public void test3() {

        response.then().body("conversion_rates", hasKey("GBP"));
    }

}
