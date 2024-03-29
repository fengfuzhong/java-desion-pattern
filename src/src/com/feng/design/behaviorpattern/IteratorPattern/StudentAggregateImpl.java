package src.com.feng.design.behaviorpattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 班级类
 */
public class StudentAggregateImpl implements StudentAggregate {
    private List<Student> list;  // 学生列表

    public StudentAggregateImpl() {
        this.list = new ArrayList<Student>();
    }

    @Override
    public void addStudent(Student student) {
        this.list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }

}
