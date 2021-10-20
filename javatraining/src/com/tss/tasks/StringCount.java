package com.tss.tasks;

public class StringCount {

	public static int findSum(String str) {
		int count = 0;
		String temp = "0";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				temp += ch;
			} else {
				sum += Integer.parseInt(temp);
				count++;
				temp = "0";
			}
		}
		System.out.println(count);
		return sum + Integer.parseInt(temp);
	}

	public static void main(String[] args) {
		String str = "12cgo45vsg34d";

		
		System.out.println(findSum(str));
	}
}
