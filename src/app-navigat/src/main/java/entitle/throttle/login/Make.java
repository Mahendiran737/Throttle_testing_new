
	package entitle.throttle.login;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;
	import entitle.throttle.AbstractPage;
	import entitle.throttle.login.LandingPage;
	import entitle.throttle.login.LoginPage;
	import entitle.throttle.login.LoginPageConstant;
	import entitle.throttle.login.VehiclePage;
	
	@SuppressWarnings("unused")
	public class Make extends AbstractPage {

		public Make(WebDriver driver) {
			super(driver);
			super.loadPage(LoginPageConstant.LOGIN_URL);
//	    super.loadPage(LoginPageConstant.LOGIN_URLS);
		
		}
		
		

	}
	
