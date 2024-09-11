package com.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_CommunityPoll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Demo Web Shop")) {
			System.out.println("Home page is displayed");
			driver.findElement(By.linkText("Log in")).click();
			String url = driver.getCurrentUrl();
			System.out.println(url);
			if(url.equals("https://demowebshop.tricentis.com/login")) {
				System.out.println("Login page is displayed");
				driver.findElement(By.id("Email")).sendKeys("shubhamtripathi6930@gmail.com");
				driver.findElement(By.name("Password")).sendKeys("123456789");
				driver.findElement(By.className("login-button")).click();
//steps to validate login is successful or not
				WebElement wb = driver.findElement(By.linkText("Log out"));
				String tName = wb.getTagName();
				System.out.println(tName);
				if(tName.equals("a")) {
					System.out.println("Login is successful ");
					driver.findElement(By.xpath("//input[@id='pollanswers-2' and @type='radio']")).click();
					driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
					Thread.sleep(2000);
//steps to validate community poll is successful or not
					WebElement wb2 = driver.findElement(By.xpath("//ul[@class='poll-results']"));
					String tName2 = wb2.getTagName();
					System.out.println(tName2);
					if(tName2.equals("ul")) {
						System.out.println("Vote successfully");
					}
					else
						System.out.println("Vote unsuccessful...");

				}
				else {
					System.out.println("Login is unsuccessful.");
					System.out.println("The credentials provided are incorrect.");}
			}
			else
				System.out.println("Login page is not displayed..");
		}
		else
			System.out.println("Home page is not displayed...");
}
}