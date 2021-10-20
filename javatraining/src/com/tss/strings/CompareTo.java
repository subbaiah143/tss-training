package com.tss.strings;

public class CompareTo {

	public static void main(String[] args) {
		String s = "hello";
		String st = "hello";
		String str = "heklo";
		String stri = "haklo";
		String strin = "flag";
		/*
		 * s1==s2 0 s1>s2 positive value s1<s2 negative value
		 */
		System.out.println(s.compareTo(st));
		System.out.println(s.compareTo(str));
		System.out.println(str.compareTo(stri));
		System.out.println(s.compareTo(strin));
	}
}
