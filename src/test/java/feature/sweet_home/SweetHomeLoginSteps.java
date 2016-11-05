package feature.sweet_home;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by yroslav on 11/5/16.
 */
public class SweetHomeLoginSteps {
    WebDriver driver = null;

    @Given("I'm on sweethome logging page")
    public void goToSweetHome(){
//        driver = new HtmlUnitDriver();

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setBrowserName("htmlunit");

        driver = new FirefoxDriver(capabilities);
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
        if(driver.getCurrentUrl().equalsIgnoreCase("http://178.219.93.93:8888/sweethome/")){
            System.out.println("Logging was successful");
        }else{
            System.out.println("Logging was unsuccessful");
        }
    }

    @When("User press button exit")
    public void logout(){
        driver.findElement(By.className("navbar-brand")).click();
    }

    @Then("User logout")
    public void checkLogout(){
        if (driver.getCurrentUrl().equalsIgnoreCase("http://178.219.93.93:8888/sweethome/login?logout")){
            System.out.println("Logout was successful");
        }else{
            System.out.println("Logout was unsuccessful");
        }
    }

}
