package com.coding.codingtest.example.stackandqueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 우선순위 큐 예제
 * */
public class PriorityQueueExample {
    public static void main(String[] args) {
        // 기본 큐는 최소 힙 사용
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<>(
                Collections.reverseOrder());

        // 5, 1, 3, 2 순 입력, 기존 queue 는 5, 1, 3, 2 순 출력되어야함
        priorityQueue.offer(5);
        priorityQueue.offer(1);
        priorityQueue.offer(3);
        priorityQueue.offer(2);

        maxPriorityQueue.offer(5);
        maxPriorityQueue.offer(1);
        maxPriorityQueue.offer(3);
        maxPriorityQueue.offer(2);

        // 1, 2, 3, 5 출력
        System.out.println("===== priorityQueue =====");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
        // 5, 3, 2, 1 출력
        System.out.println("===== maxPriorityQueue =====");
        while (!maxPriorityQueue.isEmpty()) {
            System.out.println(maxPriorityQueue.poll());
        }
    }
}
