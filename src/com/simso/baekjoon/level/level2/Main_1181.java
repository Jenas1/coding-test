package com.simso.baekjoon.level.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main_1181 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 50; i++) {
            for(int j = 0; j < list.size();) {

                if(list.get(j).length() == i) {
                    sb.append(list.get(j)).append("\n");
                    list.removeAll(Arrays.asList(list.get(j)));
                } else {
                    j ++;
                }
            }
            if (list.isEmpty()) {
                break;
            }
        }

        System.out.println(sb);
    }
}
