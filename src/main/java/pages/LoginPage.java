package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.BasePage;
import manager.DriverManager;

public class LoginPage extends BasePage {

    private static   WebDriver driver = DriverManager.getInstance().getDriver() ;

    @FindBy(id = "txtUsername")
    private WebElement userNameInput;

    @FindBy(id = "txtPassword")
    private WebElement passwordInput;

    @FindBy(id = "btnLogin")
    private WebElement loginButton;

    @Step
    public MainPage loginToTheSystem(String name,String password) {
        userNameInput.sendKeys(name);
        passwordInput.sendKeys(password);
        loginButton.click();
        return new MainPage();
    }


}