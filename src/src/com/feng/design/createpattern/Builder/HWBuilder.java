package src.com.feng.design.createpattern.Builder;

/*将一个复杂对象分布创建。如果一个超大的类的属性特别多，
我们可以把属性分门别类，不同属性组成一个稍微小一点的类，
再把好几个稍微小点的类窜起来。
比方说一个电脑，可以分成不同的稍微小点的部分CPU、主板、显示器。CPU、主板、
显示器分别有更多的组件，不再细分。*/
public class HWBuilder extends Builder {
    private Computer computer = new Computer();

    @Override
    public void setCpu() {
        computer.setCpu(new InterCpu());
    }

    public void setMainBoard() {
        computer.setMainBoard(new InterMainBoard());
    }

    public void setDisplay() {
        computer.setDisplay(new InterDisplay());
    }

    public Computer createComputer() {
        return computer;
    }
}
