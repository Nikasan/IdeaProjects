package Cucumber;

import io.cucumber.messages.types.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    WebDriver driver = null;

    @Before
    public void beforeSetup(Scenario scenario) {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void after(Scenario scenario) {
        driver.quit();
    }

}
