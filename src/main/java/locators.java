import org.openqa.selenium.By;

public interface locators {

    public interface mainPage{
        By main_buy = By.xpath("//nav[@class='menu-maintree']//a[@href=\"/catalog/\"]");
        By seachButton = By.xpath("//div[@class='search']");

        By search = By.xpath("//div[@id='search']//input");

        By searchButton = By.xpath("//button[@name='s']");

        By buttonlk = By.xpath("//div[@class='controls flex flex-center-v']//a[@href='/sl/?login=yes&backurl=%2F']");
    }
    public interface BuyPage{
        By itembttn = By.xpath("//div[@class='control-detail']//a[@href='/catalog/dlya_filtra/peru_yonal/']");

        By addbasket = By.xpath("//div[@id='38938']//span[@class='text']");

        //By continueshopping = By.xpath("//div[@class='close-modal']");

        By basket = By.xpath("//a[@href='/bigbrotherwatchingyou/cart/']");

        By buttonFeedback = By.xpath("//div[@class='product-item-title--h4 product-item-title--h4-v2']//span");

        By description = By.xpath("//div[@class='product-item-storytelling opened']");

    }

    public interface itemPage{
        By aboutItem = By.xpath("//div[@class='infobox-desc ']//p");

    }

    public interface searchPage{
        By name = By.xpath("//div[@class='product-item-title']//a[@href='/catalog/arkhiv_kofe/peru_aroma_del_valle_iz_bochki/']//h4");

    }

    public interface auth{
        By buttonauth = By.xpath("//div[@class='form_fild']//button[@class='vzhozhu']");
        By num = By.xpath("//div[@class='form_fild']//input[@class='main']");
        By pas = By.xpath("//div[@class='form_fild']//input[@class='pass']");

        By wrong = By.xpath("//span[@class='message']");


    }

    public interface basket{
        By nameItem = By.xpath("//div[@class='bx-soa-item-title']//a");
    }
}
