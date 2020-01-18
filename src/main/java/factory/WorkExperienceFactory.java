package factory;

import com.github.javafaker.Faker;
import entity.WorkExperience;


public class WorkExperienceFactory {

    private static Faker faker = new Faker();

    public WorkExperience WorkExperienceDefault() {
        return WorkExperience.builder()
                .employeeId(654)
                .company("Open Teck")
                .title("My first work experience")
                .build();
    }
}
