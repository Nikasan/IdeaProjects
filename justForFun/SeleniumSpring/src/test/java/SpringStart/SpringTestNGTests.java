package SpringStart;

import SpringStart.pages.HomePage;
import SpringStart.pages.LoginPage;
import SpringStart.pages.MainPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

@SpringBootTest
public class SpringTestNGTests {

    @Autowired
    private MainPage mainPage;

    @Autowired
    private HomePage homePage;

    @Autowired
    private ApplicationContext context;

    @Test
    public void contextLoads(){
        MainPage bean = context.getBean(MainPage.class);
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringStartApplication.class);
//        System.out.println("Hello!");
//        MainPage mainPage = context.getBean(MainPage.class);
        homePage.ClickEmployeeList();
//        mainPage.PerformLogin();

//        HomePage homePage = new HomePage();
//        LoginPage loginPage = new LoginPage();
//        LoginPage loginPage = homePage.clickLogin();
//        loginPage.clickLogin();

//        MainPage mainPage = new MainPage(loginPage,homePage);
    }

}
