package com.cdac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://www.makemytrip.com");
		
		//driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("iphones", Keys.RETURN);
		
	}
}
