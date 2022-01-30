package Steps;

import Base.TestContext;
import Pages.LoginPage;
import Pages.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginSteps {

    TestContext testContext;
    LoginPage loginPage;
    ProfilePage profilePage;

    public LoginSteps(TestContext tc) {
        this.testContext = tc;
        loginPage = new LoginPage(tc.driver, tc.wdwait);
        profilePage = new ProfilePage(tc.driver, tc.wdwait);
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        testContext.driver.navigate().to("https://demoqa.com/login");
    }

    @When("user inputs valid username {string}")
    public void user_inputs_valid_username(String username) {
        loginPage.inputUsername(username);
    }

    @And("user inputs valid password {string}")
    public void user_inputs_valid_password(String password) {
        loginPage.inputPassword(password);
    }

    @And("user clicks on Login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("user is redirected to profile")
    public void user_is_redirected_to_profile() {
        testContext.wdwait.until(ExpectedConditions.urlToBe("https://demoqa.com/profile"));
        Assert.assertEquals(testContext.driver.getCurrentUrl(), "https://demoqa.com/profile");
    }

    @And("user inputs incorrect password {string}")
    public void user_inputs_incorrect_password(String pass) {
        loginPage.inputPassword(pass);
    }

    @When("user inputs incorrect username {string}")
    public void user_inputs_incorrect_username(String user) {
        loginPage.inputUsername(user);
    }

    @Then("user did not log in")
    public void user_did_not_log_in() {
        testContext.wdwait.until(ExpectedConditions.visibilityOf(loginPage.notification));
        Assert.assertTrue(loginPage.notification.isDisplayed());
        Assert.assertEquals(loginPage.getNotificationText(), "Invalid username or password!");
        Assert.assertNotEquals(testContext.driver.getCurrentUrl(), "https://demoqa.com/profile");
    }

    @And("profile page is not present")
    public void profile_is_not_present() {
        Assert.assertFalse(profilePage.isElementDisplayed(profilePage.username));
    }

}
