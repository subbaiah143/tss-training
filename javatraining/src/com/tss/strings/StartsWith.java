package com.tss.strings;

public class StartsWith {

	public static void main(String[] args) {

		String str = "chinna is my name";

		System.out.println(str.startsWith("chi"));

		System.out.println(str.startsWith("chinna is"));

		System.out.println(str.startsWith("Chinna is"));

		System.out.println(str.startsWith("c"));

		System.out.println(str.startsWith("h"));

		System.out.println(str.startsWith("h", 1));
	}
}
