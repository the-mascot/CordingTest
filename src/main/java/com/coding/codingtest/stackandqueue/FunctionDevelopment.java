package com.coding.codingtest.stackandqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 프로그래머스 알고리즘 고득점 kit
 * 스택/큐
 * 기능개발
 * https://school.programmers.co.kr/learn/courses/30/lessons/42586
 * */
public class FunctionDevelopment {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(solution(progresses, speeds));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        // 각 작업이 끝날 때까지 걸리는 날을 계산하여 Queue에 저장
        for (int i = 0; i < progresses.length; i++) {
            int remainingWork = 100 - progresses[i];
            int days = (int) Math.ceil((double) remainingWork / speeds[i]);
            queue.offer(days);
        }

        // Queue에서 각 작업이 배포되는 날마다 묶어서 처리
        while (!queue.isEmpty()) {
            int currentDay = queue.poll();
            int count = 1;

            // 배포일보다 더 빨리 끝나는 기능은 함께 배포
            while (!queue.isEmpty() && queue.peek() <= currentDay) {
                queue.poll();
                count++;
            }

            result.add(count);
        }

        // 결과를 배열로 변환하여 반환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
