package com.simso.baekjoon.baseif;

import com.simso.ex.Pair;

import java.util.LinkedList;
import java.util.List;

public class MainTest {
    public static void main(String[] args){
        List<Pair> list = new LinkedList<>();

        Pair pair = new Pair(1,2);

        list.add(pair);

        int first = list.get(0).first();

        int second = list.get(0).second();

        System.out.println("first" + first + "second" + second);


    }
}
