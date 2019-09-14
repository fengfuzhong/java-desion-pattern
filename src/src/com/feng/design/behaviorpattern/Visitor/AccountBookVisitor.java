package src.com.feng.design.behaviorpattern.Visitor;

/**
 * 访问者
 */
public interface  AccountBookVisitor {
    //查看消费的单子
    void view(ConsumeBill bill);

    //查看收入的单子
    void view(IncomeBill bill);
}
