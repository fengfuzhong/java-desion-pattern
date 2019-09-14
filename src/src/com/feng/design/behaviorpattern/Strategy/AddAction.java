package src.com.feng.design.behaviorpattern.Strategy;

/*
定义一组算法, 将每个算法都封装起来, 并且使它们之间可以互换。
可以说是一组算法的封装，根据客户端给出的不同要求，进行不同的运算.
符合开闭原则
 */
public class AddAction implements Strategy {
    @Override
    public void doAction(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
