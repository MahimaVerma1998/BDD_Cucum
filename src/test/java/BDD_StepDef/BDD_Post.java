package BDD_StepDef;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;

public class BDD_Post {

	@Given("create post  data")
	public void create_post_data() {
		JSONObject request = new JSONObject();
		request.put("name", "Mahima");
		request.put("job", "Engineer");
		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201).log()
				.all();;
	}

	@Given("register data sucessfully")
	public void register_data_sucessfully() {
		JSONObject request = new JSONObject();
		request.put("email", "eve.holt@reqres.in");
		request.put("password", "pistol");
		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().post("https://reqres.in/api/register").then().statusCode(200).log()
				.all();;
	}

	@Given("register data unsucessfully")
	public void register_data_unsucessfully() {
		JSONObject request = new JSONObject();
		request.put("email", "eve.holt@reqres.in");
		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().post("https://reqres.in/api/register").then().statusCode(400).log()
				.all();;
	}

	@Given("login data sucessfully")
	public void login_data_sucessfully() {
		JSONObject request = new JSONObject();
		request.put("email", "eve.holt@reqres.in");
		request.put("password", "pistol");
		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().post("https://reqres.in/api/login").then().statusCode(200).log()
				.all();;
	}

	@Given("login data unsucessfully")
	public void login_data_unsucessfully() {
		JSONObject request = new JSONObject();
		request.put("email", "eve.holt@reqres.in");
		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().post("https://reqres.in/api/login").then().statusCode(400).log()
				.all();
	}

}
