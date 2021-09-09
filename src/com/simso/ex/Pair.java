package com.simso.ex;

public class Pair {

    Integer y;
    Integer x;

    public Pair(Integer y, Integer x) {
        this.y = y;
        this.x = x;
    }
    public Integer first(){
        return y;
    }

    public Integer second(){
        return x;
    }
}
