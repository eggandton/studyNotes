package com.zql.collection.list;

import java.util.PriorityQueue;

public class PriorityQueueNotes {

    /*
        其通过堆实现，具体说是通过完全二叉树(complete binary tree)实现的小顶堆(任意一个非叶子节点的权值，都不大于其左右子节点的权值)，
        也就意味着可以通过数组来作为PriorityQueue的底层实现
        PriorityQueue的默认初始容量是11
        使用数组实现的优先队列，插入和删除的时间复杂度都是O(logN)，取出最小值的时间复杂度是O(1)。
        优先队列。优先队列的作用是能保证每次取出的元素都是队列中权值最小的(Java的优先队列每次取最小元素，C++的优先队列每次取最大元素)。
        这里牵涉到了大小关系，元素大小的评判可以通过元素本身的自然顺序(natural ordering)，
        也可以通过构造时传入的比较器(Comparator，类似于C++的仿函数)。
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> integers = new PriorityQueue<>();
        integers.add(1);
        integers.add(5);
        integers.add(3);
        integers.add(4);
        integers.add(2);
        System.out.println(integers);
        while (!integers.isEmpty()) {
            System.out.println(integers.poll());
        }

    }



}
