package src.com.feng.design.structpattern.Proxy;

/*代理模式
就是，一个对象辅助另一个对象去做某件事，同时还可以增加一点辅助功能。
例如，你买车，的确是你花钱把车买到了，但是你不可能直接去和厂家谈吧，
你应该通过4S店购买，同时4S店帮助你入保险扣税等操作，最终你才得到了你想要的车。*/
public class ProxyBuyer implements Buyer {
    private People people;

    public ProxyBuyer()
    {
        //关系在编译时确定
        this.people=new People();
    }
    @Override
    public void buyCar(){
        System.out.println("4s店帮你纳税，上保险");
        people.buyCar();
    }

    public static void main(String[] args){
        Buyer buyer=new ProxyBuyer();
        buyer.buyCar();
    }
}
