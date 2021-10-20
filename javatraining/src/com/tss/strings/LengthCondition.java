package com.tss.strings;

public class LengthCondition {
	public static void main(String[] args) {

		String str = "chinna";

		if (str.length() > 0)
			System.out.println("string is not empty length is " + str.length());

		str = "";

		if (str.length() == 0)
			System.out.println("string is empty " + str.length());
	}
}