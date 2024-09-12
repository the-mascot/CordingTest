package com.coding.codingtest.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 프로그래머스 알고리즘 고득점 kit
 * 스택/큐
 * 다리를 지나는 트럭
 * https://school.programmers.co.kr/learn/courses/30/lessons/42583
 * */
public class TruckOnTheBridge {
    public static void main(String[] args) {
        int[] truckWeights = new int[]{7,4,5, 6};
        System.out.println(solution(2, 10, truckWeights));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList();
        int time = 0;   // 시간
        int sum = 0;    // 무게 합
        int index = 0;  // 인덱스

        // 큐 0으로 채우기
        for (int i = 0; i < bridge_length; i++) {
            queue.offer(0);
        }

        while (!queue.isEmpty()) {
            time++;

            int finishedTruck = queue.poll();
            sum -= finishedTruck;

            // 트럭이 남아있고, 올릴 수 있으면
            if (index < truck_weights.length) {
                if (sum + truck_weights[index] <= weight) {
                    queue.offer(truck_weights[index]);
                    sum += truck_weights[index];
                    index++;
                } else {
                    queue.offer(0); // 트럭을 올릴 수 없으면 빈공간 유지
                }
            }

        }

        return time;
    }
}
