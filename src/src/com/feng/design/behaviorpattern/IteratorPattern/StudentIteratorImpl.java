package src.com.feng.design.behaviorpattern.IteratorPattern;

import java.util.List;

/**
 * 迭代器实现
 */


public class StudentIteratorImpl implements StudentIterator{
    private List<Student> list;
    private int position = 0;
    private Student currentStudent;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hashNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        currentStudent = list.get(position);
        position ++;
        return currentStudent;
    }
}

