package com.zql.collection.map;


import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.Map;

public class EnumMapNotes {


    /*
    使用EnumMap的时候，key必须是enum类型，value可以是任意类型
    EnumMap的比hashMap效率高，因为hashMap的key是无序的，而EnumMap的key是有序的
    enumMap底层是数组，而hashMap底层是链表，数组的查询效率比链表高，所以EnumMap的查询效率比hashMap高，
    但是EnumMap的增删效率比hashMap低，因为EnumMap的增删需要移动数组的元素，
    而hashMap的增删只需要修改链表的指针，所以EnumMap的增删效率比hashMap低，
    但是EnumMap的查询效率比hashMap高，所以EnumMap的效率比hashMap高。
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
