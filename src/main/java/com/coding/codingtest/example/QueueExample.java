package com.coding.codingtest.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // offer: 큐에 값을 추가합니다.
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        // poll: 큐에서 값을 제거하고 반환합니다.
        System.out.println("Poll: " + queue.poll());  // Output: 1
        System.out.println("Poll: " + queue.poll());  // Output: 2

        // peek: 큐의 맨 앞에 있는 값을 확인합니다.
        System.out.println("Peek: " + queue.peek());  // Output: 3

        // 큐가 비어있는지 확인합니다.
        System.out.println("Is queue empty? " + queue.isEmpty());  // Output: false

        // 마지막 값을 poll합니다.
        System.out.println("Poll: " + queue.poll());  // Output: 3

        // 다시 큐가 비어있는지 확인합니다.
        System.out.println("Is queue empty? " + queue.isEmpty());  // Output: true
    }
}
