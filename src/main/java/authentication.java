import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class authentication {

    private WebDriver browser;
    button buttonauth;

    public authentication(WebDriver browser){
        this.browser = browser;
        this.buttonauth = new button(browser.findElement(locators.auth.buttonauth));
    }

    public lk clickButtolk() {
        buttonauth.click();
        return new lk(browser);
    }

    public String getName() {
        WebElement textAboutItem = browser.findElement(locators.auth.wrong);
        return textAboutItem.getText();
    }
}

