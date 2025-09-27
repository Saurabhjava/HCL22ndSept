package com;

public class OTTPlatform {
	public void validateAge(int age) throws NotValidAgeException  {
		if(age < 18) 
			throw new NotValidAgeException("Your aget is not valid for this content.");
	}
	public void watchContent() {
		System.out.println("I am watching this content");
	}
	
	public static void main(String[] args) {
		OTTPlatform ott=new OTTPlatform();
		try {
			ott.validateAge(12);
			ott.watchContent();
		} catch (NotValidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
