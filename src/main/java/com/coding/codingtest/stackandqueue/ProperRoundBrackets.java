package com.coding.codingtest.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class ProperRoundBrackets {
    public static void main(String[] args) {
        System.out.println(solution("()()"));
    }

    static boolean solution(String s) {
        Queue<Integer> queue = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                queue.offer(1);
            } else {
                queue.offer(-1);
            }
        }
        int sum = 0;
        for (Integer num : queue) {
            sum += num;
            if (sum < 0)
                return false;
        }
        if (sum != 0) {
            return false;
        }
        return true;
    }
}
