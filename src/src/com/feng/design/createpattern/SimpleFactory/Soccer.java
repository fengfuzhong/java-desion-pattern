package src.com.feng.design.createpattern.SimpleFactory;

public class Soccer implements Ball {
    @Override
    public String create() {
        return "给你一个足球";
    }
}
