package com.algorithm.question1.javarouka;

public class StringReverser {

    private static boolean isEmpty(CharSequence str) {
        return str == null || str.length == 0
    }

    public static String reverse(CharSequence str) {

        if(isEmpty(str)) {
            return str;
        }

        // 이 부분에 대한 고려 필요
        // 엄청나게 긴 문자열이 올 경우, 어떻게 대처할 것인가..?
        int len = str.length;
        int center = len/2;
        int start = 0;
        int back = len;

        StringBuilder result = new StringBuilder(len);

        for(;start < center; start++, back--) {
            result.insert(back - 1, str.charAt(start));
            result.insert(start, str.charAt(back - 1));
        }

        return result.toString();

    }

}