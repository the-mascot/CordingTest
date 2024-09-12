package com.coding.codingtest.sort;

import java.util.Arrays;
import java.util.Collections;

/**
 * 프로그래머스 알고리즘 고득점 kit
 * 정렬
 * H-Index
 * https://school.programmers.co.kr/learn/courses/30/lessons/42747
 * */
public class HIndex {
    public static void main(String[] args) {
        int[] citations = new int[]{10, 50, 100};
        System.out.println(solution(citations));
    }

    public static int solution(int[] citations) {
        Integer[] sortedCitations = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedCitations, Collections.reverseOrder());
        for (int i = 0; i < sortedCitations.length; i++) {
            if (sortedCitations[i] <= i) {
                return i;
            }
        }
        return sortedCitations.length;
    }

}
