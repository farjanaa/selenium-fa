package webDriverPackage;

import java.sql.Driver;
import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlesearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 1 Launch web browser
		WebDriver browser = new FirefoxDriver();
		
		// Step2 Navigate to Google
		browser.get("https://www.google.com/");
		
		// Step3 Enter Herndon VA
		browser.findElement(By.name("q")).sendKeys("Herndon VA");
		
		// Click on Search buttom
		browser.findElement(By.name("btnG")).click();
		//title page
		System.out.println("page Title is;"+Driver.getTitle());

		

		
		
		
				
				

	}

}
