package com.zql.type.classtype;

public class ClassType<K,V> {

    private K k;
    private V v;
    public void setValue(K k){
        this.k = k;
    }
    public K getValue(){
        return k;
    }
    public void setV(V v){
        this.v = v;
    }
    public V getV(){
        return v;
    }


    public static void main(String[] args) {
        ClassType<String, Integer> stringIntegerClassType = new ClassType<>();
        stringIntegerClassType.setValue("1");
        stringIntegerClassType.setV(1);
        System.out.println(stringIntegerClassType.getValue());
        System.out.println(stringIntegerClassType.getV());
    }
}
