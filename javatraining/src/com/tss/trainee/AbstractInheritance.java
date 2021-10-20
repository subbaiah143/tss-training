package com.tss.trainee;

public class AbstractInheritance extends AbstractClass {

	public static void main(String[] args) {
		AbstractInheritance obj = new AbstractInheritance();
		obj.concreteMethod();
		obj.absMethod();
	}

	@Override
	public void absMethod() {
		System.out.println("abstract method override");
	}
}
