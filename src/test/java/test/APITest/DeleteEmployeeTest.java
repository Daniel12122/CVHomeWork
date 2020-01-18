package APITest;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseAPITest;
import entity.WorkExperience;
import factory.WorkExperienceFactory;

public class DeleteEmployeeTest extends BaseAPITest {

    private WorkExperience workExperience = new WorkExperienceFactory().WorkExperienceDefault();

    @Test
    public void verifyDeleteEmployeeWorkExperience() {
        Assert.assertEquals(deleteEmployeeWorkExperience(workExperience).getStatusCode(), 200);
    }

}
