package src.com.feng.design.behaviorpattern.Memento;

public class Memento {

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String state;

    public Memento(String state){
        this.state=state;
    }

}
