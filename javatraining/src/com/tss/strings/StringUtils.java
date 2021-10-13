package com.tss.strings;

public class StringUtils {

	public static char charAtMethod(String s, int num) {
		return s.charAt(num);
	}

	public static String PositionValueString(String s, boolean b) {
		String positions = "";
		for (int i = 0; i < s.length(); i++)
			if (b && i % 2 == 0) positions = "char present in " + i + " position " + s.charAt(i);
			else if (!b && i % 2 != 0) positions = "char present in " + i + " position " + s.charAt(i);
		return positions;
	}

	public static int countCharacter(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == c)
				count++;
		return count;
	}

	public static String lengthOfString(String s) {
		return "length of string '" + s + "' is " + s.length();
	}

	public static String reverseOfString(String s) {
		String str = null;
		for (int i = s.length() - 1; i >= 0; i--)
			str = str + s.charAt(i);
		return str;
	}

	public static String countOfWhiteSpace(String s) {
		int sizeWithWhiteSpace = s.length();
		s = s.replace(" ", "");
		int sizeWithOutWhiteSpace = s.length();
		int noOfWhiteSpaces = sizeWithWhiteSpace - sizeWithOutWhiteSpace;
		return "total no of spaces in the string is " + noOfWhiteSpaces;
	}

	public static int compareToInString(String s1, String s2) {
		return s1.compareTo(s2);
	}

	public static String concatMethod(String s, String str) {
		s.concat(str);
		// variable is not assign to that string so,garbage collection
		System.out.println(s);
		s = s.concat(str);
		return "after concat the string is " + s;
	}

	public static String concatOperation(String s, String st) {
		String str = s.concat(st);
		return str;
	}

	public static String concatMultiple(String s, String st, String str) {
		String stri = s.concat(st).concat(" ").concat(str);
		return stri;
	}

	public static String concatSpecialCharacter(String s, String st, String stri) {
		String strin = s.concat(st).concat("@").concat("gmail.").concat(stri);
		return strin;
	}

	public static boolean containsMethod(String str, String st) {
		return (str.contains(st));
	}

	public static String containsWithCondition(String str, String st) {
		String strin = "";
		if (str.contains(st)) strin = "string contains 'is' ";
		else strin = "string does not contain 'is' ";
		return strin;
	}

	public static boolean endsWithMethod(String str, String s) {
		return (str.endsWith(s));
	}

	public static String endsWithCondition(String str) {
		String strin = "";
		if (str.endsWith(".com")) strin = ("string ends with .com");
		else strin = ("it does not ends with .com");
		return strin;
	}

	public static boolean startsWithMethod(String str, String st) {
		return (str.startsWith(st));
	}

	public static String startsWithCondition(String str) {
		String strName = "";
		if (str.startsWith("")) strName = "string starts with empty string";
		else strName = "does not starts with empty string";
		return strName;
	}

	public static boolean equalsMethod(String s, String st) {
		return (s.equals(st));
	}

	public static boolean equalsIgnoreCase(String s, String st) {
		return (s.equalsIgnoreCase(st));
	}

	public static String equalsWithCondition(String st, String str, String stri) {
		String name = "";
		if (str.equals(stri)) name = ("both strings are equal");
		else name = ("strings are not equal");
		return name;
	}

	public static void main(String[] args) {
		charAtMethod("chinna",4);
		PositionValueString("sreenivasulu bodicherla", false);
		countCharacter("chinna bodichernla", 'n');
		lengthOfString("venkata subbaiah");
		reverseOfString("venkata joined in tss");
		countOfWhiteSpace("venkat is my name");
		compareToInString("chinna", "fhinna");
		concatMethod("chinna", "bodicherla");
		concatOperation("boyanapalli", "my village");
		concatMultiple("chinna ", "bodicherla", "venkat");
		concatSpecialCharacter("chinna", "bodicherla", "com");
		containsMethod("chinna is my name", "is");
		containsWithCondition("chinna is my name", "is");
		endsWithMethod("chinna is my name", "name");
		endsWithCondition("chinnabodicherla@gmail.com");
		startsWithMethod("chinna is my name", "chi");
		startsWithCondition("chinna");
		equalsMethod("chinna", "chinna");
		equalsIgnoreCase("chinna", "CHINNA");
		equalsWithCondition("chinna", "chinna", "sreenu");
	}
}
