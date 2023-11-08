package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocatorPractical {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://snapdeal.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.className("searchformInput")).sendKeys("shoe");
		driver.findElement(By.className("searchTextSpan")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
