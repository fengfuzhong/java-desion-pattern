package src.com.feng.design.behaviorpattern.IteratorPattern;

/**
 * 迭代器模式(Iterator Pattern)：提供一种方法来顺序访问聚合对象，
 * 而不用暴露这个对象的内部表示，其别名为游标(Cursor)
 */
public class IteratorTest {
    public static void main(String[] args) {
        StudentAggregate classOne = new StudentAggregateImpl();
        classOne.addStudent(new Student("张三", 1));
        classOne.addStudent(new Student("李四", 2));
        classOne.addStudent(new Student("王五", 3));
        classOne.addStudent(new Student("赵六", 4));

        // 遍历，报数
        StudentIterator iterator = classOne.getStudentIterator();
        while (iterator.hashNext()){
            Student student = iterator.next();
            student.count();
        }
    }

}
