package src.com.feng.design.behaviorpattern.Strategy;


public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void exectAciton(int num1,int num2){
        strategy.doAction(num1,num2);
    }
}

