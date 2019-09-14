package src.com.feng.design.behaviorpattern.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录模式
 * 相当于做一个快照，在不破坏对象本身结构的情况下，记录对象的一个状态，
 * 合适的时候可以恢复到这种状态。数据库做事务回滚的时候就用了这种方式。
 * 这里需要注意的是，对象不与备忘录本身耦合，
 * 而是跟备忘录管理类耦合（就是List<备忘录>），这个好理解，毕竟快照不止一个嘛。
 */
public class CareTaker {
    private List<Memento> lstMemento = new ArrayList<>();

    public void addMemento(Memento memento) {
        this.lstMemento.add(memento);
    }

    public Memento get(Integer index) {
        return this.lstMemento.get(index);
    }

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State %1");
        originator.setState("State #2");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.addMemento(originator.saveStateToMemento());
        originator.setState("State #4");
        System.out.println("current state:" + originator.getState());
        originator.getStateFromMemo(careTaker.get(0));
        System.out.println("current state:" + originator.getState());
        originator.getStateFromMemo(careTaker.get(1));
        System.out.println("current state:" + originator.getState());
    }
}
