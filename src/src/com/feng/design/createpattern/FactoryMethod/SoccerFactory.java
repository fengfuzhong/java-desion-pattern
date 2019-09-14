package src.com.feng.design.createpattern.FactoryMethod;

import com.feng.design.createpattern.SimpleFactory.Ball;
import com.feng.design.createpattern.SimpleFactory.Soccer;

public class SoccerFactory implements BallFactory {
    public Ball create() {
        return new Soccer();
    }
}
