package com.company.Interface_form;

public class ClassName<E> {
    private E element;

    public void set(E element){
        this.element =element;
    }

    public E get() {
        return element;
    }

    //일반적인 선언방법법 [ 접근 제어자] <제네릭타입> [반환타입] [메소드명]([제네릭타입] [파라미터]

    public <T> T genericMethod(T o){
        return o;
    }
}
