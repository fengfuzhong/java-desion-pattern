package src.com.feng.design.behaviorpattern.IteratorPattern;

/**
 * 学生类
 */
public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    private Integer number;

    public Student(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    /*
    报数
     */
    public void count() {
        System.out.println(String.format("我是 %d 号 %s", this.number, this.name));
    }
}
