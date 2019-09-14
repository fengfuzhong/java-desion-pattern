package src.com.feng.design.behaviorpattern.Strategy;

public class SubstractAction implements Strategy {

    @Override
    public void doAction(int num1, int num2) {
        System.out.println(num1 - num2);
    }

}
