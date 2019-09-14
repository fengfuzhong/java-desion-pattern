package src.com.feng.design.behaviorpattern.Visitor;

/**
 *  Element
 */
public interface Bill {
    void accept(AccountBookVisitor viewer);
}
