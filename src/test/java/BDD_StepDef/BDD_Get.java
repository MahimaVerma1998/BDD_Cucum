package BDD_StepDef;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


import io.cucumber.java.en.Given;

public class BDD_Get {
	@Given("get url for BDD")
	public void get_url_for_bdd() {
		 given()
			.when()
			.get("https://reqres.in/api/users?page=2")
			.then()
			.statusCode(200)
			.log().all()
			.assertThat()
					.body("data[1].id", equalTo(8))
					.body("data[1].email", equalTo("lindsay.ferguson@reqres.in"))
					.body("data[1].first_name", equalTo("Lindsay"))
					.body("data[1].last_name", equalTo("Ferguson"));
	}

	@Given("get the url for BDD")
	public void get_the_url_for_bdd() {
		given().when().get("https://reqres.in/api/users/2").then().statusCode(200).log().all().assertThat()
		.body("data.id", equalTo(2)).assertThat().body("data.email", equalTo("janet.weaver@reqres.in"))
		.assertThat().body("data.first_name", equalTo("Janet")).assertThat()
		.body("data.last_name", equalTo("Weaver")).assertThat()
		.body("data.avatar", equalTo("https://reqres.in/img/faces/2-image.jpg"));
	}

	@Given("get this url for BDD")
	public void get_this_url_for_bdd() {
		given().when().get("https://reqres.in/api/users/23").then().statusCode(404).log().all().assertThat().body("data.page",
				equalTo(null));
	}

	@Given("get list url for BDD")
	public void get_list_url_for_bdd() {
		given().when().get("https://reqres.in/api/unknown").then().statusCode(200).log().all().assertThat()
		.body("data[0].id", equalTo(1)).body("data[0].name", equalTo("cerulean"))
		.body("data[0].year", equalTo(2000)).body("data[0].color", equalTo("#98B2D1")).assertThat()
		.body("data[0].pantone_value", equalTo("15-4020"));
	}

	@Given("get single resource  url for BDD")
	public void get_single_resource_url_for_bdd() {
		given()
		.when()
		.get("https://reqres.in/api/unknown/2")
		.then()
		.statusCode(200)
		.log().all()
		
		.assertThat()
				.body("data.id", equalTo(2))
				.body("data.name", equalTo("fuchsia rose"))
				.body("data.year", equalTo(2001))
				.body("data.color", equalTo("#C74375"))
				.body("data.pantone_value", equalTo("17-2031"));
	}

	@Given("get single resource not found  url for BDD")
	public void get_single_resource_not_found_url_for_bdd() {
		given()
		.when()
		.get("https://reqres.in/api/unknown/23")
		.then()
		.statusCode(404)
		.log().all()
		
		.assertThat()
		.body("data.page",equalTo(null));
	}

	@Given("get delayed response url for BDD")
	public void get_delayed_response_url_for_bdd() {
		given()
		.when()
		.get("https://reqres.in/api/users?delay=3")
		.then()
		.statusCode(200)
		.log().all()
		
		.assertThat()
				.body("data[1].id", equalTo(2))
				.body("data[1].email", equalTo("janet.weaver@reqres.in"))
				.body("data[1].first_name", equalTo("Janet"))
				.body("data[1].last_name", equalTo("Weaver"));
	}
}
