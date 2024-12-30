package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStepdefs {
    WebDriver driver;

    @Given("user open browser Chrome by URL")
    public void user_open_browser_chrome_by_url() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            // Navigate to Url
            driver.get("https://google.com");
        }

    @Then("the page is opened")
    public void the_page_is_opened() {

    }

    @Then("close browser")
    public void close_browser() {
           driver.quit();
    }
}
