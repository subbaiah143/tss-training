package com.tss.strings;

public class EqualsIgnoreCase {

	public static void main(String[] args) {

		String s = "chinna";

		String st = "ChiNNa";

		String str = "CHINNA";

		String stri = "chinna";

		String strin = "sreenu";

		System.out.println(s.equalsIgnoreCase(st));

		System.out.println(s.equalsIgnoreCase(str));

		System.out.println(s.equalsIgnoreCase(stri));

		System.out.println(s.equalsIgnoreCase(strin));
	}
}
