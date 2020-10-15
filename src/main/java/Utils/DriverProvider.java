package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

public class DriverProvider {

    private static DriverProvider instance = null;
    ThreadLocal<WebDriver> wd = new ThreadLocal<>();

    private DriverProvider() {

    }

    public static DriverProvider getInstance() {
        if (instance == null) {
            instance = new DriverProvider();
        }
        return instance;
    }


    public void setWebDriver(String browser, String platform) {

        DesiredCapabilities capabilities = null;
        // Browsers
        if (browser.equalsIgnoreCase("Firefox")) {
            capabilities = DesiredCapabilities.firefox();
        }
        if (browser.equalsIgnoreCase("Chrome")) {
            capabilities = DesiredCapabilities.chrome();
        }

        // Platforms
        if (platform.equalsIgnoreCase("WINDOWS")) {
            capabilities.setPlatform(Platform.WINDOWS);
        }
        if (platform.equalsIgnoreCase("LINUX")) {
            capabilities.setPlatform(Platform.LINUX);
        }

        try {
            wd.set(new RemoteWebDriver(new URL("http://192.168.8.159:4444/wd/hub"),capabilities));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public WebDriver getWebDriver() {
        return wd.get();
    }


}
