package com.Mohs10.TestScripts;

import org.testng.annotations.Test;

import com.Mohs10.Base.StartBrowser;
import com.Mohs10.Base.XLUtils;
import com.Mohs10.Functions.MO_Fun;

public class Superadmin   extends StartBrowser {
	
	
	String excelFilePath = "C:\\Users\\Dell\\Downloads\\pAInITe_2024-main\\ExcelTestInputData\\TestData.xlsx";
	String excelsheet = "MamatvaMO";
//	String exsheet2 = "NegativeLogin";
	@Test(priority = 0)
	public void superadmin() throws Throwable {
		
		MO_Fun hm1 = new MO_Fun();

		String Email = XLUtils.getStringCellData(excelFilePath, excelsheet, 2, 0); 
		String Pwd = XLUtils.getStringCellData(excelFilePath, excelsheet, 2, 1);
		String location = XLUtils.getStringCellData(excelFilePath, excelsheet, 1, 6);

		hm1.superadmin(Email, Pwd, location);
		Thread.sleep(5000);
		
		//ScreenRecorderUtil.stopRecord();
	}

}
