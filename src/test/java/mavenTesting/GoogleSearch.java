package mavenTesting;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		FileInputStream fis =new FileInputStream("C:\\Users\\HP\\Desktop\\Shital\\Google Search.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		for (int i=1; i<=sheet.getLastRowNum();i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell sea = row.getCell(0);
			
			w.get("https://www.google.com/");
			Thread.sleep(3000);
			w.findElement(By.id("APjFqb")).sendKeys(sea.toString());
			Thread.sleep(3000);
			w.findElement(By.id("APjFqb")).submit();
			Thread.sleep(3000);
			
			
			
		}
		

	}

}
