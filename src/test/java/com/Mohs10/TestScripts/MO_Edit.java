package com.Mohs10.TestScripts;

import org.testng.annotations.Test;

import com.Mohs10.Base.StartBrowser;
import com.Mohs10.Base.XLUtils;
import com.Mohs10.Functions.MO_Fun;

public class MO_Edit extends StartBrowser {

	String excelFilePath = "C:\\Users\\Dell\\Downloads\\pAInITe_2024-main\\ExcelTestInputData\\TestData.xlsx";
	String excelsheet = "MamatvaMO";

    public MO_Edit() {
        // Constructor should not contain test logic
    }

    @Test(priority = 0)
    public void testMO_Edit() throws Exception {
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

