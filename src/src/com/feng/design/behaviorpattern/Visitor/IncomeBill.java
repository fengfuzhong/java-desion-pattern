package src.com.feng.design.behaviorpattern.Visitor;

/**
 * 收入的单子
 */
public class IncomeBill implements Bill{
    private double amount;

    private String item;

    public IncomeBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    public void accept(AccountBookVisitor viewer) {
        viewer.view(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }
}
