package com.tss.strings;

public class EqualsToString {

	public static void main(String[] args) {

		String s = "a";

		String st = "123";

		String str = "9.21";

		String stri = "false";

		Character c = new Character('a');

		Integer b = new Integer(123);

		Float f = new Float(9.21);

		Boolean d = new Boolean(false);

		System.out.println(s.equals(c));

		System.out.println(st.equals(b));

		System.out.println(str.equals(f));

		System.out.println(stri.equals(d));

		System.out.println(s.equals(c.toString()));

		System.out.println(st.equals(b.toString()));

		System.out.println(str.equals(d.toString()));

		System.out.println(stri.equals(d.toString()));
	}
}
