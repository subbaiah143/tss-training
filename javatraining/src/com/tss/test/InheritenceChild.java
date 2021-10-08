package com.tss.test;

import com.tss.develop.*;

public class InheritenceChild extends InheritenceParent {

	public void div() {
		System.out.println("division of two numbers" + " " + (num2 / num1));
	}

	public static void main(String[] args) {
		InheritenceChild obj = new InheritenceChild();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}
}
