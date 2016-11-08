package ipass;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import sun.rmi.runtime.Log;

/**
 * Created by Piyush on 05/11/2016.
 */
public class FunctionalStepdefs {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    @Given("^an admin is in login page$")
    public void anAdminIsInLoginPage() throws Throwable {

    }

    @When("^he logs into admin panel with valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void heLogsIntoAdminPanelWithValidUsernameAndPassword(String arg0, String arg1) throws Throwable {

    }

    @Then("^he should login in successfully$")
    public void heShouldLoginInSuccessfully() throws Throwable {

    }


    @When("^admin search \"([^\"]*)\"$")
    public void adminSearch(String arg0) throws Throwable {

    }

    @Given("^as admin is in the landing page$")
    public void as_admin_is_in_the_landing_page() throws Throwable {

        loginPage = new LoginPage();
        dashboardPage = loginPage.login();


    }

    @When("^he navigates to the Categories page$")
    public void he_navigates_to_the_Categories_page() throws Throwable {
//        dashboardPage.displayMenuUsingIPASS();
        dashboardPage.gotoCategoriesPage();

    }

    @Then("^he should be in the Categories page$")
    public void he_should_be_in_the_Categories_page() throws Throwable {
        Assert.assertTrue(dashboardPage.isUserInCategoryPage());

    }
}
