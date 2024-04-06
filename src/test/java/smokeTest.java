import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Locale;

public class smokeTest {

    private WebDriver browser;


    @Before
    public void precondition() {
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://theweldercatherine.ru/");
    }

    @Test
    public void checkDescriptionItem(){
        mainPage mainPage = new mainPage(browser);
        BuyPage buyPage = mainPage.clickButton();
        itemPage itemPage = buyPage.clickButtonitem();
        String description = itemPage.getName();
        Assert.assertEquals(description,"Сочный кофе с комплексной кислотностью и яркими нотами цитрусов и красных ягод!");

    }

    @Test
    public void checkMainLotPage() throws InterruptedException {
//Locale.setDefault(new Locale("ru", "RU"));

        mainPage mainPage = new mainPage(browser);
        mainPage.clickSearchButton();
        Thread.sleep(5000);
        String searhString = "Aroma del Valle";
        WebElement search = browser.findElement(locators.mainPage.search);
        search.sendKeys(searhString);
        searchPage searchPage = mainPage.clickButtonS();
        String name = searchPage.getName();
        Assert.assertEquals(name,"Перу Aroma del Valle\nиз бочки");
    }

    @Test
    public void authentication() throws InterruptedException {
        mainPage mainPage = new mainPage(browser);
        authentication authentication = mainPage.clickButtonauth();
        Thread.sleep(5000);
        String number = "2222222222";
        String password = "32232323";
        WebElement num = browser.findElement(locators.auth.num);
        WebElement pas = browser.findElement(locators.auth.pas);
        num.sendKeys(number);
        pas.sendKeys(password);
        Thread.sleep(5000);
        lk lk = authentication.clickButtolk();
        Thread.sleep(5000);
        String name = authentication.getName();
        Assert.assertEquals(name,"Неверный пароль");
    }

    @Test
    public void basket() throws InterruptedException {
        mainPage mainPage = new mainPage(browser);
        BuyPage buyPage = mainPage.clickButton();
        buyPage.clickButtonaddbasket();
        Thread.sleep(5000);
        basket basket = buyPage.clickButtonbasket();
        //Thread.sleep(5000);
        //buyPage.clickButtoncontshop();
        //Thread.sleep(10000);
        //basket basket = buyPage.clickButtonbasket();
        String name = basket.getName();
        Assert.assertEquals(name, "Перу Йонал");

    }

    @Test
    public void feedback(){
        mainPage mainPage = new mainPage(browser);
        BuyPage buyPage = mainPage.clickButton();
        buyPage.clickButtonfeedback();
        String name = buyPage.getDescriptionItem();
        Assert.assertEquals(name, "Если бы в Перу рождались скандинавские боги, одного из них, наверное, звали бы Йонал :)");
    }
}

