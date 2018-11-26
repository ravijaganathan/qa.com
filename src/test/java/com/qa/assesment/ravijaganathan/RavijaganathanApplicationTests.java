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

	@Test
	public void contextLoads() {
	}

	@Test
	public void Test_createServiceEndPointCheck() throws JSONException {

//		RestAssured.baseURI ="http://localhost:8080/account-project";
		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("firstName", "Ravi"); // Cast
		requestParams.put("lastName", "Jaganathan");
		requestParams.put("accountNumber", "100001");

//		StringEntity params = new StringEntity(j.toString());
		request.header("content-type","application/json");

		request.body(requestParams.toString());

		//request.body(requestParams);
		Response response = request.post("http://localhost:8080/account-project/rest/account/json");

		int statusCode = 200;
		Assert.assertEquals(statusCode, response.statusCode());
	}

}
