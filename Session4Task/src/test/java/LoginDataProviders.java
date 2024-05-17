import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginDataProviders extends BaseTest {

    @DataProvider(name = "LoginData")
    public Object[][]providerLoginData(){
        return new Object[][]{
                {"standard_user","secret_sauce"},
                {"locked_out_user","secret_sauce"},
                {"problem_user","secret_sauce"},
                {"performance_glitch_user","secret_sauce"}
        };
    }
    @Test(dataProvider = "LoginData")
    public void LoginProvider(String username, String Password){
        HomePage homePage =new HomePage(driver);
        homePage.clickLoginButton();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.enterusernames(username);
        loginPage.enterPassword(Password);
        loginPage.ClickLogin();

    }

    @Test
    public void LoginValidUser() {
        HomePage homePage =new HomePage(driver);
        homePage.clickLoginButton();
        LoginPage loginPage= new LoginPage(driver);

        //loginPage.clickLoginButton();
        loginPage.enterusernames("usermname");
        loginPage.enterPassword("password");
        loginPage.ClickLogin();

    }
}
