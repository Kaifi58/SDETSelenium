package org.sel.Activity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        //Create a new instance of the Firefox driver
    	System.setProperty("webdriver.gecko.driver","C:\\Kaifi\\SDET_SeleniumTraining\\Driver\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("http://www.training-support.net");
        
        //Perform testing and assertions
     

        //Close the browser
        driver.close();
    }
}