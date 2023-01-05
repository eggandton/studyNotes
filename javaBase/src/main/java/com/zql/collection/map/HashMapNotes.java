package com.zql.collection.map;

public class HashMapNotes {

    /*
     HashMap底层原理是数组+链表+红黑树，增长因子是0.75，数组的默认长度是16
     扩张的时候，数组的长度是原来的2倍，如果数组的长度是2的幂次方，扩张的时候，数组的长度是原来的2倍，如果数组的长度不是2的幂次方，扩张的时候，数组的长度是原来的2倍+1
     当链表的长度大于8的时候，链表会转换成红黑树，当红黑树的长度小于6的时候，红黑树会转换成链表。


     */
    public static void main(String[] args) {

    }

}
