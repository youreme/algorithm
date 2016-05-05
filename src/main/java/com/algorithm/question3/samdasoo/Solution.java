package com.algorithm.question3.samdasoo;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by xungwoo on 2016-05-06.
 */
public class Solution {

    public static void main(String[] args) {
        // input
        int[] numbers = { 1, 2, 3, 4, 5, 6 };

        VeryGoodList<Integer> list = new VeryGoodList<>();
        for(int i=0; i< numbers.length; i++) {
            list.add(numbers[i]);
        }

        printKFromLast(list, 1);
        printKFromLast(list, 3);
        printKFromLast(list, 4);
        printKFromLast(list, 5);
    }


    static void printKFromLast(VeryGoodList list, int k) {
        int findIndex = list.size() - k;
        System.out.println("List Size : " + list.size() + ", Find Index : " + findIndex + ", K: " + k);
        System.out.println("## Size Version result   : " + list.get(findIndex));
        System.out.println("## NoSize Version result : " + list.getNoSizeFromLast(k));
        System.out.println();
    }
}
