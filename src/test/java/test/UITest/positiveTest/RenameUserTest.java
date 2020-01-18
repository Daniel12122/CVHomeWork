package UITest.positiveTest;

import org.testng.annotations.Test;
import base.BaseTest;
import entity.User;
import factory.UserFactory;
import pages.EmployeeListPage;
import pages.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;

public class RenameUserTest extends BaseTest {

    private String login = "TestUser03";
    private String password = "Vfylhfujhf!1";

    @Test
    public void userRenameTest(){
        User user = new UserFactory().defaultUser();
        LoginPage loginPage = new LoginPage();
        loginPage
                .loginToTheSystem(login,password)
                .clickMyInfo()
                .createUser(user)
                .moveToEmployeeList();
        assertThat(new EmployeeListPage().filterEmployeeList(user))
                .as("User no created").isTrue();
    }
}
