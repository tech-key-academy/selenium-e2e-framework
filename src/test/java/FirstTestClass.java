import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

 public class FirstTestClass {
    @Test
    void verifyHomePageLanding()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");

        String title = driver.getTitle();

        Assert.assertEquals(title,"Home Page");

    }
    
}

