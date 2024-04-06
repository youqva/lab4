import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class basket {

    private WebDriver browser;


    public basket(WebDriver browser) {
        this.browser = browser;
    }

    public String getName() {
        WebElement textAboutItem = browser.findElement(locators.basket.nameItem);
        return textAboutItem.getText();
    }
}