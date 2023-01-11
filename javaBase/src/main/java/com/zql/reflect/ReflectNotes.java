package com.zql.reflect;

import org.junit.jupiter.api.Test;

public class ReflectNotes {

    /*
    Class类对象的获取在类加载的时候，jvm会创建一个class对象class对象是可以说是反射中最常用的，
    获取class对象的方式的主要有三种根据类名：
    类名.class根据对象：对象.getClass()根据全限定类名：Class.forName(全限定类名)
     */

    @Test
    public void classTest() throws Exception {
        // 获取Class对象的三种方式
        System.out.println("根据类名:  \t" + User.class);
        System.out.println("根据对象:  \t" + new User().getClass());
        System.out.println("根据全限定类名:\t" + Class.forName("com.zql.reflect.ReflectNotes$User"));
        // 常用的方法
        Class<User> userClass = User.class;
        System.out.println("获取全限定类名:\t" + userClass.getName());
        System.out.println("获取类名:\t" + userClass.getSimpleName());
        System.out.println("实例化:\t" + userClass.newInstance());
    }
    

    public class User {
        private String name = "init";
        private int age;
        public User() {}
        public User(String name, int age) {
            super();
            this.name = name;
            this.age = age;
        }
        private String getName() {
            return name;
        }
        private void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        @Override
        public String toString() {
            return "User [name=" + name + ", age=" + age + "]";
        }
    }
    /*
    class方法：
    forName()(1)获取Class对象的一个引用，但引用的类还没有加载(该类的第一个对象没有生成)就加载了这个类。(2)为了产生Class引用，forName()立即就进行了初始化。Object-getClass()获取Class对象的一个引用，返回表示该对象的实际类型的Class引用。
    getName()取全限定的类名(包括包名)，即类的完整名字。
    getSimpleName()获取类名(不包括包名)
    getCanonicalName()获取全限定的类名(包括包名)
    isInterface()判断Class对象是否是表示一个接口
    getInterfaces()返回Class对象数组，表示Class对象所引用的类所实现的所有接口。
    getSupercalss()返回Class对象，表示Class对象所引用的类所继承的直接基类。应用该方法可在运行时发现一个对象完整的继承结构。
    newInstance()返回一个Oject对象，是实现“虚拟构造器”的一种途径。使用该方法创建的类，必须带有无参的构造器。
    getFields()获得某个类的所有的公共（public）的字段，包括继承自父类的所有公共字段。 类似的还有getMethods和getConstructors。
    getDeclaredFields获得某个类的自己声明的字段，即包括public、private和proteced，默认但是不包括父类声明的任何字段。类似的还有getDeclaredMethods和getDeclaredConstructors。
     */

    /*
    Constructor类及其用法:
    static Class<?>forName(String className)返回与带有给定字符串名的类或接口相关联的 Class 对象。
    ConstructorgetConstructor(Class<?>... parameterTypes)返回指定参数类型、具有public访问权限的构造函数对象
    Constructor<?>[]getConstructors()返回所有具有public访问权限的构造函数的Constructor对象数组
    ConstructorgetDeclaredConstructor(Class<?>... parameterTypes)返回指定参数类型、所有声明的（包括private）构造函数对象
    Constructor<?>[]getDeclaredConstructors()返回所有声明的（包括private）构造函数对象
    TnewInstance()调用无参构造器创建此 Class 对象所表示的类的一个新实例。

    Constructor类的方法：
    ClassgetDeclaringClass()返回 Class 对象，该对象表示声明由此 Constructor 对象表示的构造方法的类,其实就是返回真实类型（不包含参数）
    Type[]getGenericParameterTypes()按照声明顺序返回一组 Type 对象，返回的就是 Constructor对象构造函数的形参类型。
    StringgetName()以字符串形式返回此构造方法的名称。
    Class<?>[]getParameterTypes()按照声明顺序返回一组 Class 对象，即返回Constructor 对象所表示构造方法的形参类型
    TnewInstance(Object... initargs)使用此 Constructor对象表示的构造函数来创建新实例StringtoGenericString()返回描述此 Constructor 的字符串，其中包括类型参数。
     */

    /*
    Field类及其用法:
    FieldgetDeclaredField(String name)获取指定name名称的(包含private修饰的)字段，不包括继承的字段
    Field[]getDeclaredFields()获取Class对象所表示的类或接口的所有(包含private修饰的)字段,不包括继承的字段
    FieldgetField(String name)获取指定name名称、具有public修饰的字段，包含继承字段
    Field[]getFields()获取修饰符为public的字段，包含继承字段

    Field类的方法：
    voidset(Object obj, Object value)将指定对象变量上此 Field 对象表示的字段设置为指定的新值。
    Objectget(Object obj)返回指定对象上此 Field 表示的字段的值
    Class<?>getType()返回一个 Class 对象，它标识了此Field 对象所表示字段的声明类型。
    booleanisEnumConstant()如果此字段表示枚举类型的元素则返回 true；否则返回 false
    StringtoGenericString()返回一个描述此 Field（包括其一般类型）的字符串
    StringgetName()返回此 Field 对象表示的字段的名称
    Class<?>getDeclaringClass()返回表示类或接口的 Class 对象，该类或接口声明由此 Field 对象表示的字段
    voidsetAccessible(boolean flag)将此对象的 accessible 标志设置为指示的布尔值,即设置其可访问性
     */

    /*
    Method类及其用法:

    MethodgetDeclaredMethod(String name, Class<?>... parameterTypes)返回一个指定参数的Method对象，该对象反映此 Class 对象所表示的类或接口的指定已声明方法。
    Method[]getDeclaredMethods()返回 Method 对象的一个数组，这些对象反映此 Class 对象表示的类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
    MethodgetMethod(String name, Class<?>... parameterTypes)返回一个 Method 对象，它反映此 Class 对象所表示的类或接口的指定公共成员方法。
    Method[]getMethods()返回一个包含某些 Method 对象的数组，这些对象反映此 Class 对象所表示的类或接口（包括那些由该类或接口声明的以及从超类和超接口继承的那些的类或接口）的公共 member 方法。

    Method类的方法：
    Objectinvoke(Object obj, Object... args)对带有指定参数的指定对象调用由此 Method 对象表示的底层方法。
    Class<?>getReturnType()返回一个 Class 对象，该对象描述了此 Method 对象所表示的方法的正式返回类型,即方法的返回类型
    TypegetGenericReturnType()返回表示由此 Method 对象所表示方法的正式返回类型的 Type 对象，也是方法的返回类型。
    Class<?>[]getParameterTypes()按照声明顺序返回 Class 对象的数组，这些对象描述了此 Method 对象所表示的方法的形参类型。即返回方法的参数类型组成的数组
    Type[]getGenericParameterTypes()按照声明顺序返回 Type 对象的数组，这些对象描述了此 Method 对象所表示的方法的形参类型的，也是返回方法的参数类型
    StringgetName()以 String 形式返回此 Method 对象表示的方法名称，即返回方法的名称
    booleanisVarArgs()判断方法是否带可变参数，如果将此方法声明为带有可变数量的参数，则返回 true；否则，返回 false。
    StringtoGenericString()返回描述此 Method 的字符串，包括类型参数
     */
}
