package src.com.feng.design.createpattern.FactoryMethod;

import com.feng.design.createpattern.SimpleFactory.Ball;

/*简单工厂模式差不太多，就是将工厂继续拆分，比如说刚刚EasyBallFactory是一个总工厂，
我们现在拆分成SoccerFactory和BasketBallFactory分别生产足球和篮球。
某个工厂内部可以根据需求生产不同的产品，比如说soccer可以生产不同大小的出来。*/
public interface BallFactory {
    Ball create();
}
