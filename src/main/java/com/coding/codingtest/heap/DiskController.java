package com.coding.codingtest.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
        List<Integer> timeList = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (int[] job : jobs) {
            pq.offer(job);
        }
        int count = 0;

        while (pq.isEmpty()) {
            int[] job = pq.poll();
            if (count - pq.peek()[0] < count - job[0]) {
                pq.offer(job);
                int[] nextJob = pq.poll();
                count += nextJob[1];
                timeList.add(count - nextJob[0]);
            } else {
                count += job[1];
                timeList.a
            }
        }


        return answer;
    }
}
