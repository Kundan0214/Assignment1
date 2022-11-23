package com.TestLayer;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.Baseclass;
import com.pageLayer.Wiki;

public class WikiTest extends Baseclass{

	
	static Wiki searchfilm;

	@BeforeClass
	public void setup() {
		Baseclass.initialization();
		driver.navigate().to("https://en.wikipedia.org");
	}

	@Test(priority = 1)
	public void searchonwikipedia() {
		searchfilm = new Wiki();

		searchfilm.validatePushpatherise("PushpaTheRise");
	}

	@Test(priority = 2)
	public void clickontheserch() {
		// assert.assertEquals("India", "India");
		searchfilm.clickonserchbutton();
	}

	@Test(priority = 3)
	public void clickonpushpalink() {
		searchfilm.clickonpushpariselink();
	}

	@Test(priority = 4)
	public void validatereleasedate() {
		// searchfilm.capturerelesedateofpushpa();
		Assert.assertEquals(searchfilm.capturecountryname().contains("India"), true);
	}

	@Test(priority = 5)
	public void validatcountry() {
		Assert.assertEquals(searchfilm.capturerelesedateofpushpa().contains("17 December 2021"), true);
	}
	
	
}
