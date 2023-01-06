package com.zql.collection.map;

import com.zql.collection.map.model.KeyModel;
import com.zql.collection.map.model.KeyModel2;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapNotes {

    /*
    TreeMap底层是红黑树，红黑树是一种自平衡的二叉查找树，红黑树的查询效率比hashMap高，红黑树的增删效率比hashMap低，所以TreeMap的查询效率比hashMap高，但是TreeMap的增删效率比hashMap低。
    TreeMap的key是有序的，TreeMap的key必须实现Comparable接口，或者在构造TreeMap的时候传入一个Comparator对象，否则会抛出ClassCastException异常。
     */
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("c", "c");
        treeMap.put("d", "d");
        treeMap.put("a", "a");
        treeMap.put("b", "b");

        System.out.println(treeMap);
        KeyModel keyModel = new KeyModel("1");
        KeyModel keyModel1 = new KeyModel("2");
        KeyModel keyModel2 = new KeyModel("3");

        TreeMap<KeyModel, String> treeMap1 = new TreeMap<>();
        treeMap1.put(keyModel, "1");
        treeMap1.put(keyModel1, "2");
        treeMap1.put(keyModel2, "3");
        System.out.println(treeMap1.size());
        System.out.println(treeMap1.get(keyModel2));
        System.out.println(treeMap1);

        Comparator<KeyModel2> keyModelComparator = new Comparator<KeyModel2>() {
            @Override
            public int compare(KeyModel2 o1, KeyModel2 o2) {
                return 0;
            }
        };

        TreeMap<KeyModel2, String> treeMap2 = new TreeMap<>(keyModelComparator);
        KeyModel2 keyModel21 = new KeyModel2("1");
        KeyModel2 keyModel22 = new KeyModel2("2");
        KeyModel2 keyModel23 = new KeyModel2("3");
        treeMap2.put(keyModel21, "1");
        treeMap2.put(keyModel22, "2");
        treeMap2.put(keyModel23, "3");
        System.out.println(treeMap2.toString());


    }
}
