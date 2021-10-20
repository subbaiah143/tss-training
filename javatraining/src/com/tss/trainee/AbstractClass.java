package com.tss.trainee;


abstract class AbstractClass {

	abstract void absMethod();

	public void concreteMethod() {
		System.out.println("concrete method");
	}
	

	AbstractClass() {
		System.out.println("constructor");
	}
}







