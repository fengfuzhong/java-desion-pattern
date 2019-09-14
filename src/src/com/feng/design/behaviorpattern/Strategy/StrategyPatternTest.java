package src.com.feng.design.behaviorpattern.Strategy;

public class StrategyPatternTest {

    public static void main(String[] agrs) {
        Context ctx = new Context(new AddAction());
        System.out.println("1o+5=");
        ctx.exectAciton(10, 5);
        ctx = new Context(new SubstractAction());
        System.out.println("1o-5=");
        ctx.exectAciton(10, 5);
    }
}
