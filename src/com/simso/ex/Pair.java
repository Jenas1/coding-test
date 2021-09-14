package com.simso.ex;

public class Pair {

    Integer y;
    Integer x;

    public Pair() {
    }

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

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }
}
