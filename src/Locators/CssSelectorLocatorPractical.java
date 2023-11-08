package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssSelectorLocatorPractical {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("7661972526");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("hai");
		driver.findElement(By.cssSelector("button.selected")).click();
		
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
