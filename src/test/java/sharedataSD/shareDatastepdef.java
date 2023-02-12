package sharedataSD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class shareDatastepdef {
        WebDriver driver;
        public shareDatastepdef(sharedclass share){
            driver =share.Setup();
        }
        @Given("User need to be on Facebook Login page")
        public void user_need_to_be_on_facebook_login_page() throws InterruptedException {
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

    }

