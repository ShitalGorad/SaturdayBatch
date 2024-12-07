package com.KDF;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageObjectModel.FrontAccountingRepoEWithPageFactory;

public class FrontAccounting {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		FrontAccountingRepoEWithPageFactory r = new FrontAccountingRepoEWithPageFactory(w);
		w.get("https://demo.frontaccounting.eu/index.php");
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Shital\\Front Accounting1.xlsx");
		XSSFWorkbook work =new XSSFWorkbook(fis);
		XSSFSheet Sheet1 =work.getSheet("Sheet1");
		for (int i =1 ;i<=4;i++ ) {
			XSSFRow row =Sheet1.getRow(i);
			XSSFCell teststep =row.getCell(0);
			
			if (teststep.toString().equals("Login")) {
				r.loginclear();
				r.EnterLoginData();
				r.login();
				
			} else if (teststep.toString().equals("Logout")){
				r.logout();

			}
			
		}
		
		

	}

}
