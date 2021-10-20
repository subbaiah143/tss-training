package com.tss.strings;

public class EqualsWithCondition {

	public static void main(String[] args) {

		String st = "chinna";

		String str = "chinna";

		String stri = "sreenu";

		System.out.println(st.equals(str));

		if (str.equals(stri))
			System.out.println("both strings are equal");
		else
			System.out.println("strings are not equal");
	}
}
