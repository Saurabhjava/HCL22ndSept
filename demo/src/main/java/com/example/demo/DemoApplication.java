package com.example.demo;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		JSONObject userObj=new JSONObject();
		userObj.put("id", 101);
		userObj.put("UserName", "Saurabh");
		userObj.put("Password", "abc123");
		
		JSONObject userObj1=new JSONObject();
		userObj1.put("id", 102);
		userObj1.put("UserName", "Suman");
		userObj1.put("Password", "xyz123");
		
		JSONArray userArr=new JSONArray();
		userArr.put(userObj);
		userArr.put(userObj1);
		System.out.println(userArr);
	}

}
