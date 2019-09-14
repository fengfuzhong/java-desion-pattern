package src.com.feng.design.structpattern.Composite;

public abstract class Menu {
    protected String name;
    protected int type;
    public Menu(String name,int type) {
        this.name=name;
        this.type=type;

    }

    public abstract void display(int depth);
}
