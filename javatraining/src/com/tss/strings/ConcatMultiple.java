package com.tss.strings;

public class ConcatMultiple {

	public static void main(String[] args) {

		String s = "chinna";

		String st = "bodicherla";

		String str = "venkat";

		String stri = s.concat(st).concat(" ").concat(str);

		System.out.println(stri);

		System.out.println(stri.concat("subbaiah"));
	}
}
