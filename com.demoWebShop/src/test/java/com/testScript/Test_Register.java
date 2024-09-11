package com.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
String title = driver.getTitle();
System.out.println(title);
if(title.equals("Demo Web Shop")) {
	System.out.println("Home page is displayed");
	driver.findElement(By.linkText("Register")).click();
	String title2 = driver.getTitle();
	System.out.println(title2);
	if(title2.equals("Demo Web Shop. Register")) {
		System.out.println("Register page is displayed");
		//sir i have already register through my email id, so i am entering random data
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("abc");
		driver.findElement(By.name("LastName")).sendKeys("xyz");
		driver.findElement(By.id("Email")).sendKeys("abcd12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("123456");

		driver.findElement(By.className("register-next-step-button")).click();
	}
	else
		System.out.println("Register page is not displayed...");
}
else
	System.out.println("Invalid paga is displayed...");
	}

}
