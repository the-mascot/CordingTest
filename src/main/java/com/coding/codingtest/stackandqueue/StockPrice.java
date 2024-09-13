package com.coding.codingtest.stackandqueue;

import java.util.Arrays;
import java.util.Stack;

/**
 * 프로그래머스 알고리즘 고득점 kit
 * 스택/큐
 * 주식가격
 * https://school.programmers.co.kr/learn/courses/30/lessons/42584
 * */
public class StockPrice {
    public static void main(String[] args) {
        int[] prices = new int[]{1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(solution(prices)));
    }

    public static int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();   // 인덱스를 저장할 스텍

        // 스텍에 가격을 넣는게 아니라 반복 인덱스를 넣어주는게 키 포인트
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = n -1 - idx;
        }

        return answer;
    }

}
