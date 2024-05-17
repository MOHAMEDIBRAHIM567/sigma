package Pages;

import Utilities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;
    By LoginButton = By.xpath("/html/body/div[2]/div[1]/div/div/form/input[3]");

    By header = By.className("header_secondary_container");

    public BasePage(WebDriver driver) {
        this.driver=(driver);
    }

    public  void clickLoginButton(){driver.findElement(LoginButton).click();}


}
