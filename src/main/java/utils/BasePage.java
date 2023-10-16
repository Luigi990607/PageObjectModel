package utils;

import pages.*;

public class BasePage extends SeleniumWrappers {

	public MenuPage menu = new MenuPage(driver);
	public LoginPage login  = new LoginPage(driver);
	public ShopPage shop =  new ShopPage(driver);
	public ContactsPage contact =  new ContactsPage(driver);
	public EventsPage events = new EventsPage(driver);
	public SingleEventPage singleEvent = new SingleEventPage(driver);
	public SingleAuthorPage singleAuthor= new SingleAuthorPage(driver);
	public ShippingAdressPage shippingpage= new ShippingAdressPage(driver);
	public HomePage home = new HomePage(driver);
	public BlogPage blogPage = new BlogPage(driver);
	public PostFormatPage postFormats = new PostFormatPage(driver);
	public GalleryFormatPage galleryFormatPage = new GalleryFormatPage(driver);
	public BookTemplate bookTemplate = new BookTemplate(driver);
	
}