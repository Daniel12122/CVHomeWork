package APITest;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseAPITest;

public class GetEmployeeTest extends BaseAPITest {

    @Test
    public void verifyGetEmployeeWorkExperiences() {
        Assert.assertEquals(getEmployeeWorkExperiences().getStatusCode(), 200);
    }
}
