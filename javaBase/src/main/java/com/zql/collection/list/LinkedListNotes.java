package com.zql.collection.list;

import java.util.LinkedList;

public class LinkedListNotes {

        /*
            LinkedList底层原理是链表，增长因子是0.75，数组的默认长度是10，扩张的时候，数组的长度是原来的2倍.
            linkedList的add方法是O(1)的，remove方法是O(n)的，get方法是O(n)的,有序的，可以重复的
        */
        public static void main(String[] args) {
            LinkedList<String> linkedList = new LinkedList<>();
            linkedList.add("a");
            linkedList.add("b");
            linkedList.add("c");
            linkedList.add("d");
            System.out.println(linkedList);
            String peek = linkedList.peek();
            System.out.println(peek);
            String pop = linkedList.pop();
            String poll = linkedList.poll();
            System.out.println(poll);
            System.out.println(pop);
            System.out.println(linkedList);
            LinkedList<Integer> linkedList1 = new LinkedList<>();
            linkedList1.add(1);
            linkedList1.add(2);
            linkedList1.add(5);
            linkedList1.add(3);
            linkedList1.add(4);
            System.out.println(linkedList1);
            while (!linkedList1.isEmpty()) {
                Integer poll1 = linkedList1.poll();
                System.out.println(poll1);
            }
        }

}
