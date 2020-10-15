package Tests;

import PageObjects.HomePage;
import PageObjects.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest{


    @Test
    public void searchTest(){

        HomePage homePage = HomePage.open();
        homePage.enterSearchString("mug");
        homePage.clickSearchButton();
        SearchResultPage searchResultPage = SearchResultPage.open();
        String title = searchResultPage.getSearchTitle();
        boolean result = title.contains("mug");
        Assert.assertTrue(result, "Test Failed. Search not working correctly.");

    }


}
