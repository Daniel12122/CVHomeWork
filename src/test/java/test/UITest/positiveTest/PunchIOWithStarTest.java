package UITest.positiveTest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import pages.MyRecordsPage;

import static org.assertj.core.api.Assertions.assertThat;

public class PunchIOWithStarTest extends BaseTest {

    @Test
    public void punchInOutTestWithStar(){
        MyRecordsPage myRecordsPage = new LoginPage()
                .loginToTheSystem("TestUser03","Vfylhfujhf!1")
                .clickMyRecords()
                .goToDateWithMonth("20","Nov");
        assertThat(myRecordsPage.getMessagesNoAttendance()).isTrue();
               myRecordsPage.goToDateWithMonth("4","Dec");
        assertThat(myRecordsPage.getMessagesNoAttendance()).isTrue();

    }
}
