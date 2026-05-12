package org.openqa.selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class SeleniumTest1 {
		private static final JavascriptExecutor JavascriptExecutor = null;
		// TODO Auto-generated method stub
		WebDriver driver;
		JavascriptExecutor jse;
		public void invokeBrowser(){
			try {
				driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.get("http://www.edureka.co");
				searchCourse();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void searchCourse() throws InterruptedException {
			try {
				driver.findElement(By.id("homeSearchBar")).sendKeys("Python");
				driver.findElement(By.id("homeSearchBar")).sendKeys(Keys.RETURN);
				jse = (JavascriptExecutor)driver;
				jse.executeScript("scroll(0,700);");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//label[contains(text(),'Weekend')]")).click();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Thread.sleep(10000);
			driver.quit();
		//	driver.findElement(By.xpath("//label[@id='categorylistmain']")).click();
	}
		
		public static void main(String[] args) {
		SeleniumTest1 myObj = new SeleniumTest1();
		myObj.invokeBrowser();
		
	}
}
