package sharedataSD;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sharedclass {
    WebDriver driver;
    @Before
    public WebDriver Setup () {
        if(driver==null) {
            System.setProperty("WebDriver.chrome.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\Resources\\driver_ v1\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
    @After
    public void tearDown(){
        driver.quit();
        driver = null;
    }
}
