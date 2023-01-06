package com.zql.collection.list;

import java.util.Vector;

public class VectorNotes {

        /*
            Vector底层原理是数组，增长因子是0.75，数组的默认长度是10，扩张的时候，数组的长度是原来的2倍.
        */
        public static void main(String[] args) {
            Vector<String> vector = new Vector<>();
            vector.add("a");
            vector.add("b");
            vector.add("c");
            vector.add("d");
            System.out.println(vector);
        }

}
