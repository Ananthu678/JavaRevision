package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class firefoxtest {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		  
		  URL url = new URL("http://ec2-3-17-79-67.us-east-2.compute.amazonaws.com:4444/wd/hub");
		  
		  RemoteWebDriver driver = new RemoteWebDriver(url, dc);
		  
		  driver.get("https://www.spicejet.com/");
		  
		  System.out.println(driver.getTitle());
		  
		  driver.quit();

	}

}
