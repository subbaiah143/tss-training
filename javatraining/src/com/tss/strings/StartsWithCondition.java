package com.tss.strings;

public class StartsWithCondition {

	public static void main(String[] args) {

		String str = "chinna";

		if (str.startsWith(""))
			// string in java always starts with empty string
			System.out.println("string starts with empty string");
		else
			System.out.println("does not starts with empty string");
	}
}
