package multiSD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleStepdef {
    WebDriver driver;

    @Given("User need to be on google login page")
    public void User_need_to_be_on_google_login_page() throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\Resources\\driver_ v1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        driver.findElement(By.id("L2AGLb")).click();

    }
    @When("User enter the search string")
    public void user_enter_the_search_string() {
        driver.findElement(By.cssSelector(".a4bIc > input[role='combobox']")).sendKeys("selenium");
        driver.findElement(By.cssSelector(".MZy1Rb [focusable]")).click();
    }
}
