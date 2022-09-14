package SpringStart.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainPage {

    @Autowired
    public MainPage() {
        System.out.println("Main page");
    }

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private HomePage homePage;

//    public MainPage(LoginPage loginPage, HomePage homePage) { // Dependency injection
//        this.loginPage = loginPage;
//        this.homePage = homePage;
//    }

    public void PerformLogin() {
        homePage.clickLogin();
        loginPage.Login("admin", "password");
        loginPage.clickLogin();

    }
}
