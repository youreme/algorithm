package com.algorithm.question1.hunky;

import java.util.Scanner;

/**
 * Created by youreme on 2016. 4. 27..
 */
public class Solution {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String output = reverseWord(input);
        System.out.println("Output : " + output);
    }

    /**
     * Input : Algorithm are awesome!
     * Output : awesome! are Algorithm
     */
    protected static String reverseWord(String input) {
        String[] arr = input.split(" ");
        int length = arr.length;

        for (int i = 0; i < length / 2; i++) {
            swap(arr, i, length - 1 - i);
        }

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }

        return sb.substring(0, sb.length() - 1);
    }

    private static void swap(String[] arr, int x, int y) {
        String temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
