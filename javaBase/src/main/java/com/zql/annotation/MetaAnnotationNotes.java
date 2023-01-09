package com.zql.annotation;

public class MetaAnnotationNotes {

    /*
    @Target 目标 也就是使用在哪些地方

     public enum ElementType {

        TYPE, // 类、接口、枚举类

        FIELD, // 成员变量（包括：枚举常量）

        METHOD, // 成员方法

        PARAMETER, // 方法参数

        CONSTRUCTOR, // 构造方法

        LOCAL_VARIABLE, // 局部变量

        ANNOTATION_TYPE, // 注解类

        PACKAGE, // 可用于修饰：包

        TYPE_PARAMETER, // 类型参数，JDK 1.8 新增

        TYPE_USE // 使用类型的任何地方，JDK 1.8 新增

    }
     */

    /*
    @Retention & @RetentionTarget 保留期 也就是注解在什么时候还有效
    public enum RetentionPolicy {

        SOURCE,    // 源文件保留
        CLASS,       // 编译期保留，默认值
        RUNTIME   // 运行期保留，可通过反射去获取注解信息
    }

     */

    /*
    @Documented 生成文档时是否包含注解信息


    import java.lang.annotation.Documented;
    import java.lang.annotation.ElementType;
    import java.lang.annotation.Target;

    @Documented
    @Target({ElementType.TYPE,ElementType.METHOD})
    public @interface TestDocAnnotation {

        public String value() default "default";
    }

    @TestDocAnnotation("myMethodDoc")
    public void testDoc() {

    }

     */

    /*
    @Inherited 是否允许子类继承父类的注解

    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE,ElementType.METHOD})
    public @interface TestInheritedAnnotation {
        String [] values();
        int number();
    }

    @TestInheritedAnnotation(values = {"value"}, number = 10)
    public class Person {
    }

    class Student extends Person{
        @Test
        public void test(){
            Class clazz = Student.class;
            Annotation[] annotations = clazz.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation.toString());
            }
        }
    }

    即使Student类没有显示地被注解@TestInheritedAnnotation，但是它的父类Person被注解，而且@TestInheritedAnnotation被@Inherited注解，因此Student类自动有了该注解
     */

    /*
    元注解 - @Repeatable (Java8)@Repeatable请参考Java 8 - 重复注解# https://pdai.tech/md/java/java8/java8-anno-repeat.html


    元注解 - @Native (Java8)使用 @Native 注解修饰成员变量，则表示这个变量可以被本地代码引用，常常被代码生成工具使用。对于 @Native 注解不常使用，了解即可# 注解与反射

     */
}
