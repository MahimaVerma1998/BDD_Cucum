package BDD_StepDef;


import org.apache.http.entity.ContentType;
import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;

public class BDD_Patch {
	@Given("update data")
	public void update_data() {
		JSONObject request = new JSONObject();
		request.put("name", "Reena");
		request.put("job", "Engineer");
		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().patch("https://reqres.in/api/users/2").then().statusCode(200).log()
				.all();
	}
}
