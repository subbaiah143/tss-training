package com.tss.tasks;

import java.io.*;

public class StringToTitleCase {
	
	public static String titleCaseLetters(String str) {
		str = str.substring(0, 1).toUpperCase()+ str.substring(1);
		StringBuilder builder= new StringBuilder(str);
		for (int i = 0; i < builder.length(); i++) {
			if (builder.charAt(i) == ' ') {
				builder.deleteCharAt(i);
				builder.replace(i, i + 1,String.valueOf(Character.toUpperCase(builder.charAt(i))));
			}
		}
		return builder.toString();
	}
	
	public static void main(String[] args) {
		String str = "my name is chinna";
		str = titleCaseLetters(str);
		System.out.println(str);
	}
}
