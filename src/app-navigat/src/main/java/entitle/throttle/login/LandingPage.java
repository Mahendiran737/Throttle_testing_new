package entitle.throttle.login;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import entitle.throttle.AbstractPage;

@SuppressWarnings("unused")
public class LandingPage extends AbstractPage {

	private static final String EMP_ADDRESS_CHECKBOX = "chec";
	private static final String MAKE_NAV_PARENT = "nav-parent";
	private static final String SAVE = "btn btn-success";
	private static final String LINK_COMPANY = "//a[contains(text(),'Company ')]";
	private static final String CLICK_NEXT = "Next";
	private static final String BUTTON_ADD = "add";
	private static final String LINK_EMPLOYEES = "//a[contains(text(),'Employees ')]";
	private static final String SPAN_CONTAINS_TEXT_HRMS = "//span[contains(text(),'HRMS')]";
	private static final String HTML_BODY_SECTION_DIV_2_DIV_3_DIV_DIV_FORM_CENTER_INPUT_1 = "/html/body/section/div[2]/div[3]/div/div/form/center/input[1]";
	private static final String LINK_MAKE = "//a[contains(text(),'Make')]";
	private static final String SPAN_CONTAINS_TEXT_VEHICLES = "//span[contains(text(),'VEHICLES')]";
	private static final String MENUTOGGLE = "menutoggle";

	public LandingPage(WebDriver driver) {
		super(driver);
	}

	public String getPageName() {
		return getDriver().getTitle();
	}

	public MakePage gotoMakePage() {

		getDriver().manage().window().maximize();

		getDriver().findElement(By.className(MENUTOGGLE)).click();

		getDriver().findElement(By.className(MAKE_NAV_PARENT)).findElement(By.xpath(SPAN_CONTAINS_TEXT_VEHICLES)).click();

		getDriver().findElement(By.xpath(LINK_MAKE)).click();
		
		getDriver().findElement(By.className(SAVE)).click();

		return new MakePage(getDriver());
	}

	public EmployeePage goToEmployeePage() {

		getDriver().findElement(By.className(MENUTOGGLE)).click();

		getDriver().findElement(By.className(MAKE_NAV_PARENT)).findElement(By.xpath(SPAN_CONTAINS_TEXT_HRMS)).click();

		getDriver().findElement(By.xpath(LINK_EMPLOYEES)).click();

		getDriver().findElement(By.name(BUTTON_ADD)).click();

		getDriver().findElement(By.name(CLICK_NEXT)).click();
		
		getDriver().findElement(By.name(EMP_ADDRESS_CHECKBOX)).click();
		
		getDriver().findElement(By.className(SAVE)).click();

		return new EmployeePage(getDriver());
	}

	public CompanyPage goToCompanyPage() {

		getDriver().findElement(By.className(MENUTOGGLE)).click();

		getDriver().findElement(By.className(MAKE_NAV_PARENT)).findElement(By.xpath(SPAN_CONTAINS_TEXT_HRMS)).click();

		getDriver().findElement(By.xpath(LINK_COMPANY)).click();

		getDriver().findElement(By.name(BUTTON_ADD)).click();
		
		getDriver().findElement(By.name(BUTTON_ADD)).click();
		
		getDriver().findElement(By.className(SAVE)).click();
		
		return new CompanyPage(getDriver());

	}

}
