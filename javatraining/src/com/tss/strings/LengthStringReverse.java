package com.tss.strings;

public class LengthStringReverse {

	public static void main(String[] args) {

		String str = "chinna";

		System.out.println("original string " + str);

		/*
		 * for (int i = 0; i < str.length(); i++)
		 * System.out.print(str.charAt(str.length() - i - 1));
		 */

		for (int i = str.length() - 1; i >= 0; i--)
			System.out.print(str.charAt(i));
	}
}
