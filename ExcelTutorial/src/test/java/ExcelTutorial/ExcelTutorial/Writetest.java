package ExcelTutorial.ExcelTutorial;

import org.testng.annotations.Test;

import com.ReadExcel.WriteExcel;

public class Writetest {
	
	WriteExcel obj = new WriteExcel();
	
	@Test
	public void writetest() throws Exception {
		obj.writeExcel("Test", "FirstName3", 0, 2);
	}
	
	@Test
	public void writetest1() throws Exception {
		obj.writeExcel("Test", "FirstName5", 3, 0);
	}

}
