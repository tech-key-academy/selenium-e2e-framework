import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

 public class FirstTestClass {
     String LANDING_PAGE_URL = "https://magento.softwaretestingboard.com/";
     String CREATE_AN_ACCOUNT = "//button[@type='submit']";

    @Test
    void verifyHomePageLanding()
    {
        WebDriver driver = new ChromeDriver();
        driver.get(LANDING_PAGE_URL);

        String title = driver.getTitle();

        Assert.assertEquals(title,"Home Page");

    }
     @Test
     void blankFieldvalidation()
     {
        WebDriver driver = new ChromeDriver();
        driver.get(LANDING_PAGE_URL);
        WebElement createAnAccount = driver.findElement(By.xpath("//a[text()='Create an Account']"));
        createAnAccount.click();
        WebElement createAnAccountButton = driver.findElement(By.xpath("//button[@type='submit']"));
        createAnAccountButton.click();
        WebElement firstNameValidationMessage = driver.findElement(By.xpath("//div[@for='firstname']"));
        Assert.assertTrue(firstNameValidationMessage.isDisplayed());
        WebElement lastNameValidationMessage = driver.findElement(By.xpath("//div[@for='lastname']"));
        Assert.assertTrue(lastNameValidationMessage.isDisplayed());
        System.out.println("hello");

     }
}

