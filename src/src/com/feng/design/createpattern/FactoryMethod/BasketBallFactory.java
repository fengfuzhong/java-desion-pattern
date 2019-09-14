package src.com.feng.design.createpattern.FactoryMethod;

import com.feng.design.createpattern.SimpleFactory.Ball;
import com.feng.design.createpattern.SimpleFactory.BasketBall;

//某个工厂内部可以根据需求生产不同的产品，比如说soccer可以生产不同大小的出来。
public class BasketBallFactory implements BallFactory {
    public Ball create() {
        return new BasketBall();
    }
}
