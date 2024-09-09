package com.coding.codingtest.stackandqueue;

import java.util.Stack;

/**
 * 프로그래머스 알고리즘 고득점 kit
 * 스택/큐
 * 같은 숫자는 싫어
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906
 * */
public class HateSameNumber {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(solution(arr));
    }

    public static Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for(int num : arr){
            if(stack.size() == 0 || stack.peek() != num){
                stack.push(num);
            }
        }

        return stack;
    }
}
