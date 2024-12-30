package selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class SimpleTest {


    @Test
    public void openWeb() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "./src/test/resources/chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver webDriver = new ChromeDriver(options);
        WebDriverRunner.setWebDriver(webDriver);
        open("https://selenide.org/documentation.html");
        SelenideElement el = $("#bvncbvj");
        System.out.println(el.exists());
        closeWebDriver();

    }

}
