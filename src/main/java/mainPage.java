import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainPage {
    private WebDriver browser;
    button main_buy;
    button seachButton;

    button searchButton;
    button buttonlk;

    public mainPage(WebDriver browser) {
        this.browser = browser;
        this.main_buy = new button(browser.findElement(locators.mainPage.main_buy));
        this.seachButton = new button(browser.findElement(locators.mainPage.seachButton));
        this.searchButton = new button(browser.findElement(locators.mainPage.searchButton));
        this.buttonlk = new button(browser.findElement(locators.mainPage.buttonlk));
    }
    public BuyPage clickButton(){
        main_buy.click();
        return new BuyPage(browser);
    }

    public void clickSearchButton(){
        seachButton.click();
    }

    public searchPage clickButtonS(){
        searchButton.click();
        return new searchPage(browser);
    }

    public authentication clickButtonauth(){
        buttonlk.click();
        return new authentication(browser);
    }

    //public String getDescriptionJavaEE() {
    //  WebElement textAboutJava = browser.findElement(locators.mainPage.about);
    //return textAboutJava.getText();
    //}
}
