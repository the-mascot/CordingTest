package com.coding.codingtest.sort;

import java.util.Arrays;

/**
 * 프로그래머스 알고리즘 고득점 kit
 * 정렬
 * K번째수
 * https://school.programmers.co.kr/learn/courses/30/lessons/42748
 * */
public class KthNumber {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}
        };
        System.out.println(Arrays.toString(solution(array, commands)));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] targetArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(targetArray);
            answer[i] = targetArray[commands[i][2] - 1];
        }

        return answer;
    }
}
