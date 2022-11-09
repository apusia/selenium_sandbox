package pl.komputronik.page;

import org.framework.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import pl.komputronik.component.CookiePopUp;
import pl.komputronik.component.SearchComponent;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class MainPage {
    public SearchComponent searchComponent = new SearchComponent();
    public CookiePopUp cookiePopUp = new CookiePopUp();

    private final By webPushCloseButton = By.cssSelector(".webpush-followup-close");

    public void closeWebPushButton (TestContext testContext){
        Wait<WebDriver> wait = testContext.getWait();

        wait.until(elementToBeClickable(webPushCloseButton)).click();
    }


}
