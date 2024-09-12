package com.coding.codingtest.example.sort;

import java.util.Arrays;

/**
 * 병합정렬
 * */
public class MergeSortExample {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 5, 9, 7, 6, 3, 2};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        // 왼쪽 배열 개수
        int n1 = mid - left + 1;
        // 오른쪽 배열 개수
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // L 배열 생성
        for (int i = 0; i < n1; i++) {
            // 시작점 + i
            L[i] = arr[left + i];
        }

        // R 배열 생성
        for (int j = 0; j < n2; j++) {
            // 시작점 + j
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        // L과 R 의 원소를 비교하여 기존 배열 정렬
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // 나머지 배열 정리
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
}
