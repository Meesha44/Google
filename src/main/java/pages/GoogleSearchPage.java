package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class GoogleSearchPage extends Base {
	
	@FindBy(id="APjFqb")
    WebElement googleSearchTxt;
	
	@FindBy(xpath="(//div[@class='wM6W7d'])[1]")
	WebElement searchResult;
	
	public GoogleSearchPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean SearchResult(String text) throws InterruptedException
	{
		googleSearchTxt.sendKeys(text);
		Thread.sleep(5000);
		return searchResult.isDisplayed();
	}
	
}
