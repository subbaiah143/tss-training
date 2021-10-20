package com.tss.strings;

public class ConcatSpecialCharacter {
	
	public static void main(String[] args) {
		
		String s="chinna";
		
		String st="bodicherla";
		
		String str="com";
		
		String stri=s.concat(st).concat("@").concat("gmail.").concat(str);
		
		System.out.println("my email id is: "+stri);
	}
}
