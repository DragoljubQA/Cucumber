package Steps;

import Base.TestContext;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class URLSteps {

    TestContext testContext;

    public URLSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @And("Elements URL is present")
    public void elements_URL_is_present() {
        Assert.assertEquals(testContext.driver.getCurrentUrl(), "https://demoqa.com/elements");
    }
}
