package src.com.feng.design.createpattern.Proptype;

/*原型模式
用的比较少，用于创建重复对象。需要实现Cloneable 可以选择重写clone()方法。clone分为浅克隆和深克隆。
浅克隆只是克隆引用，对象还是一个。深克隆是对象也新创建了一个，如下：*/
public class User implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;

    public User(String userName, Integer userAge) {
        this.name = userName;
        this.age = userAge;
    }

    protected User clone() throws CloneNotSupportedException{
        return new User(this.name, this.age);
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        User user1=new User("小明",21);
        User uer2=user1.clone();
        user1.setAge(18);
        System.out.println(uer2.getAge()); //25
        System.out.println(user1.getAge());//18
    }
}
