package BDD_StepDef;

import org.json.simple.JSONObject;

import cucumber.api.java.en.Given;


public class BDD_Put {
	@Given("update user data")
	public void update_user_data() {
		JSONObject request = new JSONObject();
		request.put("name", "Mahima");
		request.put("job", "Engineer");
		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log()
				.all();
	}
}
