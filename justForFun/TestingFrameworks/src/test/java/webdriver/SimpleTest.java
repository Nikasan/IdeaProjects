package webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SimpleTest {

    public static void main(String[] args) {

        //classic way to set up driver
        /*
        setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        */

        //set up driver using bonigarcia/webdrivermanager
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();

        //https://chromedriver.chromium.org/mobile-emulation - mobile simulation
       /* Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Nexus 5");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        WebDriver driver = new ChromeDriver(chromeOptions);*/

        //custom mobile simulation
        /*Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", 360);
        deviceMetrics.put("height", 640);
        deviceMetrics.put("pixelRatio", 3.0);
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        mobileEmulation.put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.61 Safari/537.36");
        ChromeOptions chromeOptions = new ChromeOptions(); chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        WebDriver driver = new ChromeDriver(chromeOptions);*/

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.browserstack.com/guide/selenium-with-java-for-automated-test");
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.xpath("//span[@id='category-header-name']")).getText());
        System.out.println(new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));

        //Explicit wait:
        WebElement foo = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".page-header-2")));

        System.out.println(foo.getText());

       //Fluent wait
       /* Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
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
        }*/
}
}
