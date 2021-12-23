package entitle.throttle; 

//import entitle.throttle.Make;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import entitle.throttle.login.LandingPage;

public class LoginTest {

  @Test
  public void testLogin() {
    Application app = new Application();
    
    LandingPage landingPage = app.launch("Entitle", "admin");
    
    String pageName = landingPage.getPageName();
    MatcherAssert.assertThat(pageName, CoreMatchers.is("Throttle - Leading Transport Management System"));
//    landingPage.getDriver().findElement(By.id("flt0_table")).sendKeys("1"+Keys.ENTER);\\\
    
  }
}
