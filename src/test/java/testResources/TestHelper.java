package testResources;

import pageObjects.SearchPage;
import org.openqa.selenium.*;

/**
 * Created by on 9/16/2016.
 * Helper methods for Tests
 */
public class TestHelper {

    public TestHelper(){

    }

    public SearchPage goBack(WebDriver driver, SearchPage searchPage)
    {       //gets back to the webpage without the web results, and creates a new page. Prevents StaleElementExceptions.
        driver.get("https://www.skiutah.com/members/listing");
        searchPage = new SearchPage(driver);
        return searchPage;
    }

}
