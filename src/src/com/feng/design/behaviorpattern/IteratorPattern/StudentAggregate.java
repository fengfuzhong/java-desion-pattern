package src.com.feng.design.behaviorpattern.IteratorPattern;

/**
 * 班级接口
 */
public interface  StudentAggregate {
    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
