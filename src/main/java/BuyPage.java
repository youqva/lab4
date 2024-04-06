import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyPage {

    private WebDriver browser;
    button itemPage;
    button addbasket;

    button continueshopping;

    button basket;
    button buttonFeedback;

    public BuyPage(WebDriver browser){
        this.browser = browser;
        this.itemPage = new button(browser.findElement(locators.BuyPage.itembttn));
        this.addbasket = new button(browser.findElement(locators.BuyPage.addbasket));
        //this.continueshopping = new button(browser.findElement(locators.BuyPage.continueshopping));
        //this.basket = new button(browser.findElement(locators.BuyPage.basket));
        //this.buttonFeedback = new button(browser.findElement(locators.BuyPage.buttonFeedback));
    }

    public itemPage clickButtonitem(){
        itemPage.click();
        return new itemPage(browser);

    }

    public void clickButtonaddbasket(){
        addbasket.click();
    }
    /*public void clickButtoncontshop(){
        this.continueshopping = new button(browser.findElement(locators.BuyPage.continueshopping));
        continueshopping.click();
    }*/

    public basket clickButtonbasket(){
        this.basket = new button(browser.findElement(locators.BuyPage.basket));
        basket.click();
        return new basket(browser);

    }

    public basket clickButtonfeedback(){
        this.buttonFeedback = new button(browser.findElement(locators.BuyPage.buttonFeedback));
        buttonFeedback.click();
        return new basket(browser);

    }

    public String getDescriptionItem() {
      WebElement textAboutJava = browser.findElement(locators.BuyPage.description);
    return textAboutJava.getText();
    }
}
