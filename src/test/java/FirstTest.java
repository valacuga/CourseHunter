import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest

    {

        @Test
        public void verifyTitle()
        {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.tut.by");
            String actual = driver.getTitle();
            String expected="Total-QA - Future of Software Testing";
            Assert.assertEquals(actual,expected);
        }
    }



