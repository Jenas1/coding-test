package com.simso.baekjoon;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main_9093 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 0; i <= N; i++) {

            Stack stack = new Stack<>();

            String str =  in.nextLine();

            for (int j = 0; j < str.length(); j++) {

                if(str.charAt(j) ==' '){
                    while (!stack.empty()){
                        System.out.println("=============1=================");
                        System.out.print(stack.pop());
                    }
                    System.out.print(" ");
                    System.out.print(" +++++++++4++++++++++");
                }else {
                    stack.push(str.charAt(j));
                    System.out.print(" +++++++++5++++++++++");
                }
            }
            while (!stack.empty()){
                System.out.print(stack.pop());
                System.out.println("=============2=================");

            }
            System.out.println();

        }

        in.close();

    }



}
