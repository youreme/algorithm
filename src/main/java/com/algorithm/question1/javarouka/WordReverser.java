package com.algorithm.question1.javarouka;

import java.util.Stack;

public class WordReverser {

	private static final String SPACE = " ";

	private static boolean isEmpty(CharSequence str) {
		return str == null || str.length() == 0;
	}

	private static boolean isValidStr(String str) {
		if(isEmpty(str) || !str.contains(SPACE)) {
			return false;
		}
		return true;
	}

	public static void copyIndex(String[] source, int from, String[] target, int to) {
		target[to] = source[from];
	}

	public static String reverseWordByArray(String str) {

		if(!isValidStr(str)) {
			return str;
		}

		String[] strArr = str.split(SPACE);
		String[] result = new String[strArr.length];

		int len = strArr.length;
		int center = len/2;
		int start = 0;
		int back = len;

		for(;start <= center; start++, back--) {
			copyIndex(strArr, start, result, back - 1);
			copyIndex(strArr, back - 1, result, start);
		}

		StringBuilder sb = new StringBuilder();
		for(String word : result) {
			sb.append(word).append(SPACE);
		}

		return sb.deleteCharAt(sb.length() - 1).toString();
	}

	public static String reverseWordByStack(String str) {

		if(!isValidStr(str)) {
			return str;
		}

		String[] strArr = str.split(SPACE);
		Stack<String> stack = new Stack<String>();
		for(String word : strArr) {
			stack.push(word);
		}

		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop()).append(SPACE);
		}

		return sb.deleteCharAt(sb.length() - 1).toString();
	}
}