  package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hwphptravels {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.phptravels.net/");
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[3]/input")).sendKeys("Farjana");
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[4]/input")).sendKeys("Aktar");
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[5]/input")).sendKeys("5716231420");
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[6]/input")).sendKeys("aktar.farjana092@gmail.com");
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[7]/input")).sendKeys("Blue123");		
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[8]/input")).sendKeys("Blue123");
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[9]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
		driver.close();
		  
		
	    
	}
}
