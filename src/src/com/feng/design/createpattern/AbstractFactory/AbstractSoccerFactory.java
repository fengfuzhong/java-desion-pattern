package src.com.feng.design.createpattern.AbstractFactory;

import com.feng.design.createpattern.FactoryMethod.BallFactory;
import com.feng.design.createpattern.SimpleFactory.Ball;
import com.feng.design.createpattern.SimpleFactory.Soccer;

//抽象工厂模式主要设计产品组的概念，就是某一个工厂生产出配套的一系列产品。
// 例如，在生产足球的同时，SoccerFactory还可以生产与之配套的足球杂志。
public class AbstractSoccerFactory implements BallFactory {

    @Override
    public Ball create() {
        return new Soccer();
    }

    public Journai createJournai() {
        return new SoccerJournai();
    }
}
