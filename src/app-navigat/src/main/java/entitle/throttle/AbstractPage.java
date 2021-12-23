package entitle.throttle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

@SuppressWarnings("unused")
public abstract class AbstractPage {
  private WebDriver driver;

  protected AbstractPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public final WebDriver getDriver() {
    return driver;
  }

  public void loadPage(String url) {
    getDriver().get(url);
	FluentWait<WebDriver> wait = new FluentWait<>(getDriver());
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submitButton")));
    PageFactory.initElements(driver, this);
  }
  
}
