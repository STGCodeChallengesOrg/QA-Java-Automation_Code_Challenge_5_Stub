package tests;

/**
 * IMPORTANT NOTE:
 * This class runs the unit tests for your code solution.
 * If your code does not pass these tests, your solution is not complete.
 * If you want to add more test methods, that's fine.
 * DO NOT RENAME OR DELETE ANY OF THE EXISTING TEST METHODS IN THIS FILE.
 * REALLY.
 * Created 9/16/2016.
 */

//region imports
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeTest;
import pageObjects.SearchPage;
import java.util.concurrent.TimeUnit;
import testResources.TestHelper;
//endregion

public class VerificationTests {
//region Member Elements
    public WebDriver driver;
    public SearchPage searchPage;
    protected TestHelper helper;
    //endregion

    @BeforeSuite
    public void SetUpTestSuite()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout((long)20, TimeUnit.SECONDS);
        //If this returns an error, you may need to add the path to the chrome executable to your path variable.
        helper = new TestHelper();
    }

    @BeforeTest
    public void OpenPage()
    {
        try{
            driver.get("https://www.skiutah.com/members/listing");
            searchPage = new SearchPage(driver);}
        catch(Exception e){
            e.printStackTrace();
        }
    }

    //region Tests
    @Test
    public void verifyWhatSelectIsFound()
    {
        Assert.assertNotNull(searchPage.whatSelect);
    }

    @Test
    public void verifySubCategorySelectIsFound()
    {
        Assert.assertNotNull(searchPage.subCategorySelect);
    }

    @Test
    public void verifyByResortSelectIsFound()
    {
        Assert.assertNotNull(searchPage.byResortSelect);
    }

    @Test
    public void verifyOkSubmitButtonFound()
    {
        Assert.assertNotNull(searchPage.okSubmitButton);
    }

    @Test
    public void verifySearchResults1()
    {
        Assert.assertFalse(searchPage.SearchFor("Activities","","").isEmpty());
    }

    @BeforeTest
    public void goBack1()
    {

        searchPage = helper.goBack(driver, searchPage);
    }

    @Test
    public void verifySearchResults2()
    {
        Assert.assertFalse(searchPage.SearchFor("Ski School","","").isEmpty());
    }

    @BeforeTest
    public void goBack2()
    {
        searchPage = helper.goBack(driver, searchPage);
    }

    @Test
    public void verifySearchResults3()
    {
        Assert.assertFalse(searchPage.SearchFor("Ski School","Clinics","Sundance").isEmpty());
    }
//endregion

    @AfterSuite
    public void TearDown()
    {
        driver.close();
    }
}