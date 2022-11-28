package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import stepdefinition.Baseclass;
import utility.helper;


	public class home extends Baseclass {
		
		//creating constructor
		public home(WebDriver webDriver)
		{
			
			PageFactory.initElements(webDriver,this);
		}
		
		
		
		@FindBy(xpath = "//input[@id='username']")
		public WebElement UserName;
		@FindBy(xpath = "//input[@id='password']")
		public WebElement Password;
		@FindBy(xpath = "//span[@class='mat-button-wrapper']")
		public WebElement LoginBn;
		
		@FindBy(xpath = "//button[1]/span[@class='mat-button-wrapper']")
		public WebElement ProgramHeader;
		
		@FindBy(xpath = "//button[2]/span[@class='mat-button-wrapper']")
		public WebElement BatchHeader;
		
		@FindBy(xpath = "//button[3]/span[@class='mat-button-wrapper']")
		public WebElement UserHeader;
		
		@FindBy(xpath = "//button[4]/span[@class='mat-button-wrapper']")
		public WebElement AssignmentHeader;
		
		@FindBy(xpath = "//button[5]/span[@class='mat-button-wrapper']")
		public WebElement AttendanceHeader;
		
		@FindBy(xpath = "//button[6]/span[@class='mat-button-wrapper']")
		public WebElement LogoutHeader;
		
		public void checkTitle() {
			String title = helper.getTitle();
			Assert.assertEquals(title, "LMS");
		}
		
		public void checkProgramHeader()
		{
			Assert.assertTrue(ProgramHeader.isDisplayed());
		}
		public void checkBatchHeader()
		{
			Assert.assertTrue(BatchHeader.isDisplayed());
		}
		public void checkUserHeader()
		{
			Assert.assertTrue(UserHeader.isDisplayed());
		}
		public void checkAssignmentHeader()
		{
			Assert.assertTrue(AssignmentHeader.isDisplayed());
		}
		public void checkAttendanceHeader()
		{
			Assert.assertTrue(AttendanceHeader.isDisplayed());
		}
		public void checkLogoutHeader()
		{
			
			Assert.assertTrue(LogoutHeader.isDisplayed());
		}

		
	}


