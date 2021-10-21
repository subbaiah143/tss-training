package com.tss.utilities;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringUtils {

	private static long[] firstStringArr;
	private static long[] secondStringArr;

	/**
	 * To count char values in the given string
	 * @param name
	 * @param value
	 * @return count
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-19
	 */
	public static int countCharValueInGivenString(String name, char value) throws Exception {
		if (name == null) {
			throw new Exception("Name should not be null");
		}
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == value) {
				count++;
			}
		}
		return count;
	}

	/**
	 * To generate characters by the given number of times
	 * @param count
	 * @param val
	 * @return String
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-19
	 */
	public static String generateCharacters(int count, char val) throws Exception {
		if (count < 0) {
			throw new Exception("Count value should be greater than 0");
		}
		return new String(new char[count]).replaceAll("\0", val + "");
	}

	/**
	 * To print repeated char value with the given number of times by using Recursion
	 * @param value
	 * @param num
	 * @return String
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-19
	 */
	public static String repeatCharWithGivenValue(char value, int num) throws Exception {
		if (num < 0) {
			throw new Exception("Num value should be greater than 0");
		}
		String str = "";
		if (num == 0)
			return "";
		str = str + (value + repeatCharWithGivenValue(value, num - 1));
		return str;
	}

	/**
	 * To print repeated char value with the given number of times by using for loop
	 * @param value
	 * @param num
	 * @return string
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-19
	 */
	public static String repeatCharCount(char value, int num) throws Exception {
		if (num < 0) {
			throw new Exception("Num value should be greater than 0");
		}
		String str = "";
		for (int i = 1; i <= num; i++) {
			str = str + value;
		}
		return str;
	}

	/**
	 * To count vowels with out duplicates
	 * @param string
	 * @return int
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-19
	 */
	public static int countVowelsWithOutDuplicate(String s) throws Exception {
		if (s == null) {
			throw new Exception("String can not be null");
		}
		s = s.toLowerCase();
		int l = s.length();
		String Vow = "aeiou";
		String sb = "";
		char ch;
		for (int i = 0; i < l; i++) {
			ch = s.charAt(i);
			if (Vow.contains(Character.toString(ch)) && !(sb.contains(Character.toString(ch)))) {
				sb = sb + ch;
			}
		}
		return sb.length();
	}

	/**
	 * To remove extra spaces in the given string
	 * @param string
	 * @return String
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-13
	 */
	public static String removeExtraSpaces(String s) throws Exception {
		if (s == null) {
			throw new Exception("Name shold not be null");
		}
		String str = s.replaceAll("\\s", "").trim();
		return str;
	}

	/**
	 * To count the vowels in the given string
	 * @param name
	 * @return int
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-08
	 */
	public static int countVowelInGivenString(String name) throws Exception {
		if (name == null) {
			throw new Exception("Name can not be null");
		}
		int vCount = 0;
		name = name.toLowerCase();
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				vCount++;
			}
		}
		return vCount;
	}

	/**
	 * In a string,replace the existence word with new word
	 * @param name
	 * @param old
	 * @param newOne
	 * @return String
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-11
	 */
	public static String replaceWithNew(String name, String replacedWord, String newword) throws Exception {
		if (name == null || replacedWord == null || newword == null) {
			throw new Exception("Strings can not be null");
		}
		name = name.replace(replacedWord, newword);
		return name;
	}

	/**
	 * Retrive the string with substring method
	 * @param name
	 * @param num
	 * @return String
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-11
	 */
	public static String subStringSample(String name, int num) throws Exception {
		if (name == null) {
			throw new Exception("Name can not be null");
		}
		name = name.substring(num);
		return name;
	}

	/**
	 * Retrive the string with out substring method
	 * @param s
	 * @param inital
	 * @param end
	 * @return String
	 * @author venkata subbaiah
	 * @throws Exception
	 * @since 2021-10-13
	 */
	public static String withOutSubString(String s, int inital, int end) throws Exception {
		if (s == null) {
			throw new Exception("String can not be null");
		}
		String newStr = "";
		for (int i = inital; i < end; i++) {
			newStr += String.valueOf(s.charAt(i));
		}
		return newStr;
	}

	/**
	 * Retrive the extension in the given string
	 * @param fileName
	 * @return string
	 * @author venkata subbaiah
	 * @since 2021-10-12
	 */
	public static String extensionInString(String name) {
		if (name == null) {
			new Exception("Name can not be null");
		}
		int index = name.lastIndexOf('.');
		String extension = "";
		if (index > 0) {
			extension = name.substring(index + 1);
		}
		return extension;
	}

	/**
	 * To checking the given string is palindrome or not
	 * @param original
	 * @return boolean
	 * @author venkata subbaiah
	 * @since 2021-10-11
	 */
	public static boolean palindromeCheck(String original) {
		if (original == null) {
			new Exception("String  can not be null");
		}
		String reverse = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		return original.equalsIgnoreCase(reverse);
	}

	/**
	 * To remove special cahracters in the given string
	 * @param name
	 * @return String
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-20
	 */
	public static String removeSpecialCharacter(String name) throws Exception {
		if (name == null) {
			throw new Exception("Name can not be null");
		}
		// TODO need to know about regex symbol (^)
		return name.replaceAll("[^a-zA-Z0-9]", "");
	}

	/**
	 * To remove duplicate characters in the given string
	 * @param str
	 * @return StringBuilder
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-20
	 */
	public static StringBuilder removeDuplicateCharacters(String str) throws Exception {
		if (str == null) {
			throw new Exception("Str can not be null");
		}
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				sb.append(arr[i]);
			}
		}
		return sb;
	}

	/**
	 * sort the given string in the alphabaical order
	 * @param str
	 * @return String
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-20
	 */
	public static String sortStringCharacters(String str) throws Exception {
		if (str == null) {
			throw new Exception("Str can not be null");
		}
		char[] arr = str.toCharArray();
		char temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return new String(arr);
	}

	/**
	 * To reverse each word in the given string
	 * @param s
	 * @return String
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-21
	 */
	public static String reverseEachWordInGivenString(String s) throws Exception {
		if (s == null) {
			throw new Exception("String can not be null");
		}
		String reverseWords = "";
		String[] words = s.split(" ");
		for (String word : words) {
			String revWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			reverseWords = reverseWords + revWord + " ";
		}
		return reverseWords;
	}
	
	/**
	 * To count the number of words in the given string
	 * @param s
	 * @return
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-21
	 */
	public static int countTheWordsInTheGivenString(String s) throws Exception {
		if (s == null) {
			throw new Exception("String can not be null");
		}
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		return count;
	}                        
	
	/**
	 * To count the occurance of each character in a given string 
	 * @param s
	 * @return map
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-21
	 */
	public static Map<Character, Integer> countTheOccuranceOfEachCharacter(String s) throws Exception {
		if (s == null) {
			throw new Exception("String can not be null");
		}
		s = s.replace(" ", "");
		char arr[] = s.toCharArray();
		int count = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			map.put(arr[i], count);
		}
		return map;
	}
	
	/**
	 * To capitalize the each word in a given string
	 * @param s
	 * @return string
	 * @author venkata subbaiah
	 * @throws Exception 
	 * @since 2021-10-21
	 */
	public static String capitalizeEachWordInGivenString(String s) throws Exception {
		if (s == null) {
			throw new Exception("String can not be null");
		}
		s = " " + s;
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				str = str + ch;
				i++;
				ch = s.charAt(i);
				str = str + Character.toUpperCase(ch);
			} else {
				str = str + ch;
			}
		}
		str = str.trim();
		return str;
	}
	
	/**
	 * Checking the given two Strings are anagram or not
	 * @param firstString
	 * @param secondString
	 * @return boolean
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-21
	 */
	public static boolean checkingTwoStringsAnagramorNot(String firstString, String secondString) throws Exception {
		if (firstString == null || secondString == null) {
			throw new Exception("Strings can not be null");
		}
		firstString = firstString.replaceAll("\\s", "");
		secondString = secondString.replaceAll("\\s", "");
		if (firstString.length() != secondString.length()) {
			return false;
		} else {
			char[] firstStringArr = firstString.toCharArray();
			char[] secondStringArr = secondString.toCharArray();
			Arrays.parallelSort(firstStringArr);
			Arrays.parallelSort(secondStringArr);
		}
		return Arrays.equals(firstStringArr, secondStringArr);
	}
	
	public static void main(String[] args) throws Exception {

		//stem.out.println(countCharValueInGivenString("thresold softwaresolution", 'o'));
		// System.out.println(generateCharacters(3, 'g'));
		// System.out.println(repeatCharWithGivenValue('d', 6));
		// System.out.println(repeatCharCount('f', 4));
		// System.out.println(countVowelsWithOutDuplicate("chinna bodicherla"));
		// System.out.println(removeExtraSpaces("sai ram"));
		// System.out.println(countVowelInGivenString("bchhbFFSJAKC"));
		// System.out.println(replaceWithNew("my name is chinna", "is", "are"));
		// System.out.println(subStringSample("chinna bodicherla", 4));
		// System.out.println(withOutSubString("hello java", 3, 9));
		// System.out.println(extensionInString("chinna.txt"));
		// System.out.println(palindromeCheck("assdssa"));
		// System.out.println(removeSpecialCharacter("as@md$ndvtf%jn&hh*"));
		//System.out.println(removeDuplicateCharacters("java404"));
		// System.out.println(sortStringCharacters("java404"));
		//ystem.out.println(reverseEachWordInGivenString("th533 i5632s i222512444s ch1424int431na"));
		//System.out.println(countTheWordsInTheGivenString("this is my frnd name"));
		//System.out.println(countTheOccuranceOfEachCharacter("chinna i love u"));
		//System.out.println(capitalizeEachWordInGivenString("123bdf 4332 ndnes jdbashja"));
		System.out.println(checkingTwoStringsAnagramorNot("chinna","nanihc"));
	}
}
