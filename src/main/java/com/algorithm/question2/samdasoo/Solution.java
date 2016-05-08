package com.algorithm.question2.samdasoo;

import java.util.LinkedList;
import java.util.List;

public class Solution {


    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6 };

        List list = new LinkedList<Integer>();

        for(int i=0; i< numbers.length; i++) {
            list.add(numbers[i]);
        }

        int listSize = list.size();
        int middleNodeIndex = (int) Math.floor(listSize / 2);

        // 1.
        System.out.println("Middle node index: " + middleNodeIndex + " value: " + list.get(middleNodeIndex));

        // 2.
        list.remove(middleNodeIndex);

        for(int i=0; i< list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }



    }
}
