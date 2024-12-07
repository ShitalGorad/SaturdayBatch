package testng;

import org.testng.annotations.DataProvider;

public class GoogleData {

	@DataProvider
	public String[] GetData() {
		String data[] = new  String[5];
		
		data[0] = "Automation Interview Questions with Answers";
		data[1] = "Good ways to improve Englias speaking";
		data[2] = "Good for health food suggestion";
	    data[3] = "How to get job in google company";
		data[4] = "Easy way to ignore people without they knowing";
		
		
		return data;
		

	}

}
