package com.tss.trainee;

public class Interfacing implements InterfacingA {

	public void method() {
		System.out.println("abstract method override in child class");
	}

	public static void main(String[] args) {
		Interfacing obj = new Interfacing();
		obj.method();
		System.out.println(VALUE);
	}
}
