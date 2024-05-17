import Pages.HomePage;
import Pages.LoginPage;
import com.beust.jcommander.Parameter;
import org.apache.hc.client5.http.entity.mime.Header;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginParameter extends BaseTest

{
    @Parameters({"username", "password"})
    @Test
    public void  loginTest(){
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage =new HomePage(driver);
        homePage.clickLoginButton();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.enterusernames("username");
        loginPage.enterPassword("password");
        loginPage.ClickLogin();
//        softAssert.assertEquals(true, header.isDisplayed());
        softAssert.assertAll();

    }
}
