package com.coding.codingtest.example.sort;

import java.util.Arrays;

/**
 * 선택정렬
 * */
public class SelectionSortExample {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 5, 9, 7, 6, 3, 2};

        // 첫번째 인덱스부터 탐색
        for (int i = 0; i < arr.length -1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int minValue = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = minValue;
        }

        System.out.println(Arrays.toString(arr));
    }
}
