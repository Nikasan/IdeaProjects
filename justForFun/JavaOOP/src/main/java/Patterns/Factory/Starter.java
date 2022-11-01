package Patterns.Factory;

/**
 * Created by Nikasan
 */
public class Starter {

    public static void main(String[] args) {
        BrowserStarter starter = new BrowserStarter();
        starter.start(Browsers.CHROME);
    }
}
