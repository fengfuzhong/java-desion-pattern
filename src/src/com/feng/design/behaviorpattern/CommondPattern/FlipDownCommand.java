package src.com.feng.design.behaviorpattern.CommondPattern;


public class FlipDownCommand  implements Command {
    private Light theLight;

    public FlipDownCommand(Light light) {
        this.theLight = light;
    }

    public void execute() {
        theLight.turnOff();
    }
}
