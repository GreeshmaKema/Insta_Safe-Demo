package com.Mohs10.TestScripts;

import org.testng.annotations.Test;

import com.Mohs10.Base.StartBrowser;
import com.Mohs10.Base.XLUtils;
import com.Mohs10.Functions.MO_Fun;

public class MO_Obs  extends StartBrowser {
	
	
	String excelFilePath = "C:\\Users\\Dell\\Downloads\\pAInITe_2024-main\\ExcelTestInputData\\TestData.xlsx";
	String excelsheet = "MamatvaMO";
//	String exsheet2 = "NegativeLogin";
	@Test(priority = 0)
	public void MO_Obspatients() throws Throwable {
		
		MO_Fun hm1 = new MO_Fun();

		String Email = XLUtils.getStringCellData(excelFilePath, excelsheet, 1, 0); 
		String Pwd = XLUtils.getStringCellData(excelFilePath, excelsheet, 1, 1);
		String searchbox1 = XLUtils.getStringCellData(excelFilePath, excelsheet, 1, 5);

		hm1.MO_Obspatients(Email, Pwd, searchbox1);
		Thread.sleep(5000);
		
		//ScreenRecorderUtil.stopRecord();
	}
}


