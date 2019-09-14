package src.com.feng.design.structpattern.Bridge;

import com.feng.design.createpattern.SimpleFactory.Ball;
import com.feng.design.createpattern.SimpleFactory.BasketBall;
import com.feng.design.createpattern.SimpleFactory.Soccer;

/*桥接模式
就是用于抽象化和实现化的解耦。又是解耦，貌似设计模式就是教我们如何优雅的解耦。
提高了代码的拓展性，并且可以实现代码的动态切换;
桥接模式类似于策略模式，区别在于策略模式封装一系列算法使得算法可以互相替换。
策略模式使抽象部分和实现部分分离，可以独立变化。*/
public class BallCut {

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    private Ball ball;


    public void create(){
        System.out.println(ball.create());
    }
    public static void main(String[] args){
        BallCut ballCut=new BallCut();
        ballCut.setBall(new BasketBall());
        ballCut.create();
        ballCut.setBall(new Soccer());
        ballCut.create();
    }
}
