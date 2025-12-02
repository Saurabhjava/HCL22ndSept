package com.hackerrank.sample;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
		RestTemplate rt = new RestTemplate();
		String result = rt.getForObject("https://jsonmock.hackerrank.com/api/inventory", String.class);
		JSONObject jsonObj = new JSONObject(result);

		JSONArray arr =jsonObj.getJSONArray("data");
		for (int i = 0; i < arr.length(); i++) {
			JSONObject obj = arr.getJSONObject(i);
			int price=obj.getInt("price");
			if(price>100 && price<200)
				System.out.println(obj.getString("item"));
		}

		System.out.println(result);

	}

}
