package qaautomation.march2022.utils;

import java.util.Locale;

import org.json.JSONObject;

import com.github.javafaker.Faker;

public class Datautility2 {

	public static JSONObject getData() {

		JSONObject data = new JSONObject();

		Faker faker = new Faker(new Locale("id_ID"));
		String username = faker.name().firstName();
		String password = faker.internet().password();
		String mail = faker.name().firstName() + "@gmail.com";
		String phone = faker.phoneNumber().phoneNumber();

		data.put("username", username);
		data.put("password", password);
		data.put("email", mail);
		data.put("phonenumber", phone);

		return data;

	}

}
