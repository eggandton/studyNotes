package com.zql.collection.map.model;


public class KeyModel implements Comparable<KeyModel> {

    private String key;

    public KeyModel(String key) {
        this.key = key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    public String getKey() {
        return key;
    }

    @Override
    public int compareTo(KeyModel o) {
        return this.key.compareTo(o.getKey());
    }
}
