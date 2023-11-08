package webElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement singup=driver.findElement(By.xpath("//span[text()=\"Sign up\"]"));
		
		Point p=singup.getLocation();
		System.out.println("Position of singup is "+p);
		
		System.out.println("position of x coordinatre is "+p.getX());
		System.out.println("Position of y coordinate is "+p.getY());
		
		driver.close();
		
		

	}

}
