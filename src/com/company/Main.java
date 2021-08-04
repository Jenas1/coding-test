package com.company;

import com.company.Interface_form.ClassName;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        int N = in.nextInt();

        stack = new int[N];


        for (int i = 0; i < N; i++) {
            String str = in.next();

            switch (str) {
                case "push":
                    try {
                        push(in.nextInt());
                    } catch (InputMismatchException ime) {
                        System.out.println("정수만 입력하십시오 ");
                    }
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
            }
        }

    }

    public static void push(int item){
        stack[size] = item;
        size ++;
    }
    public static int pop(){
        if(size==0){
            return 1;
        }
        else {
            int res = stack[size -1];
            stack[size -1] = 0;
            size--;

            return res;
        }
    }

    public static int size(){
        return size;
    }

    public static int empty(){
        if(size == 0){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static int top(){
        if(size == 0){
            return -1;
        }
        else {
            return  stack[size - 1];
        }
    }

}
