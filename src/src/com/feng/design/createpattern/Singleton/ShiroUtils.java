package src.com.feng.design.createpattern.Singleton;


import com.feng.design.createpattern.AbstractFactory.AbstractSoccerFactory;
import com.feng.design.createpattern.FactoryMethod.BallFactory;

public class ShiroUtils {
    public static BallFactory soccerFactory;

    public static BallFactory createSingletonBallFactory() {
        if (soccerFactory == null) {
            synchronized (ShiroUtils.class) {
                soccerFactory = new AbstractSoccerFactory();
            }
        }
        return soccerFactory;
    }
}
