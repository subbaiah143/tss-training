package com.tss.utilitiesaccess;

import com.tss.utilities.StringUtils;

public class StringUtilsAccess {

	public static void main(String[] args) throws Exception {
		// System.out.println(StringUtils.countCharValueInGivenString("thresoldsoftwaresolution", 'o'));
		// System.out.println(StringUtils.generateCharacters(3, 'g'));
		// System.out.println(StringUtils.repeatCharWithGivenValue('d', 6));
		// System.out.println(StringUtils.repeatCharCount('f', 4));
		// System.out.println(StringUtils.countVowelsWithOutDuplicate("chinna bodicherla"));
		// System.out.println(StringUtils.removeExtraSpaces("sai ram"));
		// System.out.println(StringUtils.countVowelInGivenString("bchhbFFSJAKC"));
		// System.out.println(StringUtils.replaceWithNew("my name is chinna", "is", "are"));
		// System.out.println(StringUtils.subStringSample("chinna bodicherla", 4));
		// System.out.println(StringUtils.withOutSubString("hello java", 3, 9));
		// System.out.println(StringUtils.extensionInString("chinna.txt"));
		// System.out.println(StringUtils.palindromeCheck("assdssa"));
		// System.out.println(StringUtils.removeSpecialCharacter("as@md$ndvtf%jn&hh*"));
		// System.out.println(StringUtils.removeDuplicateCharacters("java404"));
		// System.out.println(StringUtils.sortStringCharacters("java404"));
		// ystem.out.println(StringUtils.reverseEachWordInGivenString("th533 i5632s i222512444sch1424int431na"));
		// System.out.println(StringUtils.countTheWordsInTheGivenString("this is my frnd name"));
		// System.out.println(StringUtils.countTheOccuranceOfEachCharacter("chinna i love u"));
		// System.out.println(StringUtils.capitalizeEachWordInGivenString("123bdf 4332 ndnesjdbashja"));
		// System.out.println(StringUtils.checkingTwoStringsAnagramorNot("chinna","nanihc"));
		   if(StringUtils.validatePhone("+919154834966")) {
			   System.out.println("given number is vaild");
		   }else {
			   System.out.println("given number is invalid");
		   }
	}
}
