package com.tss.strings;

public class EndsWithCondition {

	public static void main(String[] args) {

		String str = "chinnabodicherla@gmail.com";

		System.out.println(str.endsWith(".in"));

		if (str.endsWith(".com"))
			System.out.println("string ends with .com");
		else
			System.out.println("it does not ends with .com");
	}
}
