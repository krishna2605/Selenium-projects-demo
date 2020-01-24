package practice_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import practice.AddToBasketPOM;

public class AddToBasket {
	WebDriver driver;
	private AddToBasketPOM a;
	

	
	
	@Test
	public void book() {

	System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.navigate().to("http://practice.automationtesting.in/");
	driver.manage().window().maximize();
	a = new AddToBasketPOM(driver);
	a.clickshop();
	
	a.clcikhome();
	/*
	 * List<WebElement>linklist=driver.findElements(By.tagName("img"));
	System.out.println("No of link: "+linklist.size());
	int count=0;
	for(int i=0;i<linklist.size();i++)
	{
		System.out.println("link names "+linklist.get(i).getText());
		count++;
	}
	
	
	if(count==3)
	{
		System.out.println("correct");
	}
	else{
		System.out.println("Incorrect");
	}*/
	List<WebElement>linklist=driver.findElements(By.className("woocommerce-LoopProduct-link"));
	System.out.println("No of link: "+linklist.size());
	int count=0;
	for(int i=0;i<linklist.size();i++)
	{
		System.out.println("link names "+linklist.get(i).getText());
		count++;
	}
	
	
	if(count==3)
	{
		System.out.println("correct");
	}
	else{
		System.out.println("Incorrect");
	}
	
	a.clickimg();
	String expected="ADD TO BASKET";
	String actual=driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']")).getText();
	Assert.assertEquals(actual, expected);
	a.clickbasket();
	
	a.clickview();
	String expected1="Selenium Ruby";
	String actual1=driver.findElement(By.xpath("//a[contains(text(),'Selenium Ruby')]")).getText();
	Assert.assertEquals(actual1, expected1);
	
	
	

}
}
