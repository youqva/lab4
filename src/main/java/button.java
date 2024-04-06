import org.openqa.selenium.WebElement;

import java.awt.*;

public class button {

    WebElement button;
    public button(WebElement element) {
        button = element;
    }

    public void click(){
        button.click();
    }
}
