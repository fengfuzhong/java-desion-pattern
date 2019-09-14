package src.com.feng.design.createpattern.AbstractFactory;

import com.feng.design.createpattern.FactoryMethod.BallFactory;
import com.feng.design.createpattern.SimpleFactory.Ball;

public class DoTestAbstractFactory {
    public static void main(String[] args) {
        BallFactory factory = new AbstractSoccerFactory();
        Journai soccerJournai = ((AbstractSoccerFactory) factory).createJournai();
        Ball soccerBall = factory.create();
        System.out.println(soccerBall.create());
        System.out.println(soccerJournai.createJournai());
    }
}
