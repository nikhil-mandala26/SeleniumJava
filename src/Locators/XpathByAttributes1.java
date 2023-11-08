package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributes1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
	
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("7661972526");
		driver.findElement(By.xpath("//input[@class=\"_aa4b _add6 _ac4d\"]")).sendKeys("minni2526");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//a[@role=\"link\"]")).click();
//		driver.findElement(By.xpath("//div[text()='Not Now']")).click();
//		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
//		driver.findElement(By.xpath("//span[@aria-describedby=\":rj:\"]")).click();
		
		Thread.sleep(4000);
		
		
		Thread.sleep(3000);
	

	}

}
