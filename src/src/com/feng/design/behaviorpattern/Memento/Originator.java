package src.com.feng.design.behaviorpattern.Memento;

public class Originator {
    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemo(Memento memento) {
        this.state = memento.getState();
    }
}
