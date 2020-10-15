package PageObjects;

import Utils.DriverProvider;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject {

    private static final int SHORT_IMPLICIT_TIMEOUT = 10;
    protected WebDriverWait wait;
    protected WebDriver driver = DriverProvider.getInstance().getWebDriver();
    final static Logger logger = Logger.getLogger(BasePageObject.class);

    public BasePageObject(){
        wait = new WebDriverWait(driver,SHORT_IMPLICIT_TIMEOUT);
    }

}
