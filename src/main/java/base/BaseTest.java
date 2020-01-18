package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import manager.DriverManager;
import pages.LoginPage;

public class BaseTest {

    public WebDriver driver = DriverManager.getInstance().getDriver();

    @BeforeTest
    public LoginPage openLoginPage() {
        driver.get("http://test.biz.ua/");
        return new LoginPage();
    }

    @AfterTest
    public void  close(){
       try {if (driver!= null){
           driver.quit();
       }
       }finally {
           driver = null;
       }
    }
}
