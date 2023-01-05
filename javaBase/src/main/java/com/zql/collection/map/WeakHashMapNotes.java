package com.zql.collection.map;

import java.util.WeakHashMap;

public class WeakHashMapNotes {

    /*
    1 使用WeakHashMap的时候，key可以是任意类型，value可以是任意类型
    2 WeakHashMap的key是无序的，key的顺序是随机的
    3 WeakHashMap的key是可重复的，如果有重复的key，后面的会覆盖前面的
    4 WeakHashMap的key是可为null的，如果为null，不会抛出NullPointerException
    5 WeakHashMap的key是可修改的，如果修改，不会抛出UnsupportedOperationException
    6 WeakHashMap的key是线程不安全的，不可以在多线程中使用
    7 WeakHashMap的key是可变的，如果修改，不会抛出UnsupportedOperationException
    8 WeakHashMap的key是可序列化的，如果序列化，不会抛出NotSerializableException
    9 WeakHashMap的key是可克隆的，如果克隆，不会抛出CloneNotSupportedException
    10 WeakHashMap的key是可hash的，如果hash，不会抛出UnsupportedOperationException
    11 WeakHashMap的key是可比较的，如果比较，不会抛出ClassCastException
    12 WeakHashMap的key是可迭代的，如果迭代，不会抛出UnsupportedOperationException
    13 WeakHashMap的key是可同步的，如果同步，不会抛出UnsupportedOperationException
    14 WeakHashMap的key是可弱引用的，如果弱引用，不会抛出UnsupportedOperationException
    15 WeakHashMap的key是可强引用的，如果强引用，不会抛出UnsupportedOperationException
    16 WeakHashMap的key是可虚引用的，如果虚引用，不会抛出UnsupportedOperationException
    17 WeakHashMap的key是可软引用的，如果软引用，不会抛出UnsupportedOperationException
    18 WeakHashMap的比hashMap效率低，因为hashMap的key是有序的，而WeakHashMap的key是无序的
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
