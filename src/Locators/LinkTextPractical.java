package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPractical {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Can't reset your password?"));
		Thread.sleep(3000);
		driver.close();
		

	}

}
