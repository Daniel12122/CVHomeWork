package APITest;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseAPITest;
import entity.WorkExperience;
import factory.WorkExperienceFactory;

public class UpdateEmployeeTest extends BaseAPITest {

    private WorkExperience workExperience = new WorkExperienceFactory().WorkExperienceDefault();

    @Test
    public void verifyUpdateEmployeeWorkExperience() {
        workExperience.setTitle("My best experience");
        Assert.assertEquals(updateEmployeeWorkExperience(workExperience).getStatusCode(), 200);
    }

}
