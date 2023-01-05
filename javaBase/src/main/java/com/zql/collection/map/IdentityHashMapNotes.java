package com.zql.collection.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapNotes {

    /*
    IIdentityHashMap的key是通过==来判断是否相等的，而不是通过equals来判断是否相等的，所以IdentityHashMap的key可以是任意类型，包括null
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
