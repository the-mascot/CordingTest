package com.coding.codingtest.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 프로그래머스 알고리즘 고득점 kit
 * 정렬
 * 가장큰수
 * https://school.programmers.co.kr/learn/courses/30/lessons/42746
 * */
public class LargestNumber {
    public static void main(String[] args) {
        int [] array = new int[]{6, 10, 2};
        System.out.println(solution(array));
    }

    public static String solution(int[] numbers) {
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String order1 = o1 + o2;
                String order2 = o2 + o1;
                return order2.compareTo(order1);
            }
        });

        if (strNumbers[0].equals("0")) {
            return "0";
        }

        StringBuilder answer = new StringBuilder();
        for (String str: strNumbers) {
            answer.append(str);
        }

        return answer.toString();
    }
}
