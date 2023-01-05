package com.zql.collection.map;


import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.Map;

public class EnumMapNotes {


    /*
    1 使用EnumMap的时候，key必须是enum类型，value可以是任意类型
    2 EnumMap的key是有序的，key的顺序是enum的顺序
    3 EnumMap的key是不可重复的，如果有重复的key，后面的会覆盖前面的
    4 EnumMap的key是不可为null的，如果为null，会抛出NullPointerException
    5 EnumMap的key是不可修改的，如果修改，会抛出UnsupportedOperationException
    6 EnumMap的key是线程安全的，可以在多线程中使用
    7 EnumMap的key是不可变的，如果修改，会抛出UnsupportedOperationException
    8 EnumMap的key是不可序列化的，如果序列化，会抛出NotSerializableException
    9 EnumMap的key是不可克隆的，如果克隆，会抛出CloneNotSupportedException
    10 EnumMap的key是不可hash的，如果hash，会抛出UnsupportedOperationException
    11 EnumMap的key是不可比较的，如果比较，会抛出ClassCastException
    12 EnumMap的key是不可迭代的，如果迭代，会抛出UnsupportedOperationException
    13 EnumMap的key是不可同步的，如果同步，会抛出UnsupportedOperationException
    14 EnumMap的key是不可弱引用的，如果弱引用，会抛出UnsupportedOperationException
    15 EnumMap的key是不可强引用的，如果强引用，会抛出UnsupportedOperationException
    16 EnumMap的key是不可虚引用的，如果虚引用，会抛出UnsupportedOperationException
    17 EnumMap的key是不可软引用的，如果软引用，会抛出UnsupportedOperationException
    18 EnumMap的比hashMap效率高，因为hashMap的key是无序的，而EnumMap的key是有序的
     */
    public static void main(String[] args) {

        Map<DayOfWeek, String> map = new EnumMap<>(DayOfWeek.class);
        map.put(DayOfWeek.MONDAY, "星期一");
        map.put(DayOfWeek.TUESDAY, "星期二");
        map.put(DayOfWeek.WEDNESDAY, "星期三");
        map.put(DayOfWeek.THURSDAY, "星期四");
        map.put(DayOfWeek.FRIDAY, "星期五");
        map.put(DayOfWeek.SATURDAY, "星期六");
        map.put(DayOfWeek.SUNDAY, "星期日");
        System.out.println(map);
        System.out.println(map.get(DayOfWeek.MONDAY));


    }

}
