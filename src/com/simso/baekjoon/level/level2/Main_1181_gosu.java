package com.simso.baekjoon.level.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main_1181_gosu {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        TreeSet<String> set = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        set.stream().sorted()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}
