package src.com.feng.design.behaviorpattern.CommondPattern;

/**
 * 命令模式
 * 命令模式是将请求以命令的形式包裹在对象中，并传递给对象，
 * 调用对象寻找到处理该命令的合适的对象，并将该命令传递给相应的对象，该对象执行。
 * 简单点说就是不同请求都封装成一个对象，不同的请求调用不同的执行者。
 */
public interface Command {
    void execute();
}
