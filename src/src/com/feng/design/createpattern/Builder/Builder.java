package src.com.feng.design.createpattern.Builder;

public abstract class Builder {
    abstract void setCpu();

    abstract void setMainBoard();

    abstract void setDisplay();

    abstract Computer createComputer();
}
