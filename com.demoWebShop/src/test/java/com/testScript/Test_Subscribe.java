package com.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Subscribe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
String title = driver.getTitle();
System.out.println(title);
if(title.equals("Demo Web Shop")) {
	System.out.println("Home page is displayed");
	driver.findElement(By.xpath("//input[contains(@type,'text') and @id='newsletter-email']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
	Thread.sleep(2000);
	String vText = driver.findElement(By.xpath("//div[@id='newsletter-result-block' and @class='newsletter-result-block']")).getText();
	System.out.println(vText);
	if(vText.equals("Thank you for signing up! A verification email has been sent. We appreciate your interest.")) {
		System.out.println("Subscribe successfully.");
	}
	else
		System.out.println("Subscribe unsuccessfully...");
}
else
	System.out.println("Invalide page is displayed...");

	}

}
