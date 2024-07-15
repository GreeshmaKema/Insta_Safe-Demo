package com.Mohs10.OR;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MO_OR {
	
WebDriver driver;
	
	
	
	//Login as MO
		public static By Email = By.xpath("//input[@id='email']");
		public static By Password = By.xpath("//input[@id='password']");
		public static By Loginbtn = By.xpath("//input[@value='LOGIN']");
		public static By Gynicpatients = By.xpath("//span[normalize-space()='Gynic Patient']");
		public static By Searchbox = By.xpath("//input[@id='searchInput']");
		public static By Visit = By.xpath("//tbody/tr[1]/td[6]/span[1]/a[1]");
		public static By View = By.xpath("//tbody/tr[1]/td[4]/span[1]/a[1]/i[1]");
		public static By Edit = By.xpath("//tbody/tr[4]/td[4]/span[2]/a[1]/i[1]");
		public static By MensturalHistory = By.xpath("//input[@name='menstrual_history']");
	    public static By Bloodpressure = By.xpath("//input[@id='bloodpressureInput']");
	    public static By Submitbtn = By.xpath("//button[@type='submit']");
	    
	    public static By Closebtn = By.xpath("//i[@class='fas fa-check-circle']");
		public static By btnyes = By.xpath("//button[normalize-space()='Yes']");
		public static By Cancel = By.xpath("//tbody/tr[2]/td[4]/span[3]/a[1]/i[1]");
		
		//Go t Obs Patients
		
		public static By obspatients = By.xpath("//span[normalize-space()='OBS Patient']");
		public static By searchbox1 = By.xpath("//input[@id='searchInput']");
		public static By visit1 = By.xpath("//tbody/tr[1]/td[6]/span[1]/a[1]");
		public static By View1 = By.xpath("//tbody/tr[1]/td[4]/span[1]/a[1]/i[1]");
/*		public static By Searchbox = By.xpath("//input[@id='searchInput']");
		public static By Visit = By.xpath("//tbody/tr[1]/td[6]/span[1]/a[1]");
		public static By View = By.xpath("//tbody/tr[1]/td[4]/span[1]/a[1]/i[1]");
		public static By Edit = By.xpath("//tbody/tr[1]/td[4]/span[2]/a[1]/i[1]");
		public static By MensturalHistory = By.xpath("//input[@name='menstrual_history']");
	    public static By Bloodpressure = By.xpath("//input[@id='bloodpressureInput']");
	    public static By Submitbtn = By.xpath("//button[@type='submit']");
	    
	    public static By Closebtn = By.xpath("//tbody/tr[1]/td[4]/span[3]/a[1]/i[1]");
		public static By btnyes = By.xpath("//button[normalize-space()='Yes']"); */
		
		public static By Logoutbtn = By.xpath("//span[normalize-space()='Logout']");
		
		
		//Superadmin
		
		
		public static By addlocation = By.xpath("//a[@href='/superadmin/Addlocation']");
		public static By location = By.xpath("//input[@id='location_name']");
		public static By submitbtn1 = By.xpath("//button[@id='submit_button']");
		public static By user = By.xpath("//a[@href='/superadmin/User']");
		public static By edit1 = By.xpath("//tbody/tr[1]/td[4]/span[1]/a[1]");
	    public static By name = By.xpath("//input[@id='patient_name']");
	    public static By submit2 =By.xpath("//button[@id='submit_button']");
	    
		
		
		
		
		
		
	    
		
		

}



