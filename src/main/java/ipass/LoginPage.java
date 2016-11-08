package ipass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.AutomationConstants;
import utils.WebDriverUtil;

/**
 * Created by Piyush on 05/11/2016.
 */
public class LoginPage extends BaseMain {

    public LoginPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "username")
    public WebElement email;

    @FindBy(how = How.ID, using = "password")
    public WebElement password;

    @FindBy(how = How.CSS, using = ".zmdi.zmdi-arrow-forward")
    WebElement loginButton;

    public DashboardPage login() {
        email.sendKeys(AutomationConstants.USERNAME);
        password.sendKeys(AutomationConstants.PASSWORD);
        loginButton.click();

        if(!WebDriverUtil.waitForText("DASHBOARD"))
        {
            WebDriverUtil.waitForText("Welcome to IPass");
        }
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("DASHBOARD"));
        return new DashboardPage();
    }

}
