package com.coding.codingtest.heap;

import java.util.PriorityQueue;

/**
 * 프로그래머스 알고리즘 고득점 kit
 * 힙(Heap)
 * 더 맵게
 * https://school.programmers.co.kr/learn/courses/30/lessons/42626
 * */
public class MoreSpicy {
    public static void main(String[] args) {
        int[] scoville = new int[]{1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(solution(scoville, K));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.offer(s);
        }

        while (!pq.isEmpty() && pq.size() > 1 && pq.peek() < K) {
            int lowest = pq.poll();
            int next = pq.poll();
            pq.offer(lowest + (next * 2));
            answer++;
        }

        if (pq.peek() < K) {
            return -1;
        }

        return answer;
    }
}
