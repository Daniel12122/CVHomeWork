package UITest.positiveTest;

import org.testng.annotations.Test;
import base.BaseTest;
import entity.Vacancy;
import factory.VacancyFactory;
import pages.LoginPage;
import pages.VacanciesPage;

import static org.assertj.core.api.Assertions.assertThat;

public class AddVacanciesTest extends BaseTest {

    private String login = "TestUser03";
    private String password = "Vfylhfujhf!1";

    @Test
    public void vacanciesAddTest() {
        Vacancy vacancy = new VacancyFactory().defaultVacancy();
        LoginPage loginPage = new LoginPage();
        loginPage
                .loginToTheSystem(login, password)
                .moveToVacancies()
                .createVacancy(vacancy)
                .moveToVacancies();
        assertThat(new VacanciesPage().filterVacancies(vacancy))
                .as("No created vacancy").isTrue();
    }
}
