import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserManager extends Utils
{
    LoadProp loadProp = new LoadProp();
    String browserName = loadProp.getProperty("browser");

    public void OpenBrowser()
    {

    switch (browserName)
    {
        case "Chrome":
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            break;

        case "Firefox":
            System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            break;

        case "Edge":
            System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
            break;

        default:
            System.out.println("Browser is not correct:" + browserName);
    }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

    public void quit() {
        driver.quit();

    }

}

//        if (browserName.equalsIgnoreCase("Chrome")) {
//            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
//            driver = new ChromeDriver();
//        } else if (browserName.equalsIgnoreCase("Firefox")) {
//
//            System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
//            driver = new FirefoxDriver();
//
//        } else if (browserName.equalsIgnoreCase("Edge")) {
//            System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
//            driver = new EdgeDriver();
//        }else {
//            System.out.println("Browser is not correct:" + browserName);
//        }
