package com.simso.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10828 {

    private static int[] array;
    private static int size;

    public static void main(String[] ages) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        array = new int[10000];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.contains("push")) {
                String[] s = str.split(" ");
                int number = Integer.parseInt(s[1]);

                push(number);
            }
        }

    }

    public static void push(int item) {
        array[size] = item;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        }

        int number = array[size - 1];
        array[size - 1] = 0;
        size--;

        return number;
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size() == 0) {
            return 1;

        } else {
            return 0;
        }
    }

    public static int top() {
        if (size == 0) {
            return -1;
        }

        return array[size - 1];
    }
}
