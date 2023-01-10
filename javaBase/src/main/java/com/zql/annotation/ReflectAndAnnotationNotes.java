package com.zql.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class ReflectAndAnnotationNotes {
    /*
    boolean isAnnotationPresent(Class<?extends Annotation> annotationClass)判断该程序元素上是否包含指定类型的注解，
    存在则返回true，否则返回false。注意：此方法会忽略注解对应的注解容器。


    <T extends Annotation> T getAnnotation(Class<T> annotationClass)返回该程序元素上存在的、指定类型的注解，如果该类型注解不存在，则返回null

    Annotation[] getAnnotations()返回该程序元素上存在的所有注解，若没有注解，返回长度为0的数组。

    <T extends Annotation> T[] getAnnotationsByType(Class<T> annotationClass)返回该程序元素上存在的、指定类型的注解数组。
    没有注解对应类型的注解时，返回长度为0的数组。该方法的调用者可以随意修改返回的数组，而不会对其他调用者返回的数组产生任何影响。
    getAnnotationsByType方法与 getAnnotation的区别在于，getAnnotationsByType会检测注解对应的重复注解容器。若程序元素为类，
    当前类上找不到注解，且该注解为可继承的，则会去父类上检测对应的注解。

    <T extends Annotation> T getDeclaredAnnotation(Class<T> annotationClass)返回直接存在于此元素上的所有注解。与此接口中的其他方法不同，
    该方法将忽略继承的注释。如果没有注释直接存在于此元素上，则返回null

    <T extends Annotation> T[] getDeclaredAnnotationsByType(Class<T> annotationClass)返回直接存在于此元素上的所有注解。
    与此接口中的其他方法不同，该方法将忽略继承的注释

    Annotation[] getDeclaredAnnotations()返回直接存在于此元素上的所有注解及注解对应的重复注解容器。与此接口中的其他方法不同，
    该方法将忽略继承的注解。如果没有注释直接存在于此元素上，则返回长度为零的一个数组。
    该方法的调用者可以随意修改返回的数组，而不会对其他调用者返回的数组产生任何影响
     */
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MyAnno {
        String value();
    }

    public static class MyAnnoClass {
        @MyAnno("hello")
        public void test() {
            System.out.println("test");
        }
    }


    public static void main(String[] args) {
        MyAnnoClass myAnnoClass = new MyAnnoClass();
        Class<?> aClass = null;
        try {
            aClass = MyAnnoClass.class.getClassLoader().loadClass("com.zql.annotation.ReflectAndAnnotationNotes$MyAnnoClass");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(String.format("反射类%s失败", "com.zql.annotation.ReflectAndAnnotationNotes$MyAnnoClass"));
        }
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            boolean annotationPresent = method.isAnnotationPresent(MyAnno.class);
            if (annotationPresent) {
                MyAnno myAnno = method.getAnnotation(MyAnno.class);
                System.out.println(myAnno.value());
                Annotation[] annotations = method.getAnnotations();
                for (Annotation annotation : annotations) {
                    System.out.println(annotation.toString());
                }
                MyAnno[] annotationsByType = method.getAnnotationsByType(MyAnno.class);
                for (MyAnno myAnno1 : annotationsByType) {
                    System.out.println(myAnno1);
                }
                MyAnno declaredAnnotation1 = method.getDeclaredAnnotation(MyAnno.class);
                System.out.println(declaredAnnotation1);

                MyAnno[] declaredAnnotationsByType = method.getDeclaredAnnotationsByType(MyAnno.class);
                for (MyAnno myAnno1 : declaredAnnotationsByType) {
                    System.out.println(myAnno1);
                }

                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                for (Annotation declaredAnnotation : declaredAnnotations) {
                    System.out.println(declaredAnnotation);
                }
            }
        }
    }

}
