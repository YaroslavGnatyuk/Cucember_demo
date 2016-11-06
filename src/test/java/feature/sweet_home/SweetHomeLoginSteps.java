package feature.sweet_home;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by yroslav on 11/5/16.
 */
public class SweetHomeLoginSteps {
    WebDriver driver = null;

    @Given("I'm on sweethome logging page")
    public void goToSweetHome(){
//        driver = new HtmlUnitDriver();
        driver = new FirefoxDriver();
        driver.navigate().to("http://178.219.93.93:8888/sweethome/login");
    }

    @When("User input login '(.+)'")
    public void inputUsername(String username){
        driver.findElement(By.id("username")).sendKeys(username);
    }

    @And("User input password '(.+)'")
    public void inputPassword(String password){
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector(".btn")).click();
    }

    @Then("Login should be accept")
    public void checkLogin(){
        assertThat(driver.getCurrentUrl(),equalTo("http://178.219.93.93:8888/sweethome/"));
    }

    @When("User press button exit")
    public void logout(){
        driver.findElement(By.cssSelector("#exit > a:nth-child(1)")).click();
    }

    @Then("User logout")
    public void checkLogout(){
        assertThat(driver.getCurrentUrl(),equalTo("http://178.219.93.93:8888/sweethome/login?logout"));
//        assertEquals(true, driver.getCurrentUrl().equalsIgnoreCase("http://178.219.93.93:8888/sweethome/login?logout"));
        driver.close();
    }

}
