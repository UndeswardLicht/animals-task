package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class BaseTest {
    protected WebDriver driver = new ChromeDriver();
    protected WebDriverWait wait;
    String url = "https://demoqa.com/text-box";

    @BeforeMethod
    public void setup(){
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(url);
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
