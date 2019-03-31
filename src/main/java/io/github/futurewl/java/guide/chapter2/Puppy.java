package io.github.futurewl.java.guide.chapter2;

/**
 * 功能描述：
 * 1. 每个类都有构造方法。
 * 2. 如果没有显式地为类定义构造方法，Java编译器将会为该类提供一个默认构造方法。
 * 3. 在创建一个对象的时候，至少要调用一个构造方法。
 * 4. 构造方法的名称必须与类同名，一个类可以有多个构造方法。
 *
 * @author weilai create by 2019-03-31:22:40
 * @version 1.0
 */
public class Puppy {
    int puppyAge;

    public Puppy() {
    }

    public Puppy(String name) {
        // 这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("小狗的年龄为 : " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        // 下面的语句将创建一个Puppy对象
        Puppy myPuppy = new Puppy("tommy");
        /* 通过方法来设定age */
        myPuppy.setAge(2);
        /* 调用另一个方法获取age */
        myPuppy.getAge();
        /*你也可以像下面这样访问成员变量 */
        System.out.println("变量值 : " + myPuppy.puppyAge);
    }

}
