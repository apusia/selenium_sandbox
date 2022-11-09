package pl.komputronik.component;

import org.framework.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class CookiePopUp {
    private final By acceptCookieButton = By.cssSelector("#onetrust-accept-btn-handler");


    public void acceptCookieButton(TestContext testContext) {
        Wait<WebDriver> wait = testContext.getWait();

        wait.until(elementToBeClickable(acceptCookieButton)).click();
    }


}
