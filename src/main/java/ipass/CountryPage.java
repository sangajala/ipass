package ipass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Piyush on 04/11/2016.
 */
public class CountryPage extends BaseMain {
    public CountryPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = " //input[@class='search-field form-control']")
    public WebElement search;

    public void todosearch(String searchText) {
        search.sendKeys(searchText);
        search.click();

    }

}
