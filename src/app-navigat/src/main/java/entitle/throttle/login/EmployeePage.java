package entitle.throttle.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import entitle.throttle.AbstractPage;

public class EmployeePage extends AbstractPage {
	
	private static final String EMPLOYEE_PINCODE = "pincode";

	private static final String EMPLOYEE_STATE = "state";

	private static final String EMPLOYEE_CITY = "city";

	private static final String EMPLOYEE_ADDRESS = "addr";

	private static final String EMPLOYEE_PASSWORD = "password";
	private static final String EMPLOYEE_USER_NAME = "userName";
	private static final String CHECKBOX_USER_STATUS = "userStatus";
	private static final String EMPLOYEE_VENDOR_COMPANY = "vendorCompany";
	private static final String EMPLOYEE_ACTIVE_IND_STATUS = "activeInd";
	private static final String EMP_COMPANY_ID = "cmpId";
	private static final String HIRE_CONTRACT_DRIVER = "contractDriver";
	private static final String EMP_DESIGNATION_ID = "designationId";
	private static final String EMP_DESG_GRADE_ID = "gradeId";
	private static final String EMPLOYEE_DEPTARTMENT = "deptid";
	private static final String EMP_EMAIL_ID = "email";
	private static final String EMP_HOME_PHONE_NO = "phone";
	private static final String EMPLOYEE_FATHER_NAME = "fatherName";
	private static final String EMPLOYEE_BLOOD_GRP = "bloodGrp";
	private static final String EMPLOYEE_DATE_OF_JOINING = "dateOfJoining";
	private static final String EMPLOYEE_QUALIFICATION = "qualification";
	private static final String EMPLOYEE_MOBILE = "mobile";
	private static final String EMPLOYEE_MARITAL_STATUS = "maritalStatus";
	private static final String EMPLOYEE_GENDER = "gender";
	private static final String EMPLOYEE_DATE_OF_BIRTH = "dateOfBirth";
	private static final String EMPLOYEE_ID = "orgEmpId";
	private static final String EMPLOYEE_NAME = "name";

	public EmployeePage(WebDriver driver) {
		super(driver);
	}

	public void enterEmployeeName(String empName) {
		getDriver().findElement(By.id(EMPLOYEE_NAME)).sendKeys(empName + Keys.ENTER);
	}

	public void enterEmployeeId(String empId) {
		getDriver().findElement(By.id(EMPLOYEE_ID)).sendKeys(empId + Keys.ENTER);
	}

	public void enterEmployeeDob(String empDob) {
		getDriver().findElement(By.id(EMPLOYEE_DATE_OF_BIRTH)).sendKeys(empDob + Keys.ENTER);
	}

	public void selectEmployeeGender(String selgender) {
		WebElement gender = getDriver().findElement(By.name(EMPLOYEE_GENDER));
		Select select = new Select(gender);
		select.selectByVisibleText(selgender);
	}

	public void selectEmpMaritalStatus(String selmarital) {
		WebElement marital = getDriver().findElement(By.name(EMPLOYEE_MARITAL_STATUS));
		Select selected = new Select(marital);
		selected.selectByValue(selmarital);
	}

	public void enterEmployeeMobile(String empMobileNum) {
		getDriver().findElement(By.name(EMPLOYEE_MOBILE)).sendKeys(empMobileNum + Keys.ENTER);
	}

	public void enterEmpQualifications(String empQualifications) {
		getDriver().findElement(By.name(EMPLOYEE_QUALIFICATION)).sendKeys(empQualifications + Keys.ENTER);
	}

	public void enterEmpDateOfJoining(String empDateOfJoining) {
		getDriver().findElement(By.id(EMPLOYEE_DATE_OF_JOINING)).sendKeys(empDateOfJoining + Keys.ENTER);
	}

	public void enterEmpBloodGrp(String empbloodGrp) {
		getDriver().findElement(By.name(EMPLOYEE_BLOOD_GRP)).sendKeys(empbloodGrp + Keys.ENTER);
	}

	public void enterEmpFatherName(String empFatherName) {
		getDriver().findElement(By.name(EMPLOYEE_FATHER_NAME)).sendKeys(empFatherName + Keys.ENTER);
	}

	public void enterEmpHomePhone(String empHomePhone) {
		getDriver().findElement(By.id(EMP_HOME_PHONE_NO)).sendKeys(empHomePhone + Keys.ENTER);
	}

	public void enterEmpMailId(String empmailId) {
		getDriver().findElement(By.id(EMP_EMAIL_ID)).sendKeys(empmailId + Keys.ENTER);
	}

	public void selectEmpDeptName(String selDeptName) {
		WebElement selectDept = getDriver().findElement(By.id(EMPLOYEE_DEPTARTMENT));
		Select department1 = new Select(selectDept);
		department1.selectByVisibleText(selDeptName);
	}
	
	public void selectEmpDesignation(String selDesignation) {
		WebElement Designation = getDriver().findElement(By.name(EMP_DESIGNATION_ID));
		Select EmpDesignation = new Select(Designation);
		EmpDesignation.selectByValue(selDesignation);
	}
	public void selectEmpGrade (String selEmpGrade ) {
		WebElement grade = getDriver().findElement(By.id(EMP_DESG_GRADE_ID));
		Select gradeA = new Select(grade);
		gradeA.selectByVisibleText(selEmpGrade);
	}
	
	public void selectHireEmp (String selectHireEmp ) {
		WebElement hire = getDriver().findElement(By.id(HIRE_CONTRACT_DRIVER));
		Select hire1 = new Select(hire);
		hire1.selectByVisibleText(selectHireEmp);
	}
	
	public void selectEmpCompany (String selectEmpCompany ) {
		WebElement company = getDriver().findElement(By.id(EMP_COMPANY_ID));
		Select company1 = new Select(company);
		company1.selectByVisibleText(selectEmpCompany);
	}
	
	public void selectEmpactiveInd (String empActivestatus ) {
		WebElement activeStatus = getDriver().findElement(By.id(EMPLOYEE_ACTIVE_IND_STATUS));
		Select activeStatus1 = new Select(activeStatus);
		activeStatus1.selectByVisibleText(empActivestatus);
	}
	
	public void selectEmpVendorComp (String empVendorCompany ) {
		WebElement vendorComp = getDriver().findElement(By.id(EMPLOYEE_VENDOR_COMPANY));
		Select vendorCompany = new Select(vendorComp);
		vendorCompany.selectByVisibleText(empVendorCompany);
	}
	
	public void selectEmpUserPrivilage (  ) {
		WebElement checkBox = getDriver().findElement(By.id(CHECKBOX_USER_STATUS));
		boolean checkBox1 = checkBox.isSelected();
		System.out.print(checkBox1 + "checkBox-------------------------->>>>>>>>>");
	}
	
	public void enterUserName(String empUserName) {
		getDriver().findElement(By.id(EMPLOYEE_USER_NAME)).sendKeys(empUserName + Keys.ENTER);
	}
	
	public void enterEmpPassword(String empPassword) {
		getDriver().findElement(By.id(EMPLOYEE_PASSWORD)).sendKeys(empPassword + Keys.ENTER);
	}
	
	public void selectEmpRole (String empRole ) {
		WebElement employeeRole = getDriver().findElement(By.id("roleId"));
		Select employeeRole1 = new Select(employeeRole);
		employeeRole1.selectByValue(empRole);
	}
	//
	public void enterEmpAddress(String empAddress) {
		getDriver().findElement(By.id(EMPLOYEE_ADDRESS)).sendKeys(empAddress + Keys.ENTER);
	}
	
	public void enterEmpCity(String empCity) {
		getDriver().findElement(By.id(EMPLOYEE_CITY)).sendKeys(empCity + Keys.ENTER);
	}
	
	public void enterEmpState(String empState) {
		getDriver().findElement(By.id(EMPLOYEE_STATE)).sendKeys(empState + Keys.ENTER);
	}
	
	public void enterEmpPincode(String employeePincode) {
		getDriver().findElement(By.id(EMPLOYEE_PINCODE)).sendKeys(employeePincode + Keys.ENTER);
	}
	
	public void fillEmployeeDetails (ManufacturerDetailsTO emp) {
		enterEmployeeName(emp.getEmployeeName());
		enterEmployeeId(emp.getEmployeeId());
		enterEmployeeDob(emp.getEmployeeDob());
		selectEmployeeGender(emp.getEmployeeGender());
		selectEmpMaritalStatus(emp.getEmpMaritalStatus());
		enterEmployeeMobile(emp.getEmpMobile());
		enterEmpQualifications(emp.getEmpQualifications());
		enterEmpDateOfJoining(emp.getEmpDateOfJoining());
		enterEmpBloodGrp(emp.getEmpBloodGrp());
		enterEmpFatherName(emp.getEmpFatherName());
		enterEmpHomePhone(emp.getEmpHomePhone());
		enterEmpMailId(emp.getEmpMailId());
		selectEmpDeptName(emp.getEmpDeptName());
		selectEmpDesignation(emp.getSelDesignation());
		selectEmpGrade(emp.getSelectEmpGrade());
		selectHireEmp(emp.getSelectHireEmp());
		selectEmpactiveInd(emp.getSelectEmpactiveInd());
		selectEmpVendorComp(emp.getEmpvendorCompany());
		enterUserName(emp.getEmpUserName());
		enterEmpPassword(emp.getEmpPassword());
		selectEmpRole(emp.getEmpRole());
		enterEmpAddress(emp.getEmpAddress());
		enterEmpCity(emp.getEmpCity());
		enterEmpState(emp.getEmpState());
		enterEmpPincode(emp.getEmployeePincode());
	}


}
