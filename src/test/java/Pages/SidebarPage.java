package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SidebarPage extends BasePage {

    public SidebarPage(WebDriver driver, WebDriverWait wdwait) {
        super(driver,wdwait);
        PageFactory.initElements(driver,this);
    }

    public @FindBy ( className = "header-wrapper")
    WebElement sidebar;

    public @FindBy (className = "element-group")
    List<WebElement> cards;

    //---------------------------------------

    public void clickOnElements() {
        cards.get(0).click();
    }

    public void clickOnForms() {
        cards.get(1).click();
    }

    public void clickOnAlerts() {
        cards.get(2).click();
    }

    public void clickOnWidgets() {
        cards.get(3).click();
    }

    public void clickOnInteractions() {
        cards.get(4).click();
    }

    public void clickOnBookStore() {
        cards.get(5).click();
    }

}
