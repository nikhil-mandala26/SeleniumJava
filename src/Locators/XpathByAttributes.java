package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@data-uia='header-login-link']")).click();
		driver.findElement(By.xpath("//input[@data-uia='login-field']")).sendKeys("7661972526");
		driver.findElement(By.xpath("//input[@data-uia=\"password-field\"]")).sendKeys("2526");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@data-uia=\"login-submit-button\"]")).click();
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
