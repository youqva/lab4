import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchPage {

    private WebDriver broser;

    public searchPage(WebDriver broser){
        this.broser = broser;
    }

    public String getName() {
        WebElement textAboutItem = broser.findElement(locators.searchPage.name);
        return textAboutItem.getText();
    }
}
