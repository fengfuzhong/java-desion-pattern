package src.com.feng.design.structpattern.Facade;

import com.feng.design.createpattern.SimpleFactory.Ball;
import com.feng.design.createpattern.SimpleFactory.SimpleBallFactory;
import com.feng.design.createpattern.SimpleFactory.Soccer;

/*外观模式
又称门面模式，就是一个门面，一个操作无需让对象知道其内部实现的复杂度，
尽量让用户感知到是非常简单的。这就是为什么我们controller层尽量（或者说一定）少些业务逻辑，
让controller层只是起到一个传参和通用性参数校验的功能，剩下的全交给service去做吧。
我们还需要在代码中不断将“长得”特别长的代码封装成一个方法，“让处处都有好看的外观”。
看一下我们曾写过的代码，这里只起到了传参的作用，究竟这个足球是怎么创建出来的，
客户端不必担心。*/
public class Facede {

    public static void main(String[] args){
        Ball ball= SimpleBallFactory.createBall(Soccer.class.getName());
        ball.create();

    }
}
