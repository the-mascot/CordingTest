package com.coding.codingtest.stackandqueue;

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
        System.out.println(solution(prices));
    }

    public static int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            stack.push(prices[i]);
        }

        while (!stack.isEmpty()) {
            stack.pop();
            for (int i = stack.size() - 2; i >= 0; i--) {
                answer[i] <
                answer[i] = answer[i] + 1;
            }

        }

        return answer;
    }

}
