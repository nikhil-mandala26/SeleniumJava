package webElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement foodImage=driver.findElement(By.className("_2h2bu"));
		
		Rectangle r=foodImage.getRect();
		
		System.out.println("Rectangular Measures "+ r);
		System.out.println("X coodinate "+ r.getX());
		System.out.println("Y coodinate "+ r.getY());
		System.out.println("Height "+r.getHeight());
		System.out.println("Width "+r.getWidth());
		
		driver.close();
		
		

	}

}
