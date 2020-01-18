package UITest.positiveTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import entity.Candidate;
import entity.Location;
import entity.User;
import entity.Vacancy;
import factory.CandidateFactory;
import factory.LocationFactory;
import factory.UserFactory;
import factory.VacancyFactory;
import json.JsonConvert;

import static org.assertj.core.api.Assertions.assertThat;

public class JsonTest {

    @Test
    public void TestJson() {
        JsonConvert jsonConvert = new JsonConvert();

        Candidate candidate = new CandidateFactory().defaultCandidate();
        String candidateJson = jsonConvert.objectToJson(candidate);

        Location location = new LocationFactory().defaultLocation();
        String locationJson = jsonConvert.objectToJson(location);

        Vacancy vacancy = new VacancyFactory().defaultVacancy();
        String vacancyJson = jsonConvert.objectToJson(vacancy);

        User user = new UserFactory().defaultUser();
        String userJson = jsonConvert.objectToJson(user);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(candidate, jsonConvert.getCandidateFrom(candidateJson),
                "Compared candidates have different parameters");
        softAssert.assertEquals(vacancy, jsonConvert.getVacancyFrom(vacancyJson),
                "Compared candidates have different parameters");
        softAssert.assertEquals(user, jsonConvert.getUserFrom(userJson),
                "Compared candidates have different parameters");
        softAssert.assertEquals(location, jsonConvert.getLocationFrom(locationJson),
                "Compared candidates have different parameters");
        softAssert.assertAll();
    }
}
