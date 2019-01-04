package com.qa.strings;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CompareString {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "..//seleniumwithjava//Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element);
		sel.selectByIndex(1);
		String h = sel.toString();
	
		System.out.println(h);

		driver.quit();
	}
}
