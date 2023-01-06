package com.zql.annotation;

import java.util.ArrayList;
import java.util.List;

public class AnnotationNotes {
    /*
    Java自带的标准注解，包括@Override、@Deprecated和@SuppressWarnings，
    分别用于标明重写某个方法、标明某个类或方法过时、标明要忽略的警告，用这些注解标明后编译器就会进行检查。
    元注解，元注解是用于定义注解的注解，包括@Retention、@Target、@Inherited、@Documented，@Retention用于标明注解被保留的阶段，
    @Target用于标明注解使用的范围，@Inherited用于标明注解可继承，@Documented用于标明是否生成javadoc文档。
    自定义注解，可以根据自己的需求定义注解，并可用元注解对自定义注解进行注解。
     */

    /**
     * java自带注解
     */
    class A{
        public void test() {

        }
    }

    class B extends A{

        /**
         * 重载父类的test方法
         */
        @Override
        public void test() {
        }

        /**
         * 被弃用的方法
         */
        @Deprecated
        public void oldMethod() {
        }

        /**
         * 忽略告警
         *
         * @return
         */
        @SuppressWarnings("rawtypes")
        public List processList() {
            List list = new ArrayList();
            return list;
        }
    }

}
