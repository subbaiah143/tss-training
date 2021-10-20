package com.tss.trainee;

public class FinalInterface implements FirstInterface, SecondInterface {

	public void interface1() {
		System.out.println("interface1 in childclass");
	}

	public void interface2() {
		System.out.println("interface2 in childclass");
	}

	public static void main(String[] args) {
		FinalInterface obj = new FinalInterface();
		obj.interface1();
		obj.interface2();
		System.out.println(VALUE);
		System.out.println(value2);
	}

	@Override
	public void AbsMethod() {
		// TODO Auto-generated method stub
		
	}
}
