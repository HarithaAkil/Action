package org.proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actclass {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\kavin\\eclipse-workspace\\Action\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://lh.inmakesedu.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// object for action class
		Actions a = new Actions(driver);
		// to find courses button web element
		WebElement courses = driver.findElement(By.id("navbarDropdown"));
		// to move the cursor to courser
		a.moveToElement(courses).perform();
		WebElement st = driver.findElement(By.xpath("(//div[@class='dropdown dropright p-0 m-0'])[10]"));
		a.moveToElement(st).perform();
	}

}
