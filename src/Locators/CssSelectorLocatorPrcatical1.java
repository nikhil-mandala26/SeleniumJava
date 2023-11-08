package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocatorPrcatical1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input#Phone number, username, or email")).sendKeys("7661972526");
		driver.findElement(By.cssSelector("input#password")).sendKeys("wgwgew");
		driver.findElement(By.cssSelector("button.submit")).click();
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
