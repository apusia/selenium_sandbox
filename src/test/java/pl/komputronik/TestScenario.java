package pl.komputronik;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario {

    @Test
    public void somethingTest() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

//        driver.manage().window().fullscreen();

        driver.navigate().to("https://wentylatory.istore.pl/");
        driver.findElement(By.cssSelector(".js__accept-all-consents")).click();

//        driver.close();
    }

}
