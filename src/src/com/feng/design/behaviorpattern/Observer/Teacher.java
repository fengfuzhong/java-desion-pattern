package src.com.feng.design.behaviorpattern.Observer;

import java.util.HashSet;
import java.util.Set;


public class Teacher {

    private Set<Student> students = new HashSet<>();

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    public void doNotify() {
        System.out.println("老师提醒各位 同学开始交卷了");
        for (Student student : students) {
            student.doSomething();
        }
    }


}
