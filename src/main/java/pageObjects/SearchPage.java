package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.*;

/**
 * Created on 9/13/2016.
 */
public class SearchPage {
    WebDriver driver;

    //region Constuctors
    public SearchPage(WebDriver Driver)
    {
        //This constructor needs to initialize the WebElements that are listed in the "Page Elements" region.
        //If using PageFactory, just use the PageFactory.initElements(WebDriver, pageObjects.SearchPage) method.
    }
//endregion

    //region Page Elements

// USE THE @FindBy NOTATION OF THE PAGEFACTORY CLASS
//    TO LOCATE AND IDENTIFY THESE WEB PAGE ELEMENTS:

    @FindBy(name = "filter-category-select")
    public WebElement whatSelect;

    public WebElement subCategorySelect;

    public WebElement byResortSelect;

    public WebElement okSubmitButton;

    List<WebElement>searchResults;
    //Read the findby_annotations.txt file for more information about the @FindBy annotations

//endregion

    //region Methods

        public ArrayList<String> SearchFor(String what, String subCategory, String byResort){
            ArrayList<String> results = new ArrayList<String>();
            results.add("This just initializes the list so the code will compile. Delete this entire line of code.");
            //TODO Enter the parameters into the correct page elements.
            //TODO Click the 'OK" button.
            //TODO Get a string representing each result from the ListingResults-item section of the web page.This can be the 'title,' the 'copy,' or whatever.
            //TODO Add each String to the list of results.
            //TODO return the results.
        return results;
  }

}