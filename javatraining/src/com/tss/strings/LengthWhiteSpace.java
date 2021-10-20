package com.tss.strings;

public class LengthWhiteSpace {

	public static void main(String[] args) {

		String str = "chinna is my name";

		int sizeWithWhiteSpace = str.length();

		System.out.println("size with white space " + sizeWithWhiteSpace);

		str = str.replace(" ", "");

		int sizeWithOutWhiteSpace = str.length();

		System.out.println("size with outspace " + sizeWithOutWhiteSpace);

		int noOfWhiteSpaces = sizeWithWhiteSpace - sizeWithOutWhiteSpace;

		System.out.println("total no of white spaces in the string " + noOfWhiteSpaces);
	}
}
