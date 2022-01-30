package Steps;

import Base.TestContext;
import Pages.HomepagePage;
import Pages.SidebarPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomepageSteps {

    HomepagePage homepagePage;
    SidebarPage sidebarPage;
    TestContext testContext;

    public HomepageSteps(TestContext tc) {
        this.testContext = tc;
        homepagePage = new HomepagePage(tc.driver, tc.wdwait);
        sidebarPage = new SidebarPage(tc.driver, tc.wdwait);
    }

    @Given("user is on homepage")
    public void user_is_on_homepage() {
        testContext.driver.navigate().to("https://demoqa.com/");
    }

    @When("user clicks on Elements button")
    public void user_clicks_on_Elements_button() {
        homepagePage.clickOnCards(0);
    }

    @Then("sidebar is displayed")
    public void sidebar_is_displayed() {
        Assert.assertTrue(sidebarPage.sidebar.isDisplayed());
    }

}
