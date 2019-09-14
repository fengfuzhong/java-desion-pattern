package src.com.feng.design.behaviorpattern.Visitor;

import java.util.ArrayList;
import java.util.List;

/**访问者模式
 * 当对特定角色进行访问的时候，需要通过访问者进行访问。
 * 一个对象不太方便被你直接访问的时候，你需要将自己的引用交给访问者，
 * 通过访问者去访问该对象。比如说，化学课，想看一个细胞结构，
 * 由于肉眼无法直接看到微观世界的玩意，需要通过显微镜间接访问
 */
public class AccountBook {
    //单子列表
    private List<Bill> billList = new ArrayList<Bill>();

    //添加单子
    public void addBill(Bill bill) {
        billList.add(bill);
    }

    //供账本的查看者查看账本
    public void show(AccountBookVisitor viewer) {
        for (Bill bill : billList) {
            bill.accept(viewer);
        }
    }

    public static void main(String[] args){
        AccountBook accountBook = new AccountBook();
        //添加收入
        accountBook.addBill(new IncomeBill(10000, "卖商品"));
        accountBook.addBill(new IncomeBill(111, "卖商品"));
        //添加支出
        accountBook.addBill(new ConsumeBill(1000, "工资"));

        AccountBookVisitor boss = new Boss();
        AccountBookVisitor cpa = new CPA();

        //两个访问者分别访问账本
        accountBook.show(cpa);
        accountBook.show(boss);
        ((Boss) boss).getTotalConsume();
        ((Boss) boss).getTotalIncome();

    }
}
