package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.GoogleSearchPage;

public class GoogleSearchTest extends Base{
	GoogleSearchPage GoogleSearch;
	public GoogleSearchTest()
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
	public void SearchResultTest()
	{
	Boolean result;
	try {
		System.out.print("first test case_update");
		result = GoogleSearch.SearchResult("Selenium");
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
