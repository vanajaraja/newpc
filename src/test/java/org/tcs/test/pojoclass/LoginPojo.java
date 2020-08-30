package org.tcs.test.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.tcs.test.BaseClass.BaseClass;

public class LoginPojo extends BaseClass{
	
	public LoginPojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBys (
	{ @FindBy(id="loginPath"),
		@FindBy(xpath="//*[@id='loginPath']")
	})
	private WebElement lnkLogin;
	
	@FindBy (xpath="//input[@id='username']")
	private WebElement txtUserName;
	
	@FindBy (id ="password")
	private WebElement txtPassword;
	
	@FindBy(xpath="//div[text()='SIGN IN & CONTINUE']")
	private WebElement btnsingIn;

	public WebElement getLnkLogin() {
		return lnkLogin;
	}

	public void setLnkLogin(WebElement lnkLogin) {
		this.lnkLogin = lnkLogin;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public void setTxtUserName(WebElement txtUserName) {
		this.txtUserName = txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(WebElement txtPassword) {
		this.txtPassword = txtPassword;
	}

	public WebElement getBtnsingIn() {
		return btnsingIn;
	}

	public void setBtnsingIn(WebElement btnsingIn) {
		this.btnsingIn = btnsingIn;
	}
	
	
	

}
