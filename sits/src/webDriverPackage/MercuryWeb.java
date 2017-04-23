package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryWeb {

	public static void main(String[] args) {
		// TODO Auto-generated  stub
		WebDriver driver = new FirefoxDriver ();
		driver.get("http://www.newtours.demoaut.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText ("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Farjana");
		driver.findElement(By.name("lastName")).sendKeys("Aktar");
		driver.findElement(By.name("phone")).sendKeys("5716231420");
		driver.findElement(By.id("userName")).sendKeys("farjana973@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("805 Autumn Breeze Ct");
		driver.findElement(By.name("city")).sendKeys("Herndon");
	
		
	}

}
 