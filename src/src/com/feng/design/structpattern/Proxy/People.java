package src.com.feng.design.structpattern.Proxy;

public class People implements Buyer {

    @Override
    public void buyCar(){
        System.out.println("买了辆奥拓");
    }
}
