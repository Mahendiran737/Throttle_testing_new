package entitle.throttle.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import entitle.throttle.AbstractPage;

public class LoginPage extends AbstractPage {
	@FindBy(name = "userName")
	private WebElement userName;
	@FindBy(name = "password")
	private WebElement secret;
	@FindBy(id = "submitButton")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		super(driver);
		super.loadPage(LoginPageConstant.LOGIN_URL);
	}

	public LandingPage login(String username, String password) {
		userName.sendKeys(username);
		secret.sendKeys(password);
		loginButton.click();
		getDriver().manage().window().maximize();
		LandingPage land = new LandingPage(getDriver());
		MakePage makePage = land.gotoMakePage();
		ManufacturerDetailsTO input = new ManufacturerDetailsTO();
		input.setName("LEYLAND");
		input.setDesc("TRUCK");
		input.setActivityGroup("1");
		input.setStatus("Y");
		input.setTrailer("edit1");
		input.setAppendBox("mfrNames");
		input.setEditAppendBox("1");
		input.setEditStatus("Y");
		input.setEditDescription("trailerMfr");
		makePage.fillManufacturerDetails(input);
		
		EmployeePage employeePage = land.goToEmployeePage();
		ManufacturerDetailsTO emp = new ManufacturerDetailsTO();
		emp.setEmployeeName("Mahendiran");
		emp.setEmployeeId("ABC12");
		emp.setEmployeeDob("31-05-2000");
		emp.setEmployeeGender("gender");
		emp.setEmpMaritalStatus("Unmarried");
		emp.setEmpMobile("1234567890"); 
		emp.setEmpQualifications("BE");
		emp.setEmpDateOfJoining("31-05-2020");
		emp.setEmpBloodGrp("o+");
		emp.setEmpFatherName("Ramasamy");
		emp.setEmpHomePhone("222666444");
		emp.setEmpMailId("entitlesolution.com");
		emp.setEmpDeptName("Admin");
		emp.setSelDesignation("Accountant");
		emp.setSelectEmpGrade("Accountant");
		emp.setSelectHireEmp("YES");
		emp.setSelectEmpCompany("BVM Chennai");
		emp.setSelectEmpactiveInd("Active");
		emp.setEmpvendorCompany("jack");
		emp.setEmpUserName("entitle");
		emp.setEmpPassword("BBBB");
		emp.setEmpRole("3");
		
		emp.setEmpAddress("chennai, TamilNadu");
		emp.setEmpCity("Madras");
		emp.setEmpState("Kerala");
		emp.setEmployeePincode("636363");
		
		employeePage.fillEmployeeDetails(emp);
		
		CompanyPage companyPage = land.goToCompanyPage();
		ManufacturerDetailsTO comp = new ManufacturerDetailsTO();
		comp.setSelCompany("2");
		comp.setCompName("Finagg");
		comp.setCompAddress("NO,222 , Anna nagar ,chennai");
		comp.setCompCity("Chennai");
		comp.setCompState("TamilNadu");
		comp.setCompPhone("9898989898");
		comp.setCompPincode("600040");
		comp.setCompPhone1("8885559998");
		comp.setCompFax("12121212121");
		comp.setCompEmail("finagg@gmail.com");
		comp.setCompWeb("Moko");
		comp.setSelBillingState("4");
		comp.setSelOrgType("1");
		comp.setCompGst("333DFDFGSSD333");
		comp.setCompanyPan("BRDPM4095E");
		comp.setContactPerson("Sivanasan");
		comp.setContactNumber("7878787878");
		
		
		companyPage.fillCompanyDetails(comp);
		return land;
	}

}
