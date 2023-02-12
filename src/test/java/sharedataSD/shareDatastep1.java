package sharedataSD;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class shareDatastep1 {
    WebDriver driver;
    public shareDatastep1(sharedclass share){
        driver =share.Setup();
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
        driver.findElement(By.name("reg_email__")).sendKeys(string);

    }
}
