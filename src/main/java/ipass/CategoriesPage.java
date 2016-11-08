package ipass;

import ipass.BaseMain;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by pc on 08-Nov-16.
 */
public class CategoriesPage extends BaseMain{
    @FindBy(how = How.CSS, using="#uname")
    WebElement txtField_AddCategoryName;
    @FindBy(how = How.CSS, using=".btn.bgm-blue.waves-effect")
    WebElement button_AddCategory;
    @FindBy(how = How.CSS, using="#uname")
    WebElement txtField_EditCategoryName;
    @FindBy(how = How.CSS, using=".btn.bgm-blue.waves-effect")
    WebElement button_SaveEditCategory;
    @FindBy(how = How.CSS, using=".btn.btn-icon.command-edit.waves-effect.waves-circle")
    WebElement button_EditCategory;

    @FindBy(how = How.CSS, using=".btn.btn-icon.command-delete.waves-effect.waves-circle")
    WebElement button_DeleteCategory;

    @FindBy(how = How.CSS, using=".search-field.form-control")
    WebElement txtField_SearchCategory;
    @FindBy(how = How.CSS, using=".zmdi.icon.input-group-addon.glyphicon-search")
    WebElement button_SearchCategory;

    public CategoriesPage()
    {
        PageFactory.initElements(driver, this);
    }
    public void addCategory(String categoryName)
    {
        txtField_AddCategoryName.sendKeys(categoryName);
        button_AddCategory.click();
    }
    public void searchACategory(String categoryName)
    {
        txtField_SearchCategory.sendKeys(categoryName);
        button_SearchCategory.click();
    }
    public void editACategory()
    {
        button_EditCategory.click();
    }

}
