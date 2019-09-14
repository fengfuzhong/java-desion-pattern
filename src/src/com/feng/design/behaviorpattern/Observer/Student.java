package src.com.feng.design.behaviorpattern.Observer;

public class Student {

    private String name;
    public Student(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void doSomething(){
        System.out.println(getName()+"交卷了");
    }
}
