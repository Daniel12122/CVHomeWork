package UITest.positiveTest;

import org.testng.annotations.Test;
import base.BaseTest;
import entity.Location;
import factory.LocationFactory;
import pages.LocationPage;
import pages.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;

public class LocationTest extends BaseTest {
    private String login = "TestUser03";
    private String password = "Vfylhfujhf!1";

    @Test
    public void locationAddTest(){
        Location location = new LocationFactory().defaultLocation();
        LoginPage loginPage = new LoginPage();
        loginPage
                .loginToTheSystem(login,password)
                .moveToLocation()
                .createLocation(location)
                .moveToLocation();
        assertThat(new LocationPage().filterTable(location)).isTrue();
    }
}
