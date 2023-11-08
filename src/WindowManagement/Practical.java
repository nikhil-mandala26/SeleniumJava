package WindowManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practical {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//maximaize...
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//minimize
		//driver.manage().window().minimize();
		
		//fullscreen mode
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		driver.close();
		
		

	}

}
