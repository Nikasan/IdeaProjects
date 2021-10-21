import Pages.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestWithTestNGFeatures {

    private WebDriver driver;
    private MainPage mainPage;

    @BeforeMethod
    public void beforeMethod() {
        //set up driver using bonigarcia/webdrivermanager
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.browserstack.com/guide/selenium-with-java-for-automated-test");
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }

    @Test
    public void test() {
        Assert.assertEquals(mainPage.getTitle().getText(), "Selenium with Java", "Title of the website do not match");
    }

    @Test
    public void test1() {
        Assert.assertEquals(mainPage.getMenuItems().size(), 6, "Number of menu items not 6");
    }

    @Test
    public void itemsContainsDebugging() {
        boolean debugging = mainPage.getMenuItems().stream().anyMatch(i -> i.getText().equals("Debugging"));
        Assert.assertTrue(debugging);
    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
    }
}
