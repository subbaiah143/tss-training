package com.tss.strings;

public class CharAtAccessingFirstLast {

	public static void main(String[] args) {

		String name = "chinna bodicherla";

		int strLen = name.length();

		System.out.println("first char of string " + name.charAt(0));

		System.out.println("last char of string " + name.charAt(strLen - 1));
	}
}
