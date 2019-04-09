package io.github.futurewl.java.guide.chapter4;

/**
 * 功能描述：final 方法
 * 类中的 final 方法可以被子类继承，但是不能被子类修改。
 * 声明 final 方法的主要目的是防止该方法的内容被修改。
 * 如下所示，使用 final 修饰符声明方法。
 *
 * @author weilai create by 2019-04-09:11:14
 * @version 1.0
 */
public class Test2 {

    public final void changeName() {
        // 方法体
    }

}

