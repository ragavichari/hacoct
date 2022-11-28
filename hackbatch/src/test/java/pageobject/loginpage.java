package pageobject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.helper;

public class loginpage {
//public WebDriver ldriver;
//creating constructor
public loginpage(WebDriver webDriver) {
	
	PageFactory.initElements(webDriver,this);
}

@FindBy(xpath="//input[@id='username']")
WebElement user;
@FindBy(xpath="//input[@id='password']")
WebElement password;
@FindBy(xpath="//span[@class='mat-button-wrapper']")
WebElement loginbutton;
@FindBy(xpath="//mat-error[@class='mat-error ng-star-inserted']")
WebElement emptyusernpass;
@FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c78-0']")
WebElement emptyuser;
@FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c78-1']")
WebElement emptypass;
//public String URL="https://lms-frontend-phase2.herokuapp.com/login";

public void login() {
	loginbutton.click();
}
public void Setusername(String uname) {
	user.clear();
	user.sendKeys(uname);
}

public void Setpassword(String pwd) {
	password.clear();
	password.sendKeys(pwd);
	
}
public String validationmessageusern() 
	{
	return emptyuser.getText();
	
}
//public string alert() {
	
//}

public void emptyusnpass() {
	emptyusernpass.getText();
}
public String validationmessagepasswrd() {
	return emptypass.getText();
}
public void loginpage()
{
	String title=helper.getTitle();
			Assert.assertEquals(title,"LMS");	
}
}


