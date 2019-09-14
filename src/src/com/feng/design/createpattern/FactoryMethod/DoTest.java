package src.com.feng.design.createpattern.FactoryMethod;


import com.feng.design.createpattern.SimpleFactory.Ball;

public class DoTest {

    public static void main(String[] args) {
        BallFactory ballFactory = new SoccerFactory();
        Ball ball = ballFactory.create();
        ball.create();
    }
}
