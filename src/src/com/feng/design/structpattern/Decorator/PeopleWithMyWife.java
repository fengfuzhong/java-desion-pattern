package src.com.feng.design.structpattern.Decorator;

import com.feng.design.structpattern.Proxy.Buyer;

public class PeopleWithMyWife implements Buyer {
    public void buyCar() {
        System.out.println("跟我老婆一块儿买了辆奥拓");
    }
}
