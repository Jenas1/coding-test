package com.simso.Interface_form;



public interface StackInterFace<E> {

    E push(E item);
    E pop();
    E peek();
    int search(Object value);
    int size();
    void clear();
    boolean empty();

}


