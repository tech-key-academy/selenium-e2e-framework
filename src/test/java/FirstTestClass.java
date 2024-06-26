import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

 public class FirstTestClass {
     String LANDING_PAGE_URL = "https://magento.softwaretestingboard.com/";
     String CREATE_AN_ACCOUNT = "//a[text()='Create an Account']";
     String CREATE_AN_ACCOUNT_SUBMIT_BUTTON = "//button[@class='action submit primary']"

    @Test
    void verifyHomePageLanding()
    {
        WebDriver driver = new ChromeDriver();
        driver.get(LANDING_PAGE_URL);

        String title = driver.getTitle();

        Assert.assertEquals(title,"Home Page");
        driver.close();
    }
     @Test
     void verifyBlankFieldValidation()
     {
        WebDriver driver = new ChromeDriver();
        driver.get(LANDING_PAGE_URL);
        WebElement createAnAccount = driver.findElement(By.xpath(CREATE_AN_ACCOUNT));
        createAnAccount.click();
        WebElement createAnAccountButton = driver.findElement(By.xpath(CREATE_AN_ACCOUNT_SUBMIT_BUTTON));
        createAnAccountButton.click();
        WebElement firstNameValidationMessage = driver.findElement(By.xpath("//div[@for='firstname']"));
        Assert.assertTrue(firstNameValidationMessage.isDisplayed());
        WebElement lastNameValidationMessage = driver.findElement(By.xpath("//div[@for='lastname']"));
        Assert.assertTrue(lastNameValidationMessage.isDisplayed());
        WebElement emailFieldValidationMessage = driver.findElement(By.xpath("//div[@for='email_address']"));
        Assert.assertTrue(emailFieldValidationMessage.isDisplayed());
        WebElement passwordFieldValidationMessage = driver.findElement(By.xpath("//div[@for='password']"));
        Assert.assertTrue(passwordFieldValidationMessage.isDisplayed());
        WebElement confirmPasswordFieldMessage = driver.findElement(By.xpath("//div[@for='password-confirmation']"));
        Assert.assertTrue(confirmPasswordFieldMessage.isDisplayed());
        driver.quit();
     }
}
