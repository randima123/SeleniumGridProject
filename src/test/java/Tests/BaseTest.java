package Tests;

import Utils.DriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public void setDriver(String browser, String platform){

        DriverProvider.getInstance().setWebDriver(browser, platform);
        WebDriver driver = DriverProvider.getInstance().getWebDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Parameters({ "browser", "platform"})
    @BeforeTest(alwaysRun = true)
    public void prepareTest(String browser, String platform ){
        setDriver(browser, platform);
    }


    @AfterMethod
    public void close(){

        WebDriver webDriver =  DriverProvider.getInstance().getWebDriver();
        if(webDriver != null){
            webDriver.quit();
        }

    }


}
