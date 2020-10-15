package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePageObject {

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold'] ")
    private WebElement searchTitle;

    public SearchResultPage(){
        PageFactory.initElements(driver,this);
    }

    public static SearchResultPage open(){
        SearchResultPage searchResultPage = new SearchResultPage();
        return searchResultPage;
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getSearchTitle(){
        return searchTitle.getText();
    }

}
