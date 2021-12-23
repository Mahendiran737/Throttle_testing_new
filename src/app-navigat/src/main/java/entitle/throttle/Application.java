package entitle.throttle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import entitle.throttle.Browser.Navigator;
import entitle.throttle.login.LandingPage;
import entitle.throttle.login.LoginPage;

public class Application {

  public LandingPage launch(String user, String password) {
    WebDriver driver = Browser.getDriver(Navigator.chrome);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    LoginPage page = new LoginPage(driver);
    return page.login(user, password);
  }
}
