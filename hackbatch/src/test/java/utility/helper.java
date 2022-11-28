package utility;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;
import stepdefinition.batchsteps;

public class helper {
	private static helper Helper;
    private static WebDriver driver;
    public final static int TIMEOUT = 2;
    //Logger log= Logger.getLogger(batchsteps.class);
     private helper() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
       // log.info("Lauching chrome browser");
        driver.manage().window().maximize();
        
     }
    public static void openPage(String url) {
        driver.get(url);
    }
    public static String getTitle() {
        return driver.getTitle();
    }
    public static void NavBack() {
    	driver.navigate().back();
    }
    public static WebDriver getDriver() {
        return driver;
    }
    public static void setUpDriver() {
        if (Helper==null) {
            Helper = new helper();
        }
    }
     public static void tearDown() {
         if(driver!=null) {
             driver.close();
             driver.quit();
         }
         Helper = null;
     }

}
