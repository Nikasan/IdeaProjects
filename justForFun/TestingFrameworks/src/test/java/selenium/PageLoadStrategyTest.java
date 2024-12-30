package selenium;

import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Created by Nikasan
 */
public class PageLoadStrategyTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "TestingFrameworks/src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(chromeOptions);
        WebDriverRunner.setWebDriver(driver);
        try {
            // Navigate to Url
            driver.get("https://google.com");
            // Initialize and wait till element(link) became clickable - timeout in 10 seconds
            WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
//                    .until(driver -> driver.findElement(By.name("q")));
        } finally {
            driver.quit();
        }
    }

}
