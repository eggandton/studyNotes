package com.zql.collection.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapNotes {

    /*
    1 使用IdentityHashMap的时候，key可以是任意类型，value可以是任意类型
    2 IdentityHashMap的key是无序的，key的顺序是随机的
    3 IdentityHashMap的key是不可重复的，如果有重复的key，后面的会覆盖前面的
    4 IdentityHashMap的key是可以为null的，如果为null，不会抛出NullPointerException
    5 IdentityHashMap的key是可以修改的，如果修改，不会抛出UnsupportedOperationException
    6 IdentityHashMap的key是线程不安全的，不可以在多线程中使用
    7 IdentityHashMap的key是可以变的，如果修改，不会抛出UnsupportedOperationException
    8 IdentityHashMap的key是可以序列化的，如果序列化，不会抛出NotSerializableException
    9 IdentityHashMap的key是可以反序列化的，如果反序列化，不会抛出InvalidClassException
    10 IdentityHashMap的key是可以克隆的，如果克隆，不会抛出CloneNotSupportedException
    11 IdentityHashMap的key是可以比较的，如果比较，不会抛出ClassCastException
    12 IdentityHashMap的key比较的==而不是hashcode,hashmap比较的是hashcode
     */
    public static void main(String[] args) {
        IdentityHashMap<String, String> map = new IdentityHashMap<>();
        map.put("a", "a");
        map.put("a", "b");
        String aa = new String("aa");
        String bb = new String("aa");
        String cc = "aa";
        map.put(aa, "b");
        map.put(bb, "c");
        System.out.println(aa==bb);
        System.out.println(aa==cc);
        String dd = "aa";
        aa.intern();


        System.out.println(aa==dd);
        System.out.println(cc==dd);
        System.out.println(map.size());

        String ee = new String("ab")+new String("ab");
        ee.intern();
        String ff = "abab";

        System.out.println(ee==ff);

        String gg = new String("abcabc");
        gg.intern();
        String hh = "abcabc";
        System.out.println(gg==hh);
        String ii = "abcd";
        String jj = "abcd";
        System.out.println(ii==jj);
        //IdentityHashMap的key比较的==而不是hashcode,hashmap比较的是hashcode
        String aa1 = new String("aa");
        String bb1 = new String("aa");
        Map<String, String> objectObjectIdentityHashMap = new IdentityHashMap<>();
        Map<String, String> hashMap = new HashMap<>();
        objectObjectIdentityHashMap.put(aa1, "a");
        hashMap.put(aa1, "a");
        objectObjectIdentityHashMap.put(bb1, "b");
        hashMap.put(bb1, "b");
        System.out.println(objectObjectIdentityHashMap.size());
        System.out.println(hashMap.size());
    }

}
