import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class itemPage {

    private WebDriver broser;

    public itemPage(WebDriver broser){
        this.broser = broser;
    }

    public  itemPage(){

    }

    public String getName() {
        WebElement textAboutItem = broser.findElement(locators.itemPage.aboutItem);
        return textAboutItem.getText();
    }
}
