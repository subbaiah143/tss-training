package com.tss.develop;

public class OverLoad {

	public void loadMethod() {
		System.out.println("zero members in method");
	}

	public void loadMethod(String name) {
		System.out.println("member name is" + " " + name);
	}

	public void loadMethod(String name, int value) {
		System.out.println("member name is" + " " + name + " " + "roll is" + " " + value);
	}

	public void loadMethod(String name, int value, double num) {
		System.out
				.println("member name is" + " " + name + " " + "roll is" + " " + value + " " + "marks is" + " " + num);
	}

	public void loadMethod(double num, int value) {
		System.out.println("double value is" + " " + num + " " + "int value is" + " " + value);
	}
}
