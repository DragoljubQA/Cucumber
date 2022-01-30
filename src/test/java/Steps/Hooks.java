package Steps;

import Base.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {
    TestContext testContext;

    public Hooks(TestContext testContext) {
        this.testContext = testContext;
    }

    @After("@UI")
    public void tearDown(Scenario scenario) {
        testContext.driver.quit();
    }
}
