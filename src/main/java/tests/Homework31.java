package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class Homework31 extends BaseTest{

	public void sendMessageTest() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		
		String javascriptHover = "var obiect = document.createEvent('MouseEvent');"
				+ "obiect.initMouseEvent('mouseover', true);"
				+ "arguments[0].dispatchEvent(obiect);";
		
		jse.executeScript(javascriptHover, app.returnElement(app.menu.blogLink));
		
		app.click(app.menu.postFormats);
		
		jse.executeScript("arguments[0].scrollIntoView();", app.postFormats.galerryFormat);
		
		jse.executeScript("Window.scroll(0,-100");
		app.click(app.postFormats.galerryFormat);
        
		jse.executeScript("document.getElementsByName('comment')[0].scrollIntoView()");
		
		jse.executeScript("window.scrollBy(0, -100)");
		
		jse.executeScript("document.getElementsByName('comment')[0],value='A nice comment'");
	   
		Thread.sleep(3000);
		
		jse.executeScript("arguments[0].value='My name is Luigi'",app.returnElement(app.galleryFormatPage.nameField));
		
		jse.executeScript("document.getElementsByName('email')[0].value='luigi@google.ro'");

		jse.executeScript("document.getElementsByName('url')[0].value='www.luigi.ro'");
		
		jse.executeScript("document.getElementsByName('submit')[0].click()");
		
		Thread.sleep(3000);
		
		assertEquals(app.returnElement(app.galleryFormatPage.commentText).getText(),"Your comment is awaiting moderation.");
		driver.findElement(By.className("comment_not_approved"));
	    WebElement commentText = driver.findElement(By.className("comment_not_approved"));
	    commentText.getText();
	}
	
}
