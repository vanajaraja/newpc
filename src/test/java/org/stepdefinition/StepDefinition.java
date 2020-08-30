package org.stepdefinition;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tcs.test.pojoclass.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends org.tcs.test.BaseClass.BaseClass {
	
	
		@Given("User hould be in login page")
	public void user_hould_be_in_login_page() {
		
	  browserLaunch();
	   getURL();
	   driver.get("https://www.titan.co.in/");
	   Alert alert = driver.switchTo().alert();
	   
	   alert.accept();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   LoginPojo l = new LoginPojo();
	   btnClick(l.getLnkLogin());
	}

	/*@When("Enter username and password")
	public void enter_username_and_password() throws InterruptedException {
		Thread.sleep(5000);
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='username']"));
		WebDriverWait w = new WebDriverWait(driver, 5000);
		w.until(ExpectedConditions.visibilityOf(txtUserName));
		
		Thread.sleep(5000);
		txtUserName.sendKeys("vanajasadasivam@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Singapore@12");
		
		driver.findElement(By.xpath("//div[text()='SIGN IN & CONTINUE']")).click(); 
		Thread.sleep(5000);
	}*/
	
	/*@When("Enter username {string} and password {string}")
	public void enter_username_and_password(String string, String string2) throws InterruptedException {
		Thread.sleep(5000);
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='username']"));
		
		txtUserName.sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		
		driver.findElement(By.xpath("//div[text()='SIGN IN & CONTINUE']")).click(); 
		Thread.sleep(5000);
	}*/
	
	@When("Enter username and password")
	public void enter_username_and_password(io.cucumber.datatable.DataTable dataTable ) throws InterruptedException {
	   List<String> credentials = dataTable.asList();
	   Thread.sleep(5000);
	   LoginPojo l = new LoginPojo();
	   textInput(l.getTxtUserName(), credentials.get(0));
	   Thread.sleep(5000);
	  textInput(l.getTxtPassword(), credentials.get(1)); 
	  Thread.sleep(5000);
	  btnClick(l.getBtnsingIn());
	}

	@Then("User should be navigated to Home page")
	public void user_should_be_navigated_to_Home_page() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue("Sign InSuccessful", driver.getTitle().contains("The Official Website"));
		driver.quit();
	}


	@Given("user should be in Search Page")
	public void user_should_be_in_Search_Page() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[@id='searchIcon']")).click();
		Thread.sleep(5000);
		
		
	   }

	@When("search for a product {string}")
	public void search_for_a_product(String string) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='searchTextBox']")).sendKeys(string);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(10000);
	}

	@Then("Prints the product cost")
	public void prints_the_product_cost() {
		WebElement firstProduct = driver.findElement(By.xpath("(//a[text()='Raga Mother of Pearl Dial Swarovski Studded Watch'])[1]"));
		firstProduct.click();
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		for (String windowId : allWindowId) {
			if (!(windowId.equals(parentWindowId)))
			{
				driver.switchTo().window(windowId);
			}
			
		}
		
			
	  
	}


}
