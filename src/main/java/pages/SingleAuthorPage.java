package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.SeleniumWrappers;

public class SingleAuthorPage extends SeleniumWrappers{

	public WebDriver driver ;
	public SingleAuthorPage(WebDriver driver2){
	this.driver= (WebDriver) driver2; 
	}

	//locatori
	    public By dramaPercentage = By.xpath("(//div[@class = 'sc_skills_total'])[1]");
		public By biographyPercentage = By.xpath("(//div[@class = 'sc_skills_total'])[2]");
		public By cookbooksPercentage = By.xpath("(//div[@class = 'sc_skills_total'])[3]");
	}

