package com.Mohs10.TestScripts;

import org.testng.annotations.Test;

import com.Mohs10.Base.StartBrowser;
import com.Mohs10.Base.XLUtils;
import com.Mohs10.Functions.MO_Fun;


public class MO_Scripts extends StartBrowser {

	
	

		
		String excelFilePath = "C:\\Users\\Dell\\Downloads\\pAInITe_2024-main\\ExcelTestInputData\\TestData.xlsx";
		String excelsheet = "MamatvaMO";
		
		
		

		  @Test(priority = 0)
		    public void Mamatva_MO() throws Exception 
		    {
			  MO_Fun hm1 = new MO_Fun();
			 String Email = XLUtils.getStringCellData(excelFilePath, excelsheet, 1, 0);
			  
	          String Password = XLUtils.getStringCellData(excelFilePath, excelsheet, 1, 1);
	          String searchbox = XLUtils.getStringCellData(excelFilePath, excelsheet, 1, 2);
		        hm1.MO_Login1(Email, Password, searchbox);
		          
		            Thread.sleep(7000);
		    }
		  
		//  @Test(priority = 1)
		    public void MO_Edit() throws Exception 
		    {
			  MO_Fun hm1 = new MO_Fun();
			 String Email = XLUtils.getStringCellData(excelFilePath, excelsheet, 1, 0);
			  
	          String Password = XLUtils.getStringCellData(excelFilePath, excelsheet, 1, 1);
	          String searchbox = XLUtils.getStringCellData(excelFilePath, excelsheet, 1, 2);
	          String MensutralHistory = XLUtils.getStringCellData(excelFilePath, excelsheet, 1, 3);
	          String Bloodpressure = XLUtils.getStringCellData(excelFilePath, excelsheet, 1, 4);
		        hm1.MO_Edit(Email, Password, searchbox, MensutralHistory, Bloodpressure);
		          
		            Thread.sleep(7000);
		    }
	}


