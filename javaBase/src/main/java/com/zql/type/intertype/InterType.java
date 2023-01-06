package com.zql.type.intertype;

public interface InterType<T,V> {

    void setValue(T t);
    T getValue();
    void setV(V v);
    V getV();
    class InterTypeImpl implements InterType<String, Integer>{

        private String t;
        private Integer v;
        @Override
        public void setValue(String t) {
            this.t = t;
        }

        @Override
        public String getValue() {
            return t;
        }

        @Override
        public void setV(Integer v) {
            this.v = v;
        }

        @Override
        public Integer getV() {
            return v;
        }
    }

    public static void main(String[] args) {
        InterTypeImpl interType = new InterTypeImpl();
        interType.setValue("1");
        interType.setV(1);
        System.out.println(interType.getValue());
        System.out.println(interType.getV());
    }
}
