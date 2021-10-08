package com.tss.develop;

public class LoadFinal extends OverLoad {

	public void loadMethod(int value, double num) {
		System.out.println("int value is" + " " + value + " " + "double value is" + " " + num + " ");
	}

	public static void main(String[] args) {
		LoadFinal obj = new LoadFinal();
		obj.loadMethod();
		obj.loadMethod("chinna");
		obj.loadMethod("chinna", 21);
		obj.loadMethod("chinna", 21, 10.2);
		obj.loadMethod(10.2, 21);
		obj.loadMethod(21, 10.2);
	}
}
