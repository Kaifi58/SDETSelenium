package org.sel.Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_3 {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.gecko.driver","C:\\Kaifi\\SDET_SeleniumTraining\\Driver\\geckodriver.exe");

	    WebDriver driver = new FirefoxDriver();
	    
	    //And now use this to visit the website
	    driver.get("https://www.training-support.net/selenium/simple-form");
	    
        //Find the page title and print it
		String pageTitle = driver.getTitle();
	    System.out.println(pageTitle);
	    
	    
        //Find the input fields
		
        WebElement firstName = driver.findElement(By.id("firstName"));
	
        WebElement lastName = driver.findElement(By.id("lastName"));
	
        //Enter text
	
        firstName.sendKeys("Kaifi");
	
        lastName.sendKeys("Ansari");
	
        
	
        //Enter the email
	
        driver.findElement(By.id("email")).sendKeys("test@example.com");
	
        
	
        //Enter the contact number
	
        driver.findElement(By.id("number")).sendKeys("1234567890");
	
        
	
        //Click Submit
	
        driver.findElement(By.cssSelector(".ui.green.button")).click();
	
    
	
        //Close the browser
	
        driver.close();
	    
	    
	}

}
