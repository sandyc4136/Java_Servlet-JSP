package com.cdac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://vjmklvljn3.csb.app/");
		// try { Thread.sleep(10000); } catch(Exception e) { }
		
		
		//driver.findElement(By.linkText("Create New Contact")).click();
		driver.findElement(By.tagName("span")).click();
		
		//driver.findElement(By.cssSelector("input[Placeholder='Name']")).sendKeys("Sandip");
		//driver.findElement(By.cssSelector("input[Placeholder='Number']")).sendKeys("9876543210");
		
		//   OR
		
		//driver.findElement(By.xpath("//form/div[1]/input")).sendKeys("Sandy");
		//driver.findElement(By.xpath("//form/div[2]/input")).sendKeys("99428528582");
	
		//   OR
		
		driver.findElement(By.xpath("//div[@class='container']/form/div[1]/input")).sendKeys("Sandip");
		driver.findElement(By.xpath("//div[@class='container']/form/div[2]/input")).sendKeys("832385835");
		driver.findElement(By.className("btn-primary")).click();
		
	}
}
