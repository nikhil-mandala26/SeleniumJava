package WindowManagement;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindowSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(4000);
		Dimension dimension=new Dimension(768,1324);
		
		driver.manage().window().setSize(dimension);
		Thread.sleep(4000);
		driver.close();
	}

}
