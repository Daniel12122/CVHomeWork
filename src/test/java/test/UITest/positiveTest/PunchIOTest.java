package UITest.positiveTest;

import base.BaseTest;
import pages.LoginPage;
import pages.MyRecordsPage;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PunchIOTest extends BaseTest {

    @Test
    public void punchInOutTest(){
        LoginPage loginPage = new LoginPage();
        loginPage
                .loginToTheSystem("TestUser03","Vfylhfujhf!1")
                .clickPunchInOut()
                .punchIn()
                .punchOut()
                .clickMyRecords()
                .goToDateWithMonth("5","Dec");
        assertThat(new MyRecordsPage().filterTable()).isTrue();
    }

}
