package com.tss.trainee;

public class InterJava implements InterfaceC {
	
	public void method() {
		System.out.println("method override");
	}
	
	public void method1() {
		System.out.println("method1 override");
	}
	
	public void method2() {
		System.out.println("method2 override");
	}
	
	public static void main(String[] args) {
		InterJava obj=new InterJava();
		obj.method();
		obj.method1();
		obj.method2();
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
	}
}
