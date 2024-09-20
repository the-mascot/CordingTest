package com.coding.codingtest.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        Queue<int[]> pq = new LinkedList<>();
        Arrays.sort(jobs, (a, b) -> Integer.compare(a[0], b[0]));

        for (int[] job : jobs) {
            pq.offer(job);
        }
        int count = 0;

        while (!pq.isEmpty()) {
            int[] job = pq.poll();
            if (pq.size() > 0 && Math.abs(count - pq.peek()[0]) < Math.abs(count - job[0])) {
                pq.offer(job);
                int[] nextJob = pq.poll();
                count += nextJob[1];
                timeList.add(count - nextJob[0]);
            } else {
                count += job[1];
                timeList.add(count - job[0]);
            }
        }


        return timeList.stream().mapToInt(Integer::intValue).sum() / timeList.size();
    }
}
