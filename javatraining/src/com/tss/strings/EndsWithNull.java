package com.tss.strings;

public class EndsWithNull {

	public static void main(String[] args) {

		String str = "chinna bodicherla";

		if (str.endsWith(null))
			System.out.println("inside the if block");
		else
			System.out.println("inside the else block");
	}

}
