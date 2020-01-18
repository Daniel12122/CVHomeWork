package APITest;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseAPITest;
import entity.WorkExperience;
import factory.WorkExperienceFactory;

public class CreateEmployeeTest extends BaseAPITest {

    private WorkExperience workExperience = new WorkExperienceFactory().WorkExperienceDefault();

    @Test
    public void verifyCreateEmployeeWorkExperience() {
        Assert.assertEquals(createEmployeeWorkExperience(workExperience).getStatusCode(), 200);
    }
}
