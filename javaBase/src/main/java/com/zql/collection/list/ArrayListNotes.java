package com.zql.collection.list;

import java.util.ArrayList;

public class ArrayListNotes {

    /*
        ArrayList底层原理是数组，增长因子是0.75，数组的默认长度是10，扩张的时候，数组的长度是原来的1.5倍.
     */
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        System.out.println(strings);
    }

}
