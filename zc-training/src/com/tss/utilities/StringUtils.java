package com.tss.utilities;

public class StringUtils {

	/**
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
		//TODO need to know about regex symbol (^)
		return  name.replaceAll("[^a-zA-Z0-9]", "");
	}

	/**
	 * TODO need to write description
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
	 * @param str
	 * @return String
	 * @throws Exception
	 * @author venkata subbaiah
	 * @since 2021-10-20;
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
		return str;
	}

	public static void main(String[] args) throws Exception {

		// System.out.println(countCharValueInGivenString("thresold softwaresolution",
		// 'o'));
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
		 System.out.println(removeDuplicateCharacters("java404"));
		//System.out.println(sortStringCharacters("sdfsdcabaa jns"));

	}

}
