package io.github.futurewl.java.guide.chapter1;

/**
 * 功能描述：Java 5.0引入了枚举，枚举限制变量只能是预先设定好的值。使用枚举可以减少代码中的 bug。
 * 例如，我们为果汁店设计一个程序，它将限制果汁为小杯、中杯、大杯。这就意味着它不允许顾客点除了这三种尺寸外的果汁。
 *
 * @author weilai create by 2019-04-09:10:39
 * @version 1.0
 */

class FreshJuice {

    enum FreshJuiceSize {
        SMALL,
        MEDIUM,
        LARGE
    }

    FreshJuiceSize size;
}

public class FreshJuiceTest {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
    }
}
