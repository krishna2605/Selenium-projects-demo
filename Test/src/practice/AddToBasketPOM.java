package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToBasketPOM {
	private WebDriver driver;
	
	
	public AddToBasketPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	private WebElement shop;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	private WebElement home;
	
	@FindBy(xpath="//li[@class='post-160 product type-product status-publish has-post-thumbnail product_cat-selenium product_tag-ruby product_tag-selenium has-post-title no-post-date has-post-category has-post-tag has-post-comment has-post-author first instock downloadable taxable shipping-taxable purchasable product-type-simple']//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image']")
	private WebElement img;
	
	@FindBy(xpath="//button[@class='single_add_to_cart_button button alt']")
	private WebElement basket;
	
	@FindBy(xpath="//a[@class='button wc-forward']")
	private WebElement view;
	
	public void clickshop() {
		this.shop.click();
	}
	
	public void clcikhome() {
		this.home.click();
	}
	
	public void clickimg() {
		this.img.click();
	}
	
	public void clickbasket() {
		this.basket.click();
	}
	
	public void clickview() {
		this.view.click();
	}
	
}
