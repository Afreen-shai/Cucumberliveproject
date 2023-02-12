package multiSD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoStepdef {
    WebDriver driver;

    @Given("User need to be on demo login page")
    public void User_need_to_be_on_demo_login_page() throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\Resources\\driver_ v1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(1000);
    }
    @When("User enter first name")
    public void User_enter_first_name() {
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Afreen");
    }
    @When("User enter last name")
    public void User_enter_last_name() {
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("shaik");
    }
}
