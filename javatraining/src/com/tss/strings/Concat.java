package com.tss.strings;

public class Concat {
	
	public static void main(String[] args) {
		
		String name="chinna";
		
		name.concat("bodicerla"); 
		//variable is not assign to that string 
		
		System.out.println(name);
		
		name=name.concat("bodicherla");
		
		System.out.println(name);
	}
}
