package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasePage {

    public ProfilePage(WebDriver driver, WebDriverWait wdwait) {
        super(driver, wdwait);
        PageFactory.initElements(driver, this);
    }

    public @FindBy (id = "userName-value")
    WebElement username;

    //-----------------------------------------------



}
