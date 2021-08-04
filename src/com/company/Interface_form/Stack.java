package com.company.Interface_form;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<E> implements StackInterFace<E> {
    //상수이기 때문에 final 을 붙였다.
    private static final int DEFAULT_CAPACITY = 10;  //배열이 생성 될 때의 최초 할당 크기이자 최소 할당 용적변수로 기본값은 10
    private static final Object[] EMPTY_ARRAY = {};  //아무 것도 없는 빈 배열 (용적이 0인 배열)

    private Object[] array; // 요소를 담을 배열
    private int size;  // 요소 개수  배열에 담긴 요소의 개수 변수

    //생성자 객체만 생성하고 싶을때 상태
    public Stack() {
        this.array = EMPTY_ARRAY;
        this.size = 0;
    }
    //생성자2
    public Stack(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
    }

    //용적 사이즈
    private  void  resize(){

        if(Arrays.equals(array, EMPTY_ARRAY)){
            array = new Object[DEFAULT_CAPACITY];
            return;
        }

        int arrayCapacity  = array.length;// 현재 용적의 크기

        // 용적이 가득찰경우
        if(size == arrayCapacity){
            int newSize = arrayCapacity * 2;

            //배열복사
            array = Arrays.copyOf(array, newSize);
            return;
        }

        // 용적의 절반 미만으로 요소가 차지하고 있을 경우
        if(size <(arrayCapacity / 2)){
            int newCapacity = (arrayCapacity / 2);
            //배열 복사
            array = Arrays.copyOf(array, Math.max(DEFAULT_CAPACITY, newCapacity));
        }

    }


    @Override
    public E push(E item) {

        if (size == array.length){
            resize();
        }
        array[size] = item;  // 마지막 위치에 요소 츄거
        size++;

        return item;
    }

    @Override
    public E pop() {

        if(size == 0){
            throw new EmptyStackException();
        }
        E obj = (E) array[size -1]; //삭제될 요소를 반환하기 위한 임시변수

        array[size -1] = null;

        size--;
        resize();

        return obj;
    }

    @Override
    public E peek() {
        if(size == 0){
            throw new EmptyStackException();
        }

        
        return (E) array[size -1];
    }
    //쉽게 말하자면 Top으로부터 떨어져있는 거리를 의미한다
    @Override
    public int search(Object value) {

        for (int idx = 0; idx >=0; idx--) {
            if(array[idx].equals(value)){
                return size - idx;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = 0; i <size; i++) {
            array[i] = null;
        }
        size = 0;
        resize();
    }


    @Override
    public boolean empty() {
        return size == 0;
    }
}
