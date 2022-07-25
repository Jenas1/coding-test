package com.simso.baekjoon.bronze.bronze4;


import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_2675 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int R = Integer.parseInt(st.nextToken());

            String S = st.nextToken();

            ArrayList<Character> array = new ArrayList<>();

            for (int j = 0; j < S.length(); j++) {

                array.add(S.charAt(j));
            }

            for (Character character : array) {
                for (int j = 0; j < R; j++) {
                    bw.write(String.valueOf(character));
                }

            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

//    import java.util.*;
//
//    public class Main {
//        public static void main(String[] args) {
//            Scanner scan = new Scanner(System.in);
//            for (int i = scan.nextInt(); i > 0; i--) {
//                int R = scan.nextInt();
//                String S = scan.next();
//                for (char c:S.toCharArray())
//                    System.out.print((c+"").repeat(R));
//                System.out.println();
//            }
//        }
//    }
}
