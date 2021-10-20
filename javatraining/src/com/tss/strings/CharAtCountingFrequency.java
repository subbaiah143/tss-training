package com.tss.strings;

public class CharAtCountingFrequency {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int count = 0;
		String name = "chinna bodicherla";
		for (int i = 0; i < name.length(); i++)
			if (name.charAt(i) == 'n') count++;
		//System.out.println("frequency of char n in string  " + count);
		countCharacters("chinna bodicherla",'n');
	}
	
	public static void countCharacters(String s,char c) {
		int count=0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == c) count++;
		System.out.println("frequency of char '"+c+"' in string  " + count);
	}
}
