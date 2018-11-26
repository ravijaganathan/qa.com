package com.qa.assesment.ravijaganathan;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RavijaganathanApplicationTests {

	private int statusCode = 200;

	@Test
	public void contextLoads() {
	}

	@Test
	public void Test_createServiceEndPointCheck() throws JSONException {

		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("firstName", "Steven"); // Cast
		requestParams.put("lastName", "Doe");
		requestParams.put("accountNumber", "1238");

		request.header("content-type","application/json");

		request.body(requestParams.toString());

		Response response = request.post("http://localhost:8080/account-project/rest/account/json");


		Assert.assertEquals(statusCode, response.statusCode());
	}

	@Test
	public void Test_retriveServiceEndPointCheck(){
		given()
				.get("http://localhost:8080/account-project/rest/account/json")
				.then()
				.statusCode(200);
	}

	@Test
	public void Test_deleteServiceEndPointCheck(){
		Assert.fail("Delete Service before Development");
	}

}
