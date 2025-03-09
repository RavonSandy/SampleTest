package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	
	

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
        List<WebElement> l = driver.findElements(By.xpath(""));
		
		for(WebElement e : l) {
			e.click();
		}
		driver.quit();
		System.out.println("hello");
		System.out.println("World");
		
		
		
	}

}
