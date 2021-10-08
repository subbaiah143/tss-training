package com.tss.test;

public class DonCasting extends DownCasting {

	public void cast() {
		System.out.println("child class cast method");
	}

	public void downCast() {
		System.out.println("down cast method");
	}

	public static void main(String[] args) {
		/*
		 * down casting child refarance and parent object by using downcasting access
		 * the parent class members and child class members
		 */
		DownCasting obj = new DonCasting();
		DonCasting objfinal = (DonCasting) obj;
		objfinal.cast();
		objfinal.upCast();
		objfinal.downCast();
	}
}
