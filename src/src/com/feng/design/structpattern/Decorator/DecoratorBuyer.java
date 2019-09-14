package src.com.feng.design.structpattern.Decorator;

import com.feng.design.structpattern.Proxy.Buyer;
import com.feng.design.structpattern.Proxy.People;

/*装饰器模式
和代理模式都是在真实对象的方法前面或者后面加上自定义的方法.
* 两者区别：
* 装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问
* 当使用代理模式的时候，我们常常在一个代理类中创建一个对象的实例。
* 当我们使用装饰器模式的时候，我们通常的做法是将原始对象作为一个参数传给装饰者的构造器。
* 一句话来总结这些差别：使用代理模式，代理和真实对象之间的的关系通常在编译时就已经确定了，而装饰者能够在运行时递归地被构造*/
public class DecoratorBuyer implements Buyer {
    private Buyer buyer;

    public DecoratorBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public void buyCar() {
        System.out.println("4s店帮你纳税，上保险");
        buyer.buyCar();
    }

    public static void main(String[] args){
        Buyer buyer=new DecoratorBuyer(new People());
        buyer.buyCar();
        Buyer buyer2=new DecoratorBuyer(new PeopleWithMyWife());
        buyer2.buyCar();
    }
}
