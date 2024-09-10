package com.coding.codingtest.example;

import java.util.Stack;

/**
 * 스택 자료구조 예제
 * */
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push operation: 스택에 값을 넣습니다.
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop operation: 스택에서 값을 꺼냅니다.
        System.out.println("Pop: " + stack.pop());  // Output: 3
        System.out.println("Pop: " + stack.pop());  // Output: 2

        // Peek operation: 스택의 맨 위 값을 확인합니다(제거하지 않음).
        System.out.println("Peek: " + stack.peek()); // Output: 1

        // 스택이 비어있는지 확인합니다.
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        // 마지막 값을 pop합니다.
        System.out.println("Pop: " + stack.pop());  // Output: 1

        // 다시 스택이 비어있는지 확인합니다.
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
    }
}
