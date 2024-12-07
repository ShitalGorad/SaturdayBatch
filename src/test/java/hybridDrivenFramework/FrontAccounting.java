package hybridDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FrontAccounting {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		w.get("https://demo.frontaccounting.eu/index.php");
		FrontAccountingRepo r = new FrontAccountingRepo(w);
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Shital\\Front Accounting.xlsx");
		XSSFWorkbook work =new XSSFWorkbook(fis);
		XSSFSheet Sheet1 =work.getSheet("Sheet1");
		for (int i =1 ;i<=5;i++ ) {
			XSSFRow row = Sheet1.getRow(i);
			XSSFCell username =row.getCell(0);
			XSSFCell password = row.getCell(1);
			for (int j =1 ;j<=3;j++ ) {
				XSSFRow row1 = 	Sheet1.getRow(j);
				XSSFCell teststep = row1.getCell(2);
				String convert = teststep.toString();
				try {
					 if (convert.equals("Login")) {
						Thread.sleep(2000);
						r.EnterLoginData(username.toString(),password.toString());
					} else if (convert.equals("Logout")) {
						Thread.sleep(2000);
						r.logout();
					}
					 
					
				} catch (Exception e) {
				TakesScreenshot tss = (TakesScreenshot) w;
				FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\HP\\Desktop\\Shital\\"+username.toString()+" "+password.toString()+".png"));
				
				}
			}
		}

	}

}
