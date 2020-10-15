package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePageObject {

    private static String homePageUrl ="https://www.amazon.com/";

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(xpath = "//span[@id='nav-search-submit-text']/input")
    private WebElement searchButton;


    public HomePage(){
        driver.get(homePageUrl);
        PageFactory.initElements(driver,this);
    }

    public static HomePage open(){
        HomePage homePage = new HomePage();
        return homePage;
    }

    public void enterSearchString(String searchString){
        searchBox.sendKeys(searchString);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

}
