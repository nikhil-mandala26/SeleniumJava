package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocatorPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Apple");
		driver.findElement(By.className("L0Z3Pu")).submit();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Midnight, 128 GB)']/../../div[2]/div/div/div\r\n"
				+ ""));
		
		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ice creams");
//		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
