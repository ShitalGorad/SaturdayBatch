package com.KDF;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageObjectModel.OrangeHRMWithPageFactory;

public class OrangeHRMKDF {

	public static void main(String[] args) throws Exception {
	
		WebDriver w = new ChromeDriver();
		OrangeHRMWithPageFactory r = new OrangeHRMWithPageFactory(w);
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Shital\\Front Accounting1.xlsx");
		XSSFWorkbook work =new XSSFWorkbook(fis);
		XSSFSheet Sheet2 =work.getSheet("Sheet2");
		for (int i =1 ;i<=4;i++ ) {
			XSSFRow row =Sheet2.getRow(i);
			XSSFCell teststep =row.getCell(0);
			
			if (teststep.toString().equals("Login")) {
				r.loginclear();
				r.EnterLoginData();
				r.login();
				r.manda();
				
			} else if (teststep.toString().equals("Logout")){
				r.Logout();

			}
			
		}

	}

}
