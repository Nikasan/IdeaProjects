package webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static java.lang.System.setProperty;

public class SimpleTest {
    public static void main(String[] args) {
        setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.browserstack.com/guide/selenium-with-java-for-automated-test");
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.xpath("//span[@id='category-header-name']")).getText());
        System.out.println(new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));

        //Explicit wait:
//        WebElement foo = new WebDriverWait(driver, 15000)
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@id='category-header']")));


        //Fluent wait
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(3))
                .withMessage("Message from Fluent wait")
                .ignoreAll(List.of(Exception.class, NoSuchElementException.class, WebDriverException.class));

        try {
            WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(By.xpath("//span[@id='category-header']"));
                }
            });
            System.out.println(foo.getText());
//            System.out.println(driver.findElement(By.xpath("//span[@id='category-header']")).getText());
        } catch (NoSuchElementException e) {
            e.getSupportUrl();
        } finally {
            System.out.println(new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));
            driver.quit();
        }
    }
}
