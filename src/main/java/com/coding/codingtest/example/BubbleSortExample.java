package com.coding.codingtest.example;

import java.util.Arrays;

/**
 * 버블정렬
 * */
public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 5, 9, 7, 6, 3, 2};

        // round는 배열 크기 -1 만큼 반복
        // ex)([2,3,4,5] 일때 3회전만해도 나머지 1개는 자동정렬됨)
        for(int i = 0; i < arr.length - 1; i++) {
            // 각 라운드별 비교 횟수는 배열 크기의 현재 라운드를 뺀 만큼
            // (j+1로 마지막 인덱스에 접근해야되서 -1 추가)
            for(int j = 0; j < arr.length - i -1; j++) {

                // 인접한 원소 비교 후 교환
                if (arr[j] > arr[j + 1]) {
                    int bigOne = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = bigOne;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
