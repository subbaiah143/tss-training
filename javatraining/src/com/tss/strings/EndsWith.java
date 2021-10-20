package com.tss.strings;

public class EndsWith {

	public static void main(String[] args) {

		String str = "my name is chinna";

		System.out.println(str.endsWith("chinna"));

		System.out.println(str.endsWith("chinnA"));

		System.out.println(str.endsWith("nna"));

		System.out.println(str.endsWith("my"));

		System.out.println(str.endsWith("a"));
	}
}
