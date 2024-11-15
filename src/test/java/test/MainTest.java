package test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class MainTest extends BaseTest {
    By inputNameField = By.id("userName");
    By inputEmailField = By.id("userEmail");
    By submitButton = By.id("submit");
    By checkAppearedName = By.id("name");
    By checkAppearedEmail = By.id("email");

    @Test (dataProvider = "data-provider")
    public void mainTest(String name, String email){

        driver.findElement(inputNameField).sendKeys(name);
        driver.findElement(inputEmailField).sendKeys(email);


        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,550)");

        driver.findElement(submitButton).click();
        Assert.assertTrue(
                driver.findElement(checkAppearedName).getText().contains(name) &&
                        driver.findElement(checkAppearedEmail).getText().contains(email));
    }

    @DataProvider (name = "data-provider")
    public static Object[][] fullNameAndEmailProvider(){
        return new Object[][]{{"John Constantine", "constantine@email.com"}};
    }




}
