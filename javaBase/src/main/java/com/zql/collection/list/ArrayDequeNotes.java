package com.zql.collection.list;


import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;

/*
 */
public class ArrayDequeNotes {

    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        Integer pop = deque.pop();
        Integer integer = deque.removeLast();
        System.out.println(integer);
        System.out.println(deque);


    }


}
