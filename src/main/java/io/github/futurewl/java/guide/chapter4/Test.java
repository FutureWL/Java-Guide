package io.github.futurewl.java.guide.chapter4;

/**
 * 功能描述：final 修饰符
 * final 变量：
 * final 表示"最后的、最终的"含义，变量一旦赋值后，不能被重新赋值。被 final 修饰的实例变量必须显式指定初始值。
 * final 修饰符通常和 static 修饰符一起使用来创建类常量。
 *
 * @author weilai create by 2019-04-09:11:14
 * @version 1.0
 */
public class Test {

    final int value = 10;
    // 下面是声明常量的实例
    public static final int BOXWIDTH = 6;

    static final String TITLE = "Manager";

    public void changeValue() {
//        value = 12; //将输出一个错误
    }

}

