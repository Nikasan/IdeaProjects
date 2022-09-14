package SpringStart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomePage{
    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    public LoginPage clickLogin()
    {
//        lnkLogin.click();
        System.out.println("Click the home page login");
        return new LoginPage();
    }

    public void ClickEmployeeList() {
        System.out.println("ClickEmployeeList");
//        lnkEmployeeList.click();
    }

    @Autowired
    public HomePage() {
        System.out.println("I am Home page");
    }
}
