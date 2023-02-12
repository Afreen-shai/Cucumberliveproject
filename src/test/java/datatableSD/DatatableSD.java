package datatableSD;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatatableSD {
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


  @When("^User enter following details$")
  public void User_enter_following_details(DataTable table) throws InterruptedException {
        List<List<String>> data = table.asLists();
        String values1 =data.get(1).get(0);
        String values2 =data.get(1).get(1);
        String values3 =data.get(1).get(2);
        String values4 =data.get(2).get(0);
        String values5 =data.get(2).get(1);
        String values6 =data.get(2).get(2);

      driver.findElement(By.name("firstname")).sendKeys(values1);
      driver.findElement(By.name("lastname")).sendKeys(values2);
      Thread.sleep(2000);
  }
}
