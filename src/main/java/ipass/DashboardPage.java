package ipass;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.AutomationConstants;
import utils.WebDriverUtil;

/**
 * Created by Piyush on 05/11/2016.
 */
public class DashboardPage extends BaseMain {


    @FindBy(how = How.ID, using = "menu-trigger")
    public WebElement OpenTab;
    @FindBy(how = How.LINK_TEXT, using = "Countries")
    public WebElement Countries_link;
    @FindBy(how = How.CSS, using = ".ts-helper")
    WebElement sliderForDisplayingSideMenu;
    @FindBy(how = How.CSS, using = ".logo.hidden-xs>a")
    WebElement iPASSForDisplayingSideMenu;
    @FindBy(how = How.ID, using = "menu-trigger")
    WebElement button_categoriesPage;

    public DashboardPage() {

        PageFactory.initElements(driver, this);
    }

    public CountryPage gotoCountryPage() {
        OpenTab.click();
        Countries_link.click();
        return new CountryPage();
    }


    String homePageURL = "Home/Dashboard";

    public void displayMenuUsingSlider() {
        sliderForDisplayingSideMenu.click();
    }

    public void displayMenuUsingIPASS() {
        iPASSForDisplayingSideMenu.click();
    }

    public void gotoCategoriesPage() {

        driver.get(AutomationConstants.URL+"Category/Index");
//        button_categoriesPage.click();
    }

    public void pageVerfication(String homePageURL) {
        Assert.assertTrue(driver.getCurrentUrl().contains(homePageURL));
    }

    public boolean isUserInCategoryPage() {

            return WebDriverUtil.isTextPresent("CATEGORY");
    }
}
