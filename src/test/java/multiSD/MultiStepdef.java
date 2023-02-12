package multiSD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiStepdef {

    WebDriver driver;

    @Given("User need to be on Facebook Login page")
    public void user_need_to_be_on_facebook_login_page() throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\shaik\\OneDrive\\Desktop\\Resources\\driver_ v1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("body > div:nth-child(29) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);

    }
    @When("User enter the user {string} first name")
    public void user_enter_the_user_first_name(String string) {
        driver.findElement(By.name("firstname")).sendKeys(string);
    }

    @Then("^User checks  user name is present$")
    public void user_checks_user_name_is_present() {
        String usernameActual = driver.findElement(By.name("firstname")).getAttribute("value");
        Assert.assertEquals("afreen", usernameActual);
    }
    @When("^User enter the user \"([^\"]*)\"surname$")
    public void user_enter_the_user_shaik_surname(String surname) {
        driver.findElement(By.name("lastname")).sendKeys(surname);
    }

    @Then("User checks user surname is present")
    public void user_checks_user_surname_is_present() {
        String surnameActual = driver.findElement(By.name("lastname")).getAttribute("value");
        Assert.assertEquals("shaik", surnameActual);

    }
    @Then("User mobile number should be {string}")
    public void user_mobile_number_should_be(String string) {
        driver.findElement(By.name("reg_email__")).sendKeys("7443187080");


    }
    @Then("^close the browser$")
    public void close_the_browser() {
        driver.quit();
        driver=null;
    }
}
