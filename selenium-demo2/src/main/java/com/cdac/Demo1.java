package com.cdac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8081/MyWebApp/");
		//System.out.println(driver.getTitle());
		//driver.close();
		
		try { Thread.sleep(2000); } catch( Exception e) { }
		driver.findElement(By.id("link2")).click();
		driver.findElement(By.name("email")).sendKeys("sandyc4136@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("123");
		driver.findElement(By.name("rememberMe")).click();
		// driver.findElement(By.tagName("button")).submit();
		// or
		//driver.findElement(By.cssSelector("Button[type='submit']")).click();
		
		WebElement e = driver.findElement(By.name("Role"));
		Select s = new Select(e);
		s.selectByIndex(2);
		//driver.findElement(By.className("btn")).click();
		// driver.findElement(By.tagName("button")).click();
	}
}
