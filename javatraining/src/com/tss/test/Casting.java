package com.tss.test;

public class Casting extends UpCasting{
	
	public void cast() {
		System.out.println("child class cast method");
	}
	
	public void downCast() {
		System.out.println("down cast method");
	}
	
	public static void main(String[] args) {
		/*upcasting 
		 * child object and parent referance
		 * by this up casting only access parent class members and child class override method
		 */
		UpCasting obj=new Casting();
		obj.upCast();
		obj.cast();
	}
}
