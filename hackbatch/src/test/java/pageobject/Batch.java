package pageobject;



	import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;

	import stepdefinition.Baseclass;
	import utility.helper;

	public class Batch extends Baseclass{
		//creating constructor
			public Batch(WebDriver webDriver)
			{
				
				PageFactory.initElements(webDriver,this);
			}
			@FindBy(xpath = "//div[text()='batch Deleted']")
			public WebElement Batchdeletesucessmsg;
			@FindBy(xpath = "//span[text()='Batch']")
			public WebElement BatchButton;
			@FindBy(xpath = "//mat-card-title[@class='mat-card-title']/div[text()=' Manage Batch']")
			public WebElement ManageBatchtitle;
			@FindBy(xpath = "//button[@class='p-button-danger p-button p-component p-button-icon-only']")
			public WebElement DeleteButton;
			@FindBy(xpath = "//input[@placeholder='Search...']")
			public WebElement searchbox;
			@FindBy(xpath = "//button[text()='2']")
			public WebElement rowsofdata2 ;
			@FindBy(xpath = "//span[text()=' LMS - Learning Management System ']")
			public WebElement lmshomepage ;
			//batchnamesearchbatch
			@FindBy(xpath = "//button[@class='p-button-rounded p-button-success p-button p-component p-button-icon-only']")
			public WebElement editbutton  ;
			@FindBy(xpath = "//label[@for='batchName']")
			public WebElement Batchdetailform  ;
			@FindBy(xpath = "//input[@id='batchName']")
			public WebElement editName  ;
			@FindBy(xpath = "//input[@class='p-inputtext p-component p-filled ng-untouched ng-pristine ng-valid']")
			public WebElement editdescription  ;
			@FindBy(xpath = "//input[@placeholder='Select a Program name']")
			public WebElement editprogramname  ;
			@FindBy(xpath = "//p-radiobutton[@ng-reflect-input-id='ACTIVE']")
			public WebElement statusactive  ;
			@FindBy(xpath = "//p-radiobutton[@ng-reflect-input-id='INACTIVE']")
			public WebElement statusinactive  ;
			@FindBy(xpath = "//input[@id='batchNoOfClasses']")
			public WebElement editnoofclasses  ;
			@FindBy(xpath = "//button[@ng-reflect-label='Cancel']")
			public WebElement batchdetailformcancel  ;
			@FindBy(xpath = "//button[@ng-reflect-label='Save']")
			public WebElement batchdetailformsave  ;
			@FindBy(xpath = "//div[@class='p-checkbox-box p-component']")
			public WebElement batchgetsslectedcheckbox ;
			
			//14th line User searches with newly updated "Batch Name"
			@FindBy(xpath = "(//div[@role='checkbox'])[3]")
			public WebElement checkboxbatchpage  ;
			@FindBy(xpath = "//span[@class='p-checkbox-icon pi pi-check']")
			public WebElement checkboxbatchpage2  ;
			//multipledeleteyes
			@FindBy(xpath = "//span[text()='Yes']")
			public WebElement multipledelteconfirmyes  ;
			@FindBy(xpath = "//span[text()='Yes']")
			public WebElement multipledelteconfirm  ;
			@FindBy(xpath = "//span[text()='No']")
			public WebElement multipledelteconfirmno  ;
			@FindBy(xpath = "//span[text()='Confirm']")
			public WebElement multipledelteformlandpage ;
			
			///@FindBy(xpath = "//button[@ng-reflect-label='No']")
			public WebElement deletedsearchbatchname  ;
			@FindBy(xpath = "//td[text()='BatchName']")
			public WebElement editedbatchname  ;
			String URL="https://lms-frontend-phase2.herokuapp.com/login";
			//delete batch
			@FindBy(xpath = "(//button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only'])[1]")
			public WebElement detelebutton  ;
			@FindBy(xpath = "//span[text()='Yes']")
			public WebElement deteleconfirmyes  ;
			@FindBy(xpath = "//button[@ng-reflect-label='No']")
			public WebElement deteleconfirmno  ;
			@FindBy(xpath = "//button[@ng-reflect-label='No']")
			public WebElement detelepopup  ;
			//
			@FindBy(xpath = "//button[@ng-reflect-label='A New Batch']")
			public WebElement addnewbatchbutton  ;
			@FindBy(xpath = "//small[@class='p-invalid ng-star-inserted']")
			public WebElement namereq  ;
			@FindBy(xpath = "//span[text()='Save']")
			public WebElement addnewbatchsave  ;
			@FindBy(xpath = "//button[@ng-reflect-label='Cancel']")
			public WebElement addnewbatchcancel  ;
			@FindBy(xpath = "//input[@id='batchName']")
			public WebElement addnewbatchentername  ;
			@FindBy(xpath = "//input[@id='batchDescription']	")
			public WebElement addnewbatchenterdescription  ;
			@FindBy(xpath = "//input[@placeholder='Select a Program name']	")
			public WebElement addnewbatchdropdownprog  ;
			@FindBy(xpath = "//p-radiobutton[@ng-reflect-value='ACTIVE']	")
			public WebElement addnewbatchactive ;
			@FindBy(xpath = "//p-radiobutton[@ng-reflect-value='INACTIVE']	")
			public WebElement addnewbatchinactive ;
			@FindBy(xpath = "//input[@id='batchNoOfClasses']	")
			public WebElement addnewbatchnoofclass ;
			@FindBy(xpath = "//button[@ng-reflect-label='Save']	")
			public WebElement newbatchaddedsave ;
			//pagination
			@FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-right']	")
			public WebElement paginationrightangle ;
			@FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-left']	")
			public WebElement paginationleftangle ;
			@FindBy(xpath = "//button[@class='p-paginator-next p-paginator-element p-link p-ripple p-disabled']	")
			public WebElement paginationverifynext ;
			@FindBy(xpath = "//button[@class='p-paginator-page p-paginator-element p-link p-highlight p-ripple ng-star-inserted']	")
			public WebElement lastpage7 ;
			@FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-double-right']	")
			public WebElement nanigatelastpage8 ;

			//ascending
			@FindBy(xpath = "//th[text()='Batch Name ']	")
			public WebElement ascendingarrowbatchname ;
			@FindBy(xpath = "//th[text()='Batch Description ']	")
			public WebElement ascendingarrowbatchdescription ;
			@FindBy(xpath = "//th[text()='Batch Status ']	")
			public WebElement ascendingarrowbatchstatus ;
			@FindBy(xpath = "//th[text()='No Of Classes ']	")
			public WebElement ascendingarrowbatchnoofclass ;
			@FindBy(xpath = "//th[text()='Program Name ']	")
			public WebElement ascendingarrowbatchprogramname ;
			//descending
			@FindBy(xpath = "//th[@psortablecolumn='batchName']")
			public WebElement descendingarrowbatchname ;
			@FindBy(xpath = "//th[@psortablecolumn='batchDescription']	")
			public WebElement descendingarrowbatchdescription ;
			@FindBy(xpath = "//th[@psortablecolumn='batchStatus']	")
			public WebElement descendingarrowbatchstatus ;
			@FindBy(xpath = "//th[@psortablecolumn='batchNoOfClasses']	")
			public WebElement descendingarrowbatchnoofclasses ;
			@FindBy(xpath = "//th[@psortablecolumn='programName']	")
			public WebElement descendingarrowbatchprogname ;
			@FindBy(xpath = "//div[text()='Successful']	")
			public WebElement sucessfull ;
			@FindBy(xpath = "//span[text()='Showing 0 to 0 of 0 entries']")
			public WebElement deletesearchdgdgresult ;
			
			public void sucess() throws InterruptedException {
				
				sucessfull.isDisplayed();
				
			}
public void sucessdele() throws InterruptedException {
				
				Batchdeletesucessmsg.isDisplayed();
				
			}
			
			
			public void verifyTitle() {
		
		String title1 = helper.getTitle();
		Assert.assertEquals(title1, "Manage Batch");
	}
			public void deletesearchdgdgresult() {
				BatchButton.click();
			}
	public void batchbuttonclick() {
		BatchButton.click();
	}
	public void onbatchpage() {
		ManageBatchtitle.isDisplayed();
	}
	public void onlmshomepage() {
		lmshomepage.isDisplayed();
	}
	public void multdelconfirmpage() throws InterruptedException {
		Thread.sleep(1000);
		
		multipledelteconfirm.isDisplayed();
		
	}

	public Boolean DeleteDisabled() {
		boolean actualvalue=DeleteButton.isEnabled();
		if(actualvalue) {
			System.out.println("Button is enabled");
		}
			else {
				System.out.println("Button is disabled");
		}
		return actualvalue;
	}
	public void verifyrow2() {
		rowsofdata2.isDisplayed();
	}
	public void verifyrow2(String row) {
		rowsofdata2.sendKeys(String.valueOf(5));
	}
	public void searchBatchname(String bname) {
		searchbox.click();
		searchbox.sendKeys(bname);
	}
	public void batchgetsselected() {
		batchgetsslectedcheckbox.isDisplayed();
	}
	public void editbutton() {
		editbutton.click();
	}
	public void editbatchname(String BatchName) {
		editName.clear();
		editName.sendKeys(BatchName);
		
	}
	public void editedbatchname() {
		
		editedbatchname.isDisplayed();
		
	}
	public void editedbatchprogname() {
		
		editprogramname.isDisplayed();
		
	}
	public void editbatchdescribtion(String editbatchdescrib) {
		editdescription.clear();
		editdescription.sendKeys(editbatchdescrib);
	}
	public void editeddescripname() {
		
		editdescription.isDisplayed();
		
	}
	public void editprogname(String editbatchprogname) {
		editprogramname.clear();
		editprogramname.sendKeys(editbatchprogname);
	}
	public Boolean changestatus() throws InterruptedException {
		boolean result=statusinactive.isSelected();
		if( result==false) {
			statusinactive.click();
			Thread.sleep(1000);
		}
		return result;
	}
	public void changedstatus() {
		statusinactive.isDisplayed();
	}
		public void editbatchclass(String noofclassedit) {
			editnoofclasses.clear();
			editnoofclasses.sendKeys(String.valueOf(10));
		}
		public void editedclasses() {
			editnoofclasses.isDisplayed();
		}
		public void cancelbatch() {
			batchdetailformcancel.click();
		}
	public void batchform() {
		Batchdetailform.isDisplayed();
	}

	public void batchformsave() {
		batchdetailformsave.click();
	}
	//14not
	public void checkbox() throws InterruptedException {
		Thread.sleep(1000);
		checkboxbatchpage.click();
		Thread.sleep(1000);
		checkboxbatchpage2.click();
		Thread.sleep(1000);
	}
	public void multipledelete() throws InterruptedException {
		DeleteButton.click();
		Thread.sleep(1000);
	}
	public void multipledeleteconfirm() throws InterruptedException {
		Thread.sleep(1000);
		multipledelteconfirm.isDisplayed();
	}
	public void multipledeleteyes() {
		multipledelteconfirmyes.click();
	}
	public void searchdeletedbatchname(String dgdg) {
		searchbox.click();
		searchbox.sendKeys(dgdg);
		
	}
	public void multipledeleteno() {
		multipledelteconfirmno.click();
	}
	public void deleteanybatch() {
		detelebutton.click();
	}
	public void deleteanybatchpopup() {
		detelepopup.click();
	}
	public void deleteanybatchyes() throws InterruptedException {
		deteleconfirmyes.click();
		Thread.sleep(1000);
	}
	//selete anathter deletebutton but xpath same for all
	public void deleteanybatchno() {
		deteleconfirmno.click();
	}
	public void deletesearch(String dgdg) {
		searchbox.click();
		searchbox.sendKeys(dgdg);
		
	}
	public void addnewbatch() {
		addnewbatchbutton.click();
		
	}
	public void addnewbatchsavenotentering() {
		addnewbatchsave.click();
		
	}
	public void addnewbatchnamerequired() {
		namereq.click();
		
	}
	public void addnewbatchcancelnotentering() {
		addnewbatchcancel.click();
		
	}	
	public void addnewbatchenterbatchname(String BatchName) {
		addnewbatchentername.sendKeys(BatchName);
		
	}	
	public void addnewbatchenterdescrip(String enterbdescrip) {
		addnewbatchentername.sendKeys(enterbdescrip);
		
	}
	public void addnewbatchenterprogname(String enterbprogn) {
		addnewbatchdropdownprog.sendKeys(enterbprogn);
		
	}
	public void changestatusaddnewbatch() {
			statusactive.click();
		}
	public void addnewbatchNoofclass(String noofclass) {
		addnewbatchnoofclass.sendKeys(noofclass);
	}
	public void addnewbatchsave() {
		addnewbatchsave.click();
	}
	public void newbatchsearch(String enterbname) {
		searchbox.click();
		searchbox.sendKeys(enterbname);
		
	}
	//pagination
	public void managebatchpage() {
		ManageBatchtitle.isDisplayed();	
		
	}
	public void navigatenext() {
		paginationrightangle.click();
	}
	public boolean navigateprevious() {
		//paginationleftangle.click();
		boolean value=paginationleftangle.isEnabled();
		if(value) {
			System.out.println("Button is enabled");
		}
			else {
				System.out.println("Button is disabled");
		}
		return value;
	}
	public boolean navigatelastpage() {
		//paginationverifynext.click();
		boolean val=paginationrightangle.isEnabled();
		if(val) {
			System.out.println("Button is enabled");
		}
			else {
				System.out.println("Button is disabled");
		}
		return val;
	}
	public void lastpage() throws InterruptedException {
		Thread.sleep(2000);
		nanigatelastpage8.click();
		Thread.sleep(2000);
		
		lastpage7.click();
	}
	//ascending
	public void ascendingbatchname() {
		ascendingarrowbatchname.click();
	}
	public void ascendingbatchdesc() {
		ascendingarrowbatchdescription.click();
	}
	public void ascendingbatchstatus() {
		ascendingarrowbatchstatus.click();
	}
	public void ascendingbatchnoofclass() {
		ascendingarrowbatchnoofclass.click();
	}
	public void ascendingbatchprogname() {
		ascendingarrowbatchprogramname.click();
	}
	//
	public void descendingbatchname() {
		descendingarrowbatchname.click();
	}
	public void descendingbatchdesc() {
		descendingarrowbatchdescription.click();
	}
	public void descendingbatchstatus() {
		descendingarrowbatchstatus.click();
	}
	public void descendingbatchnoofclass() {
		descendingarrowbatchnoofclasses.click();
	}
	public void descendingbatchprogname() {
		descendingarrowbatchprogname.click();
	}
	}


