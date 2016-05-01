package com.algorithm.question1.bart;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.StringTokenizer;

public class WordUtil {

	public static String reverseWord(String reverseString, String delim) {
		if(reverseString == null || delim == null) {
			throw new IllegalArgumentException("argument must not be null");
		}

		List<String> stringList = convertStringListByDelim(reverseString, delim);

		reverse(stringList);

		return toString(stringList);
	}

	protected static List<String> convertStringListByDelim(String reverseString, String delim) {
		StringTokenizer tokenizer = new StringTokenizer(reverseString, delim);
		List<String> stringList = Lists.newArrayList();
		while (tokenizer.hasMoreTokens()) {
			stringList.add(tokenizer.nextToken());
		}
		return stringList;
	}

	protected static void reverse(List<String> stringList) {
		int stringListSize = stringList.size();
		int reverseIndex = stringListSize;
		for(int index = 0;  index < stringListSize; index++) {
			reverseIndex--;
			if(stringListSize % 2 == 0) {
				if(reverseIndex < index) {
					break;
				}
			}else {
				if(reverseIndex == index) {
					break;
				}
			}

			String reverseTarget = stringList.get(index);
			String temp = stringList.get(reverseIndex);

			stringList.set(index, temp);
			stringList.set(reverseIndex, reverseTarget);
		}
	}

	protected static String toString(List<String> stringList) {
		StringBuffer stringBuffer = new StringBuffer();
		for(int index = 0; index < stringList.size(); index++) {
			if(index == stringList.size()-1) {
				stringBuffer.append(stringList.get(index));
			}else {
				stringBuffer.append(stringList.get(index)).append(" ");
			}
		}
		return stringBuffer.toString();
	}

}
