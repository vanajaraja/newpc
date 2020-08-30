package org.tcs.test.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJAPPA\\Desktop\\JavaPractise\\LogInSam\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	public static void getURL() {
		driver.getCurrentUrl();

	}
	
	public static void btnClick(WebElement e) {
		e.click();
	}
	
	public static  void textInput(WebElement e, String text) {
	e.sendKeys(text);

	}
	
	
}
