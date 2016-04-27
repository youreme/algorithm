package com.algorithm.question1;

public class ReverseString_Mark {
	public String reverseString(String input) {
		if(input == null) {
			return null;
		}
		
		if(input.length() < 1) {
			return "";
		}
		
		String [] inputByWhiteSpace = input.split(" ");
		
		if(inputByWhiteSpace.length < 1) {
			return input;
		}
		
		int idx = 0;
		int reverseIdx = inputByWhiteSpace.length - 1;
		
		while(idx < reverseIdx) {
			swap(inputByWhiteSpace, idx++, reverseIdx--);
		}
		StringBuilder sb = new StringBuilder();
		
		for(String s : inputByWhiteSpace) {
			sb.append(s + " ");
		}
		
		return sb.deleteCharAt(sb.length() - 1).toString(); 
	}
	
	private void swap(String[] input, int i, int j) {
		String temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
}
