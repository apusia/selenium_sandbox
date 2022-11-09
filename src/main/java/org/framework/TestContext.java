package org.framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class TestContext {

    private WebDriver driver;
    private Wait<WebDriver> wait;

    public TestContext() {
        setup();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public Wait<WebDriver> getWait(){
        return wait;
    }

    private void setup(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        driver.get("https://www.komputronik.pl/");
    }

    public void teardown(){
        driver.quit();
    }

}
