package src.com.feng.design.behaviorpattern.TemplateMethod;


/*模板方式模式
一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以按需要重写方法实现，
但调用将以抽象类中定义的方式进行。
SpringBoot为用户封装了很多继承代码，都用到了模板方式，例如那一堆XXXtemplate。
 */
public abstract class DBTemplate {

    abstract void open();

    abstract void select();

    abstract void close();

    public final void selectTemplate() {
        this.close();
        this.select();
        this.open();
    }

}
