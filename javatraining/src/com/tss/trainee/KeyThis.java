package com.tss.trainee;

public class KeyThis {
	
	String name;
	
	KeyThis(String original){
		name=original;
		System.out.println("name is "+ name);
	}
	
	public static void main(String[] args) {
		KeyThis obj=new KeyThis("chinna");
	}
}
