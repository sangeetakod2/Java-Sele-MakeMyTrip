package com.makeMyTrip.qa.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.makeMyTrip.qa.base.TestBase;
import com.makeMyTrip.qa.util.RepositeriesFactory;
import com.makeMyTrip.qa.util.TestUtil;

public class HomePage extends TestBase{
Properties prop;
TestUtil testutil;
	public void tripPlaner(String fromCity,String toCity) throws InterruptedException {
		//try {
/*			if(driver.switchTo().alert() != null)
			{
			    Alert alert = driver.switchTo().alert();
			    String alertText = alert.getText();
			    alert.dismiss(); // alert.accept();

			}
			else
			{
*/			
			
		 Thread.sleep(5000);  
		driver.findElement(By.xpath(RepositeriesFactory.from)).click();
			driver.findElement(By.xpath(RepositeriesFactory.DepartCityName)).sendKeys(fromCity);
			List<WebElement> list = driver.findElements(By.xpath(RepositeriesFactory.autosearchList));
			list.get(0).click();
			driver.findElement(By.xpath(RepositeriesFactory.toCityName)).sendKeys(toCity);
			List<WebElement> list1 = driver.findElements(By.xpath(RepositeriesFactory.autosearchList));
			list1.get(0).click();


			//testutil.closePopUp();

		//} 
/*		}catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("popUp not found");

		}
*/
	}
	
}
