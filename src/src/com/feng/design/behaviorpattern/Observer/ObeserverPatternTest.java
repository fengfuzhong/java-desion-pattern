package src.com.feng.design.behaviorpattern.Observer;

/*
定义了一种一对多的依赖关系，当一个对象（被观察者）状态改变的时候，
所有依赖于该对象的观察者都会被通知，从而进行相关操作。
很多中间件都依赖于观察者模式，例如RabbitMQ,还有那些事件驱动模型（好像node就是）。
下面举个例子，被观察者是监考老师，考试时间结束，通知所有观察者学生上交试卷。
 */
public class ObeserverPatternTest {
    public static void main(String[] aggs){
        Teacher teacher1=new Teacher();
        teacher1.addStudent(new Student("小明"));
        teacher1.addStudent(new Student("小张"));
        teacher1.doNotify();
    }
}
