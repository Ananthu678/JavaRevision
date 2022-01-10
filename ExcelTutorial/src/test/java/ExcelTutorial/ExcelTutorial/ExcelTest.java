package ExcelTutorial.ExcelTutorial;

import org.testng.annotations.Test;

import com.utility.NewExcelLibrary;

public class ExcelTest {
	
	NewExcelLibrary obj = new NewExcelLibrary();
	
	@Test (priority =2)
	public void testcase1() {
		int totalrows = obj.getRowCount("Sheet1");
		System.out.println("Total rows: " + totalrows);
	}
	
	@Test (priority =1)
	public void testcase2() {
		String data = obj.getCellData("Sheet1", "Salary", 4);
		System.out.println("Salary is : " + data);
	}
	
	@Test (priority =3)
	public void testcase3() {
		String data = obj.getCellData("Sheet1", "Rating", 4);
		System.out.println("Rating is : " + data);
		int a=1;
		Double sum = Double.valueOf(data);
		System.out.println(sum+a);
	}
	
	@Test (priority =4)
	public void testcase4() {
		obj.setCellData("Sheet", "ID", 3, "105");
	}
	
	@Test (priority =5)
	public void testcase5() {
		boolean flag = obj.addSheet("NewSheet");
		System.out.println("the flag is : " + flag );
	}


}
