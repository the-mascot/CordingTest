package com.coding.codingtest.example.sort;

import java.util.Arrays;

/**
 * 퀵 정렬
 * */
public class QuickSortExample {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 5, 9, 7, 6, 3, 2};
        quickSort(arr,0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // pivot 기준으로 분할한 배열을 재귀 호출로 다시 정렬
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // pivot 을 마지막 인덱스로 지정
        int pivotValue = arr[high];
        // pivot 기준 왼쪽에 작은 수를 넣기위한 인덱스
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // pivot value 보다 작으면 왼쪽 이동
            if (arr[j] <= pivotValue) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 현재 i는 pivot 보다 작은 마지막 인덱스, 그 뒤에 pivot 을 넣어준다
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high]= temp;

        return i + 1;
    }
}
