package com.simso.baekjoon.level.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1978 {
    public static void main(String[] args) throws IOException {
//        /BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int[] array = new int[N];
//

        boolean prime[] = new boolean[121];
        // 구하고자 하는 숫자 범위

        int N = 120;

        // 소수는 false
        // 1은 소수가 아니므로 제외
        prime[0] = prime[1] = true;

        for(int i=2; i*i<=N; i++){
            // prime[i]가 소수라면
            if(!prime[i]){
                // prime[j] 소수가 아닌 표시
                for(int j=i*i; j<=N; j+=i) prime[j] = true;
            }
        }

        // 소수 출력
        for(int i=1; i<=N;i++){
            if(!prime[i]) System.out.print(i+" ");
        }
    }


//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int count = 0;
//
//        for (int i = 0; i < N; i++) {
//            array[i] =  Integer.parseInt(st.nextToken());
//        }


//        System.out.println(count);
}

