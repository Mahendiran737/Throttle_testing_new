package entitle.throttle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Browser {

  public enum Navigator {
    chrome, firefox
  }

  public static WebDriver fireFoxDriver() {
    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    return driver;
  }


  public static WebDriver chromeDriver() {
    System.setProperty("webdriver.chrome.driver", "D:\\TESTING\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    return driver;
  }

  public static WebDriver getDriver(Navigator name) {
    WebDriver driver = null;
    switch (name) {
    case firefox:
      driver = fireFoxDriver();
      break;
    case chrome:
      driver = chromeDriver();
      break;
    default:
      driver = chromeDriver();
      break;
    }
    return driver;
  }
}