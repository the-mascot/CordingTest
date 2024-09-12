package com.coding.codingtest.example.sort;

import java.util.Arrays;

/**
 * 삽입정렬
 * */
public class InsertionSortExample {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 5, 9, 7, 6, 3, 2};

        // KEY 는 두 번쨰 인덱스부터 시작
        for (int i = 1; i < arr.length; i++) {
            int keyValue = arr[i];
            // 비교 인덱스
            int j = i - 1;

            // 비교 인덱스가 0이 될떄까지 && 비교인덱스가 키 값 보다 큰 경우
            while (j >= 0 && arr[j] > keyValue) {
                // 요소를 한칸 뒤로 이동
                arr[j + 1] = arr[j];
                j -= 1;
            }
            // 현재 위치에 key 삽입
            arr[j + 1] = keyValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}
