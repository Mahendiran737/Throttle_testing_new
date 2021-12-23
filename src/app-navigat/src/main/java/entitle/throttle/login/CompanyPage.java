package entitle.throttle.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import entitle.throttle.AbstractPage;

public class CompanyPage extends AbstractPage {

	private static final String COMPANY_GST_NO = "gstNo";
	private static final String ORGANIZATION_ID = "organizationId";
	private static final String BILLING_STATE_ID = "stateId";
	private static final String COMPANY_EMAIL = "email";
	private static final String COMPANY_FAX = "fax";
	private static final String COMPANY_PHONE2 = "phone2";
	private static final String COMPANY_PIN_CODE = "pinCode";
	private static final String COMPANY_PHONE1 = "phone1";
	private static final String COMPANY_STATE = "state";
	private static final String COMPANY_DISTRICT = "district";
	private static final String COMPANY_CITY = "city";
	private static final String COMPANY_ADDRESS = "compAddress";
	private static final String COMPANY_NAME = "name";
	private static final String COMPANY_TYPE_ID = "companyTypeId";

	public CompanyPage(WebDriver driver) {
		super(driver);
	}

	public void selectCompanyType(String selCompany) {
		WebElement company = getDriver().findElement(By.name(COMPANY_TYPE_ID));
		Select company1 = new Select(company);
		company1.selectByVisibleText(selCompany);
	}

	public void typeCompany(String compName) {
		getDriver().findElement(By.name(COMPANY_NAME)).sendKeys(compName + Keys.ENTER);
	}

	public void typeCompAddress(String compAddress) {
		getDriver().findElement(By.name(COMPANY_ADDRESS)).sendKeys(compAddress + Keys.ENTER);
	}
	
	public void typeCompCity(String compCity) {
		getDriver().findElement(By.name(COMPANY_CITY)).sendKeys(compCity + Keys.ENTER);
	}
	
	public void typeCompDistrict(String compDistrict) {
		getDriver().findElement(By.name(COMPANY_DISTRICT)).sendKeys(compDistrict + Keys.ENTER);
	}
	
	public void typeCompState(String compState) {
		getDriver().findElement(By.name(COMPANY_STATE)).sendKeys(compState + Keys.ENTER);
	}
	
	public void typeCompPhone(String compPhone) {
		getDriver().findElement(By.name(COMPANY_PHONE1)).sendKeys(compPhone + Keys.ENTER);
	}
	
	public void typeCompPincode(String compPincode) {
		getDriver().findElement(By.name(COMPANY_PIN_CODE)).sendKeys(compPincode + Keys.ENTER);
	}
	
	public void typeCompPhone1(String compPhone1) {
		getDriver().findElement(By.name(COMPANY_PHONE2)).sendKeys(compPhone1 + Keys.ENTER);
	}
	
	public void typeCompFax(String compFax) {
		getDriver().findElement(By.name(COMPANY_FAX)).sendKeys(compFax + Keys.ENTER);
	}
	
	public void typeCompEmail(String compEmail) {
		getDriver().findElement(By.name(COMPANY_EMAIL)).sendKeys(compEmail + Keys.ENTER);
	}
	
	public void typeCompWeb(String compWeb) {
		getDriver().findElement(By.name("web")).sendKeys(compWeb + Keys.ENTER);
	}
	
	public void selectBillingState(String selBillingState) {
		WebElement compstateId = getDriver().findElement(By.name(BILLING_STATE_ID));
		Select compstateId1 = new Select(compstateId);
		compstateId1.selectByVisibleText(selBillingState);
	}
	
	public void selectOrgType(String selOrgType) {
		WebElement organizationId = getDriver().findElement(By.name(ORGANIZATION_ID));
		Select organizationId1 = new Select(organizationId);
		organizationId1.selectByVisibleText(selOrgType);
	}
	
	public void typeCompGst(String compGst) {
		getDriver().findElement(By.name(COMPANY_GST_NO)).sendKeys(compGst + Keys.ENTER);
	}
	
	public void typePanNum(String companyPan) {
		getDriver().findElement(By.name("panNo")).sendKeys(companyPan + Keys.ENTER);
	}
	
	public void typeContactPer(String contactPerson) {
		getDriver().findElement(By.name("contactPersons")).sendKeys(contactPerson + Keys.ENTER);
	}
	
	public void typeContactNumber(String contactNumber) {
		getDriver().findElement(By.name("contactNos")).sendKeys(contactNumber + Keys.ENTER);
	}

	public void fillCompanyDetails(ManufacturerDetailsTO comp) {
		selectCompanyType(comp.getSelCompany());
		typeCompany(comp.getCompName());
		typeCompAddress(comp.getCompAddress());
		typeCompCity(comp.getCompCity());
		typeCompDistrict(comp.getCompDistrict());
		typeCompState(comp.getCompState());
		typeCompPhone(comp.getCompPhone());
		typeCompPincode(comp.getCompPincode());
		typeCompPhone1(comp.getCompPhone1());
		typeCompFax(comp.getCompFax());
		typeCompEmail(comp.getCompEmail());
		typeCompWeb(comp.getCompWeb());
		selectBillingState(comp.getSelBillingState());
		selectOrgType(comp.getSelOrgType());
		typeCompGst(comp.getCompGst());
		typePanNum(comp.getCompanyPan());
		typeContactPer(comp.getContactPerson());
		typeContactNumber(comp.getContactNumber());
	}
}
