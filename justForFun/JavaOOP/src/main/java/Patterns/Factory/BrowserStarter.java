package Patterns.Factory;

/**
 * Created by Nikasan
 */
public class BrowserStarter {
    DriverFactory factory = new DriverFactory();

    public void start(Browsers br) {
        switch (br) {
            case EDGE -> factory.startEdge();
            default -> factory.startChrome();
        }
    }
}
