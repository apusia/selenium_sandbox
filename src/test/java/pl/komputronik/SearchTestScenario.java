package pl.komputronik;

import org.framework.TestContext;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import pl.komputronik.page.MainPage;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class SearchTestScenario {

    @Test
    void somethingTest1() {
        TestContext testContext = new TestContext();

        MainPage mainPage = new MainPage();
        mainPage.cookiePopUp.acceptCookieButton(testContext);
        mainPage.closeWebPushButton(testContext);

        mainPage.searchComponent.search(testContext, "laptop");

        testContext.teardown();
    }

    @Test
    void somethingTest2() {
        TestContext testContext = new TestContext();


        testContext.teardown();
    }

}
