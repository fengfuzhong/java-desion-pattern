package src.com.feng.design.behaviorpattern.CommondPattern;

public class FlipUpCommand implements Command {
    private Light theLight;

    public FlipUpCommand(Light light) {
        this.theLight = light;
    }

    public void execute(){
        theLight.turnOn();
    }
}
