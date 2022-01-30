package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver, WebDriverWait wdwait) {
        super(driver,wdwait);
        PageFactory.initElements(driver,this);
    }

    public @FindBy ( id = "userName")
    WebElement username;

    public @FindBy ( id = "password")
    WebElement password;

    public @FindBy ( id = "login")
    WebElement loginButton;

    public @FindBy ( id = "name")
    WebElement notification;

    //--------------------------------------------

    public void inputUsername(String name) {
        username.clear();
        username.sendKeys(name);
    }

    public void inputPassword(String pass) {
        password.clear();
        password.sendKeys(pass);
    }

    public void clickLogin() {
        scrollIntoView(loginButton);
        loginButton.click();
    }

    public String getNotificationText() {
        return notification.getText();
    }

}
