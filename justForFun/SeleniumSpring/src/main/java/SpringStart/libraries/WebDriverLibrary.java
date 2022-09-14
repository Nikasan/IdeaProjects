package SpringStart.libraries;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class WebDriverLibrary {



//    @Bean
//    @ConditionalOnProperty(name = "browser", havingValue = "Chrome")
//    public WebDriver getChromeDriver() {
//        WebDriverManager.chromedriver().setup();
//        return new ChromeDriver();
//    }
//
//    @Bean
//    @ConditionalOnProperty(name = "browser", havingValue = "Edge")
//    public WebDriver getEdgeChromeDriver() {
//        WebDriverManager.edgedriver().setup();
//        return new EdgeDriver();
//    }
}
