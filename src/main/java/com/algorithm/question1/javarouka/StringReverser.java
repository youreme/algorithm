package com.algorithm.question1.javarouka;

import java.util.*;

public class StringReverser {

    private static boolean isValidStr(CharSequence str) {
        if(isEmpty(str)) {
            return false;
        }

        if(str.length() > Integer.MAX_VALUE) {
            throw new IllegalStateException("cannot process that too long char sequence...");
        }

        return true;
    }

    private static boolean isEmpty(CharSequence str) {
        return str == null || str.length() == 0;
    }

    public static String reverseBuilder(CharSequence str) {

        if(!isValidStr(str)) {
            return "";
        }

        int len = str.length();
        int center = len/2;
        int start = 0;
        int back = len;

        StringBuilder result = new StringBuilder(str);

        for(;start <= center; start++, back--) {
            result.setCharAt(back - 1, str.charAt(start));
            result.setCharAt(start, str.charAt(back - 1));
        }

        return result.toString();

    }

    public static String reverseArray(CharSequence str) {

        if(!isValidStr(str)) {
            return "";
        }

        int len = str.length();
        int center = len/2;
        int start = 0;
        int back = len;

        char[] result = new char[len];

        for(;start <= center; start++, back--) {
            result[back - 1] = str.charAt(start);
            result[start] = str.charAt(back - 1);
        }

        return new String(result);
    }

    public static String reverseStack(CharSequence str) {

        if(!isValidStr(str)) {
            return "";
        }

        int start = 0;
        int len = str.length();

        Stack<Character> result = new Stack<Character>();

        while(start < len) {
            result.push(str.charAt(start));
            start++;
        }

        StringBuilder sb = new StringBuilder();
        while(!result.isEmpty()) {
            sb.append(result.pop());
        }
        return sb.toString();
    }

    public static String reverseList(CharSequence str) {

        if(!isValidStr(str)) {
            return "";
        }

        int len = str.length();

        List<Character> result = new ArrayList<Character>();

        while (len-- > 0) {
            result.add(str.charAt(len));
        }

        StringBuilder sb = new StringBuilder();
        for(Character ch : result) {
            sb.append(ch);
        }

        return sb.toString();
    }

}