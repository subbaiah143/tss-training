package com.tss.strings;

public class Contains {

	public static void main(String[] args) {

		String str = "chinna is my name";

		boolean bool = str.contains("is");

		System.out.println(bool);

		System.out.println(str.contains("my"));

		System.out.println(str.contains("a"));

		System.out.println(str.contains("are"));
	}
}
