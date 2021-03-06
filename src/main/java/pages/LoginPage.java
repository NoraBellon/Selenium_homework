package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
     private WebDriver driver;
     private By usernameField = By.id("username");
     private By passwordField = By.id("password");
     private By loginButton = By.xpath("//button[@type='submit']");

     public LoginPage(WebDriver driver) {
         this.driver = driver ;
     }

     public void setUserName(String userName){
          driver.findElement(usernameField).sendKeys(userName);
     }

     public void setPasswordField(String password){
          driver.findElement(passwordField).sendKeys(password);
     }

     public SecureAreaPage clickLoginButton(){
          driver.findElement(loginButton).click();
          return new SecureAreaPage(driver);
     }
}
