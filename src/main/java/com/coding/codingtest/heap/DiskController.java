package com.coding.codingtest.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DiskController {
    public static void main(String[] args) {
        int[][] jobs = {
                {0, 3},
                {1, 9},
                {2, 6}
        };
        System.out.println(solution(jobs));
    }

    public static int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (int[] job : jobs) {
            pq.offer(job);
        }
        int count = 0;

        while (pq.isEmpty()) {
            int[] pollJob = pq.poll();
            if (count - pq.peek()[0] < count - pollJob[0]) {
                pq.offer(pollJob);
                count += pq.poll()[1];
            } else {
                count += pollJob[1];
            }

        }


        return answer;
    }
}
