package com.tss.tasks;

import java.util.Scanner;

public class ProgramPractice {

	/**
	 * @param obje
	 * @return String
	 * @author venkata subbaiah
	 * @since 2021-10-08
	 */
	public static String objectReturnType(Object obje) {
		if (obje instanceof Integer)
			return ("given object is int ");
		else if (obje instanceof String)
			return "given object is string ";
		else if (obje instanceof Double)
			return "given object is double";
		else if (obje instanceof Boolean)
			return "given object is boolean";
		return null;
	}

	public static void main(String[] args) throws Exception {

		System.out.println(objectReturnType("Dadsaa"));
	}
}
