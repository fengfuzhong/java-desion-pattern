package src.com.feng.design.structpattern.Adapter;


/*适配器，顾名思义，是让两个不兼容的东西可以一起工作。例如插座的电源是220V，
手机直接给他220V 50HZ的交流电我相信一般都会直接炸了（除了诺基亚...）
手机充电器就进行了适配，将电压变小，交流电变成直流电。
除了这种需要改变属性的操作（比较好说，不举例子了），适配器还用于在接口继承方面。
假设一个顶级接口有一大堆方法需要实现类实现，我新写了个类只是想选择的实现一两个接口，
那其他的方法我是不是都需要实现一下，即使是空实现（单纯实现，不进行任何逻辑操作），
这是我们就需要一个适配器类，空实现那些方法，我的新类只需要继承这个适配器类就好了，
要是想实现某个方法，只需要重写掉配置类中对应的方法就好。这种模式基本都会用到，
毕竟谁的代码还没个顶级接口啊。*/
public class OnlyImplentsOne extends Adapter {
    @Override
    public void setOne(){
        System.out.println("实现了顶级接口一个方法");
    }
}
