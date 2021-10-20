package com.tss.strings;

public class Equals {

	public static void main(String[] args) {

		String s = "chinna";

		String st = "chinna";

		String str = "CHInna";

		String stri = "sreenu";

		System.out.println(s.equals(st));

		System.out.println(s.equals(str));

		System.out.println(s.contentEquals(stri));
	}
}
