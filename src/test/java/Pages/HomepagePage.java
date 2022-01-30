package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomepagePage extends BasePage {

    public HomepagePage(WebDriver driver, WebDriverWait wdwait) {
        super(driver,wdwait);
        PageFactory.initElements(driver,this);
    }

    @FindBy ( css = ".card.mt-4.top-card")
    List<WebElement> cards;

    //--------------------------------------------

    public void clickOnCards(int i) {
        scrollIntoView(cards.get(i));
        cards.get(i).click();
    }

}
