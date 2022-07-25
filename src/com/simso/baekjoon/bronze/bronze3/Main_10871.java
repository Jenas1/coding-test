package com.simso.baekjoon.bronze.bronze3;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main_10871 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {

            int A = Integer.parseInt(st1.nextToken());

            if(X > A){
                list.add(A);
            }
        }

        for (int result : list) {
            System.out.print(result+ " ");
        }


        br.close();

    }


}