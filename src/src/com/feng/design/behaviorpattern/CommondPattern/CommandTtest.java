package src.com.feng.design.behaviorpattern.CommondPattern;

public class CommandTtest {
    public static void main(String[] args) {
        String type = args[0];
        Command command = null;
        switch (type) {
            case "on":
                command = new FlipUpCommand(new Light());
                break;

            case "off":
                command = new FlipDownCommand(new Light());
                break;
        }
        command.execute();
    }
}
