package pl.komputronik.component;

import org.framework.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.Wait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class SearchComponent {
    private final By searchComponent = By.cssSelector(".events-main-search");
    private final By inputText = new ByChained( searchComponent, By.cssSelector(" input[type='text']") );
    private final By searchButton = new ByChained( searchComponent, By.cssSelector(".events-main-search button.at-button-search") );

    public void search(TestContext testContext, String text) {
        Wait<WebDriver> wait = testContext.getWait();

        wait.until(elementToBeClickable(inputText)).sendKeys(text);
        wait.until(elementToBeClickable(searchButton)).click();
    }
}
