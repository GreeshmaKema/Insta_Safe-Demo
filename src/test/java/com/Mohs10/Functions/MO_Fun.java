package com.Mohs10.Functions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Mohs10.Base.Action;
import com.Mohs10.Base.PropertyFile;
import com.Mohs10.Base.StartBrowser;
import com.Mohs10.OR.MO_OR;
import com.Mohs10.OR.MamatvaProd_OR;

public class MO_Fun {

	
	public static Action aDriver;
    public WebDriver driver;
    public String appUrl; // Declare appUrl as a class member variable

    public MO_Fun() {
        
    	aDriver = new Action();
		driver = StartBrowser.driver;
		
		// Initialize appUrl in the constructor
       try {
            appUrl = PropertyFile.getValueForKey("url");
        } catch (Throwable e) {
            e.printStackTrace();
        } 
	}


    // *****************************************************Textbooks Script*******************************************************//
    
    
    public void MO_Login1(String email, String password, String searchbox) throws Exception {
        StartBrowser.childTest = StartBrowser.parentTest.createNode("Medical officer Page");
        aDriver.navigateToApplication("http://mamatvaqa-env-1.eba-v3uh2bfv.ap-south-1.elasticbeanstalk.com/");
        aDriver.type(MO_OR.Email, email, "type email");
        Thread.sleep(4000);
        
        aDriver.type(MO_OR.Password, password, "type password");
        Thread.sleep(4000);
        
        aDriver.click(MO_OR.Loginbtn, "click on login btn");
        Thread.sleep(4000);
        aDriver.click(MO_OR.Gynicpatients,"click on gynic patients");
        aDriver.type(MO_OR.Searchbox, searchbox, "type a gynic patient name");
        Thread.sleep(2000);
        aDriver.click(MO_OR.Visit, "click on visit ");
        Thread.sleep(4000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(1070, 595)");
        aDriver.click(MO_OR.View, "click on view icon");
        
        aDriver.click(MO_OR.Logoutbtn, "click on logout btn");
        Thread.sleep(2000);
        
    }
    
    public void MO_Edit(String email, String password, String searchbox, String MensturalHistory, String Bloodpressure) throws Exception {
        StartBrowser.childTest = StartBrowser.parentTest.createNode("Medical officer Page");
        aDriver.navigateToApplication("http://mamatvaqa-env-1.eba-v3uh2bfv.ap-south-1.elasticbeanstalk.com/");
        aDriver.type(MO_OR.Email, email, "type email");
        Thread.sleep(2000);
        
        aDriver.type(MO_OR.Password, password, "type password");
        Thread.sleep(2000);
        
        aDriver.click(MO_OR.Loginbtn, "click on login btn");
        Thread.sleep(2000);
        aDriver.click(MO_OR.Gynicpatients,"click on gynic patients");
        aDriver.type(MO_OR.Searchbox, searchbox, "type a gynic patient name");
        Thread.sleep(2000);
        aDriver.click(MO_OR.Visit, "click on visit ");
        
     // Wait for the Edit icon to be clickable and scroll into view
        WebDriverWait wait = new WebDriverWait(aDriver.getDriver(), Duration.ofSeconds(10));
        WebElement editIcon = wait.until(ExpectedConditions.elementToBeClickable(MO_OR.Edit));
        ((JavascriptExecutor) aDriver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", editIcon);
        Thread.sleep(500); // Give time for scrolling
        editIcon.click();
        
        // Scroll to and interact with the MensturalHistory field
        WebElement menstrualHistoryField = wait.until(ExpectedConditions.elementToBeClickable(MO_OR.MensturalHistory));
        ((JavascriptExecutor) aDriver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", menstrualHistoryField);
        menstrualHistoryField.click();
        aDriver.type(MO_OR.MensturalHistory, MensturalHistory, "type menstrual history");
        Thread.sleep(2000);
        aDriver.type(MO_OR.Bloodpressure, Bloodpressure, "type Bloodpressure");
        
        Thread.sleep(4000);

        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(MO_OR.Submitbtn));
        ((JavascriptExecutor) aDriver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", submitButton);
        submitButton.click();

       
        aDriver.click(MO_OR.Logoutbtn, "click on logout btn");
    
    


	
	
	
    }
    
    public void MO_Close(String email, String password, String searchbox) throws Throwable {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to MO");

	    // Navigate to the application using the URL from the properties
	    aDriver.navigateToApplication("http://mamatvaqa-env-1.eba-v3uh2bfv.ap-south-1.elasticbeanstalk.com/");

		
	    aDriver.type(MO_OR.Email, email, "type email");
        Thread.sleep(4000);
        
        aDriver.type(MO_OR.Password, password, "type password");
        Thread.sleep(4000);
        
        aDriver.click(MO_OR.Loginbtn, "click on login btn");
        Thread.sleep(4000);
		aDriver.click(MO_OR.Gynicpatients, "Click on Gynic Patient");
		Thread.sleep(2000);
		aDriver.type(MO_OR.Searchbox,searchbox, "Type the name");
		Thread.sleep(2000);
		aDriver.click(MO_OR.Visit, "Click on visit");
		Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(1080, 597)");
		aDriver.click(MO_OR.Closebtn, "Click on Close button");
		Thread.sleep(2000);
		aDriver.click(MO_OR.Cancel, "Click on cancel");
		Thread.sleep(2000);
		 aDriver.click(MO_OR.Logoutbtn, "click on logout btn");
	}
    
    public void MO_Obspatients(String email, String password, String searchbox1) throws Throwable {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to MO");

	    // Navigate to the application using the URL from the properties
	    aDriver.navigateToApplication("http://mamatvaqa-env-1.eba-v3uh2bfv.ap-south-1.elasticbeanstalk.com/");

		
	    aDriver.type(MO_OR.Email, email, "type email");
        Thread.sleep(4000);
        
        aDriver.type(MO_OR.Password, password, "type password");
        Thread.sleep(4000);
        
        aDriver.click(MO_OR.Loginbtn, "click on login btn");
        Thread.sleep(4000);
		aDriver.click(MO_OR.obspatients,  "Click on Obs Patient");
		Thread.sleep(2000);
		aDriver.type(MO_OR.searchbox1,searchbox1, "Type the patient name");
		Thread.sleep(2000);
		aDriver.click(MO_OR.visit1, "Click on Visit button");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(1070, 595)");
		aDriver.click(MO_OR.View1, "Click on view icon");
		Thread.sleep(4000);
		//aDriver.click(MO_OR.btnyes, "Logout link");
		 aDriver.click(MO_OR.Logoutbtn, "click on logout btn");
	}
    
    //addlocation
    
    
    public void superadmin(String email, String password, String location) throws Throwable {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to MO");

	    // Navigate to the application using the URL from the properties
	    aDriver.navigateToApplication("http://mamatvaqa-env-1.eba-v3uh2bfv.ap-south-1.elasticbeanstalk.com/");

		
	    aDriver.type(MO_OR.Email, email, "type email");
        Thread.sleep(4000);
        
        aDriver.type(MO_OR.Password, password, "type password");
        Thread.sleep(4000);
        
        aDriver.click(MO_OR.Loginbtn, "click on login btn");
        Thread.sleep(4000);
		aDriver.click(MO_OR.addlocation,  "Click on Add LOcatiopn");
		Thread.sleep(2000);
		aDriver.type(MO_OR.location,location, "Type the location name");
		Thread.sleep(2000);
		aDriver.click(MO_OR.submitbtn1, "click on submit btn");
		aDriver.click(MO_OR.Logoutbtn, "click on logout btn");
		

}
    
    
    //edituser 
    public void superadmin_edit(String email, String password, String name) throws Throwable {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to MO");

	    // Navigate to the application using the URL from the properties
	    aDriver.navigateToApplication("http://mamatvaqa-env-1.eba-v3uh2bfv.ap-south-1.elasticbeanstalk.com/");

		
	    aDriver.type(MO_OR.Email, email, "type email");
        Thread.sleep(4000);
        
        aDriver.type(MO_OR.Password, password, "type password");
        Thread.sleep(4000);
        
        aDriver.click(MO_OR.Loginbtn, "click on login btn");
        Thread.sleep(4000);
		aDriver.click(MO_OR.user,  "Click on user ");
		Thread.sleep(2000);
		aDriver.click(MO_OR.edit1,  "Click on edit button");
		aDriver.type(MO_OR.name,name, "Type the name");
		Thread.sleep(2000);
		aDriver.click(MO_OR.submit2, "click on submit btn");
		aDriver.click(MO_OR.Logoutbtn, "click on logout btn");
		

}
    
    
    
}

