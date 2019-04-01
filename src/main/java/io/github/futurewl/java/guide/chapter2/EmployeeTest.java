package io.github.futurewl.java.guide.chapter2;

/**
 * 功能描述：
 * 1. 程序都是从main方法开始执行。
 * 2. 为了能运行这个程序，必须包含main方法并且创建一个实例对象。
 * 3. 下面给出EmployeeTest类，该类实例化2个 Employee 类的实例，并调用方法设置变量的值。
 * 4. 将下面的代码保存在 EmployeeTest.java文件中。
 *
 * @author weilai create by 2019-03-31:23:45
 * @version 1.0
 */
public class EmployeeTest {

    public static void main(String[] args) {
        /* 使用构造器创建两个对象 */
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");

        // 调用这两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序员");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }

}
