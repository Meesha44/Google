package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.GoogleSearchPage;

public class GTest extends Base{
	
	GoogleSearchPage GoogleSearch;
	public GTest()
	{
		super();
	}
	
	@BeforeMethod
	public void SetUp()
	{
		Initialization();
		GoogleSearch= new GoogleSearchPage();
	}
	
	@Test
	public void MavenTest()
	{
	Boolean result;
	try {
		
		result = GoogleSearch.SearchResult("Maven");
		Assert.assertTrue(result);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
