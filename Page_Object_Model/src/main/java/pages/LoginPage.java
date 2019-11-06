package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
	
	//Page Factory - OR:
	@FindBy(name="txtUsername")
	WebElement Username;
	
	@FindBy(name="txtPassword")
	WebElement Password;
	
	@FindBy(id="btnLogin")
	WebElement LoginButton;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/img")
	WebElement HrmsLogo;
	
	//Initializing the Page Objects;
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
		
	}
	
	public boolean validateHrmsLogo(){
		return HrmsLogo.isDisplayed();
	}
	
	public HomePage Login(String un, String pw){
		Username.sendKeys(un);
		Password.sendKeys(pw);
		//loginBtn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", LoginButton);
		return new HomePage();
		
	}

}
