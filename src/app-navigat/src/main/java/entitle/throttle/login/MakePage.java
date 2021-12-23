package entitle.throttle.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import entitle.throttle.AbstractPage;

public class MakePage extends AbstractPage {

	private static final String CLICK_TRAILER_MFR = "trailerMfr";
	private static final String EDIT_NAMES = "names";
	private static final String EDIT_INPUT_STATUS = "editstatus";
	private static final String EDIT_GROUP_ID = "editgroupId";
	private static final String STRING_DESCRIPTIONS = "descriptions";
	private static final String EDIT_INPUT_DESCRIPTION = "description1";
	private static final String TEXTBOX_MFR_NAMES = "mfrNames";
	private static final String EDIT1 = "edit1";
	private static final String VEHICLE_MFR = "vehicleMfr";
	private static final String DROUPDOWN_STATUS = "status";
	private static final String DROPDOWN_GROUPID = "groupId";
	private static final String TEXTBOX_DESCRIPTION = "description";
	private static final String TEXTBOX_MFR_NAME = "mfrName";

	public MakePage(WebDriver driver) {
		super(driver);
	}

	public void typeManufacturer(String name) {
		getDriver().findElement(By.id(TEXTBOX_MFR_NAME)).sendKeys(name + Keys.ENTER);
	}

	public void typeDescription(String desc) {
		getDriver().findElement(By.id(TEXTBOX_DESCRIPTION)).sendKeys(desc + Keys.ENTER);

	}

	public void selectActivityGroup(String status) {
		WebElement activityGroup = getDriver().findElement(By.id(DROPDOWN_GROUPID));
		Select select = new Select(activityGroup);
		select.selectByVisibleText(status);
	}

	public void selectStatusBar(String statusId) {
		WebElement StatusBar = getDriver().findElement(By.name(DROUPDOWN_STATUS));
		Select selected = new Select(StatusBar);
		selected.selectByVisibleText(statusId);
	}

	public void selectTruck(String editStatus) {
		getDriver().findElement(By.name(VEHICLE_MFR)).sendKeys(editStatus + Keys.ENTER);
	}

	public void selectEdit(String edit) {
		WebElement Edit = getDriver().findElement(By.id(EDIT1));
		Edit.click();
	}

	public void selectAppendBox(String editAppendBox) {
		WebElement AppendBox = getDriver().findElement(By.id(TEXTBOX_MFR_NAMES));
		AppendBox.sendKeys(EDIT_NAMES);
	}

	public void selectGetTextBox(String editGetTextBox) {
		WebElement GetTextBox = getDriver().findElement(By.id(EDIT_INPUT_DESCRIPTION));
		String descriptions = GetTextBox.getAttribute(STRING_DESCRIPTIONS);
//		descriptions.selectByVisibleText(editGetTextBox);
	}
	
	public void editActivityGroup(String editActivity) {
		WebElement editActivityGroup = getDriver().findElement(By.id(EDIT_GROUP_ID));
		Select selectText = new Select(editActivityGroup);
		selectText.selectByVisibleText(editActivity);
	}
	
	public void editStatusId(String editstatusId) {
		WebElement editStatus = getDriver().findElement(By.name(EDIT_INPUT_STATUS));
		Select selected = new Select(editStatus);
		selected.selectByVisibleText(editstatusId);
	}
	
	public void selectSta(String editsta) {
		WebElement stat = getDriver().findElement(By.name(DROUPDOWN_STATUS));
		Select selected = new Select(stat);
		selected.selectByVisibleText(editsta);
	}
	
	public void editDescription(String descName) {
		getDriver().findElement(By.name(CLICK_TRAILER_MFR)).sendKeys(descName + Keys.ENTER);
	}
	
		
	public void fillManufacturerDetails(ManufacturerDetailsTO input) {
		typeManufacturer(input.getName());
		typeDescription(input.getDesc());
		selectActivityGroup(input.getActivityGroup());
		selectStatusBar(input.getStatus());
		selectEdit(input.getTrailer());
		selectAppendBox(input.getAppendBox());
		selectGetTextBox(input.getEditAppendBox());
		editDescription(input.getEditDescription());
	}

}
