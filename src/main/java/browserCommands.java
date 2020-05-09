import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class browserCommands {
    public static void main(String a[])
    {
        System.setProperty("webdriver.chrome.driver","/Users/driveu/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
       // String sou = driver.getPageSource();

        System.out.println("Title of the page is " +title);
        System.out.println("CurrentUrl is "+url);
        driver.quit();
    }

}
