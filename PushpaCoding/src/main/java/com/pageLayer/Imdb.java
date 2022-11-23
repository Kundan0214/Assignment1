package com.pageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.Baseclass;

public class Imdb extends Baseclass{

	

	@FindBy(xpath = "//input[@type='text']")
	WebElement searchmovie;

	@FindBy(xpath = "//button[@id='suggestion-search-button']")
	WebElement searchbutton;
	
	@FindBy(xpath = "//a[text()='Pushpa: The Rise - Part 1']")
	WebElement pushpaTitle;

	@FindBy(xpath = "//span[text()='Details']")
	WebElement gotodetais;

	@FindBy(xpath = "//a[text()='Release date']/following::li[1]")
	WebElement releasedateofmovie;

	@FindBy(xpath = "//button[text()='Country of origin']/following::li[1]")
	WebElement countryname;
	
	public Imdb()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void entermoviename(String searchvalue)
	{
		searchmovie.sendKeys(searchvalue);
	}
	public void clickonserchbtn() throws InterruptedException
	{
		searchbutton.click();
		Thread.sleep(3000);
		pushpaTitle.click();
	}
	public void detailsofmovie()
	{
		 JavascriptExecutor js =(JavascriptExecutor)driver;
			
		js.executeScript("arguments[0].scrollIntoView(true);",gotodetais);
	}
	public String capturereleasedate()
	{
		return releasedateofmovie.getText();
	}
	public String capturecountryname()
	{
		return countryname.getText();
	}


	
}
