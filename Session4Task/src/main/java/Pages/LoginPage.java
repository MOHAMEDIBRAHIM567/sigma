package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
    //WebDriver driver;

    By usernames = By.xpath("//*[@id=\"user-name\"]");
    By Password = By.xpath("//*[@id=\"password\"]");
    By LoginButton = By.xpath("/html/body/div[2]/div[1]/div/div/form/input[3]");

    public LoginPage (WebDriver driver){
        super(driver);

    }
    public  void enterusernames(String username){
        driver.findElement(usernames).sendKeys(username);}
    public  void enterPassword(String password){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernames));
        driver.findElement(Password).sendKeys(password);}
    public  void ClickLogin(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
        driver.findElement(LoginButton).click();}



}

