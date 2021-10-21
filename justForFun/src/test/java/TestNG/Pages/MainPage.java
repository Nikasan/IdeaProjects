package TestNG.Pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Data
public class MainPage {
    @FindBy(css = ".page-header-2 h1")
    private WebElement title;

    @FindBy(css = " #menu-guide-category [id*='menu-item']")
    private List<WebElement> menuItems;
}
