package com.tss.strings;

public class CharAtOddPosition {
	
	public static void main(String[] args) {
		String name="chinna bodicherla";
		for(int i=0;i<name.length();i++) 
			if(i%2!=0)  System.out.println("char present in "+i+" position "+name.charAt(i));
	}
}
