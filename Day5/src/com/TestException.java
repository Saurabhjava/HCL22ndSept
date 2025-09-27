package com;

import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.next();
		int arr[] = { 2, 3, 6, 12, 10 };
		String str = null;
		try {
			System.out.println("Hello");
			System.out.println(10 / 0);
			System.out.println("Hi");
		} catch (ArithmeticException e) {
			System.out.println("Error1");
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error2");
			return;
		} catch (Exception e) {
			System.out.println("Error4");
			return;
		} finally {
			System.out.println("End of Main");
			sc.close();
		}
	}

}