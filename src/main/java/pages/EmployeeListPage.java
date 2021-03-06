package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.BasePage;
import entity.User;

import java.util.List;

public class EmployeeListPage extends BasePage {

    @FindBy (xpath = "//table[@id='resultTable']//tbody")
    private List<WebElement> table;

    @Step
    public boolean filterEmployeeList(User user){
        boolean employee = table.stream()
                .map(WebElement::getText)
                .anyMatch(e->e.contains(user.getFirstName())
                        &e.contains(user.getMiddleName())
                        &e.contains(user.getLastName())
                        &e.contains(user.getId()));
        return employee;
    }
}
