package com.zql.collection.map;

import java.util.WeakHashMap;

public class WeakHashMapNotes {

    /*
    将一对key, value放入到 WeakHashMap 里并不能避免该key值被GC回收，除非在 WeakHashMap 之外还有对该key的强引用
    举例来说：声明了两个Map对象，一个是HashMap，一个是WeakHashMap，同时向两个map中放入a、b两个对象，
    当HashMap remove掉a 并且将a、b都指向null时，WeakHashMap中的a将自动被回收掉。
    出现这个状况的原因是，对于a对象而言，当HashMap remove掉并且将a指向null后，
    除了WeakHashMap中还保存a外已经没有指向a的指针了，所以WeakHashMap会自动舍弃掉a，git
    而对于b对象虽然指向了null，但HashMap中还有指向b的指针，所以WeakHashMap将会保留。
     */
    public static void main(String[] args) {

        WeakHashMap<String, String> map = new WeakHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
    }
}
