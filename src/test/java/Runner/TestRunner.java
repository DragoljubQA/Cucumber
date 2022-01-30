package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {
                //"src/test/resources/Login-features"
                //,"src/test/resources/Navigation-features"
                "src/test/resources"
        }
        ,glue = {
        //"src/test/java/Steps"
        "Steps"
}
        ,plugin = {
        "pretty"
        ,"html:target/cucumber-reports.html"
        ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
)

// klasa ispod sluzi za pustanje paralelnih testova
public class TestRunner extends AbstractTestNGCucumberTests {
//        @Override
//        @DataProvider(parallel = true)
//        public Object[][] scenarios() {
//                return super.scenarios();
//        }
}