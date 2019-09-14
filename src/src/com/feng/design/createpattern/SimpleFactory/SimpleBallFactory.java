package src.com.feng.design.createpattern.SimpleFactory;

//简单工厂模式

public class SimpleBallFactory {
    //这个用的比较少，就是有个工厂，告诉你我要什么东西，你造好了给我就行
    public static Ball createBall(String name){
        if(name.equals("Soccer")){
            return new Soccer();
        }
        else if(name.equals("BasketBall")){
            return new BasketBall();
        }else
            return null;
    }
    public static void main(String[] args){
        Ball soccer=SimpleBallFactory.createBall(Soccer.class.getName());
        soccer.create();
        Ball basketBall=SimpleBallFactory.createBall(BasketBall.class.getName());
    }
}
