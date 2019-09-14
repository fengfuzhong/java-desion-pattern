package src.com.feng.design.behaviorpattern.Chain;

/*责任链模式
责任链模式是一种对象的行为模式.在责任链模式里面,
很多对象由每一个对象对其下家的引用而连接起来形成一条链.请求在这个链上进行传递,
直到这个链上的某一个对象来处理请求,发送这个请求的客户端并不知道哪一个对象最终来处理这个请求.
这使得系统可以在不影响客户端的情况下来动态的重新组织和分配责任
 */
public abstract class AbstractAction implements Action{

    public Action action;
    @Override
    public void todo(String type) {

        System.out.println("我是总部,你们处理不了就给我处理!!");
    }

    public Action getAction() {
        return action;
    }
    public void setAction(Action action) {
        this.action = action;
    }
}