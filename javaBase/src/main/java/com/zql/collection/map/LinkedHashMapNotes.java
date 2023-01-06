package com.zql.collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMapNotes {

    /*
        LinkedHashMap底层原理是数组+链表+红黑树，增长因子是0.75，数组的默认长度是16,扩张的时候，数组的长度是原来的2倍，如果数组的长度是2的幂次方，扩张的时候，数组的长度是原来的2倍，如果数组的长度不是2的幂次方，扩张的时候，数组的长度是原来的2倍+1,当链表的长度大于8的时候，链表会转换成红黑树，当红黑树的长度小于6的时候，红黑树会转换成链表。
        lnkedHashMap是HashMap的子类，它的底层实现和HashMap是一样的，只不过它多了一个链表，这个链表用来记录元素的插入顺序，这个链表是双向链表，这个链表的头结点是header，尾结点是tail，当我们向LinkedHashMap中添加元素的时候，会把元素添加到链表的尾部，当我们遍历LinkedHashMap的时候，会按照元素的插入顺序遍历。
     */
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("c", "c");
        linkedHashMap.put("d", "d");
        linkedHashMap.put("a", "a");
        linkedHashMap.put("b", "b");
        System.out.println(linkedHashMap);
    }

}
