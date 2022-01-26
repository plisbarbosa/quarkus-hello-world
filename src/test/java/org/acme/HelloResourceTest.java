package org.acme;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class HelloResourceTest {
	@Test
	public void testHelloEndpoint() {
		given().when().get("/hello").then().statusCode(200).body(is("Hello"));
	}

	@Test
	public void testHelloNameEndpoint() {
		String uuid = UUID.randomUUID().toString();

		given().when().get("/hello/" + uuid).then().statusCode(200).body(is("Hello " + uuid));
	}
}