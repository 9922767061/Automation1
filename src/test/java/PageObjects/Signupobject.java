package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Signupobject {
	WebDriver driver;
	public Signupobject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	 @FindBy(xpath = "//input[@name='name']")
	  private WebElement name;
	 @FindBy(xpath = "(//input[@name='email'])[2]")
	  private WebElement email ;
	 
	 public void Enternmaeandemail()
	 {
		 name.sendKeys("abcx");
		 email.sendKeys("doih@gmail.com");
	 }
	 @FindBy(xpath = "//button[text()='Signup']")
	  private WebElement Signup ;
	 
	 public void clickonsignup()
	 {
		 Signup.click();
	 }
	 
	 @FindBy(xpath = "//input[@id='id_gender1']")
	  private WebElement gender ;
	 
	 public void selectgender()
	 {
		 gender.click();
	 }
	 
	 @FindBy(xpath = "//input[@id='password']")
	  private WebElement createpassword ;
	 
	 public void createpassword()
	 {
		 createpassword.sendKeys("abcd@7467");
	 }
	 @FindBy(xpath = "//select[@id='days']")
	  private WebElement day ;
	 @FindBy(xpath = "//select[@id='months']")
	  private WebElement months ;
	 @FindBy(xpath = "//select[@id='years']")
	  private WebElement years ;
	 
	public void selectDOB()
	{
		
		Select sc=new Select(day);
		sc.selectByValue("18");
		
		Select mont=new Select(months);
		mont.selectByValue("7");
		
		Select Year=new Select(years);
		Year.selectByValue("1999");
	}
	 @FindBy(xpath = "//input[@id='first_name']")
	  private WebElement first_name ;
	 @FindBy(xpath = "//input[@id='last_name']")
	  private WebElement last_name ;
	
	public void enterfirst_lastname()
	{
		
		first_name.sendKeys("virat");
		 last_name.sendKeys("Kohli");
	}
	 @FindBy(xpath = "//input[@id='address1']")
	  private WebElement address1 ;
	 
	public void Address()
	{
		
		address1.sendKeys("Solapur,pandharpur-rod");
	}
	
	 @FindBy(xpath = "//input[@id='city']")
	  private WebElement city ;
	public void cityname() {
		
		 city.sendKeys("Pandharpur");
	}
	
	 @FindBy(xpath = "//input[@id='state']")
	  private WebElement state ;
	 
	public void statename() {
		
		state.sendKeys("Maharashtra");
	}
	
	 @FindBy(xpath = "//input[@id='zipcode']")
	  private WebElement zipcode ;
	 @FindBy(xpath = "//input[@id='mobile_number']")
	  private WebElement mobile_number ;
	 
	public void enterzip_mobno()
	{
	
	zipcode.sendKeys("7658");
	
	mobile_number.sendKeys("84677376");
	}
	 @FindBy(xpath = "//button[text()='Create Account']")
	  private WebElement Accountcreated ;
	 
	public void crateaccountbutton() {
		
		Accountcreated.click();
	}
	
	@FindBy(xpath=" //a[text()=' Products']")
	private WebElement product;
	public void selectproduct() {
		
		product.click();
	}
	@FindBy(xpath="//div[@id='Men']")
	private WebElement men;
	
	public void clickonman() {
		try
		{
		men.click();
	}
		catch (Exception e) {
            e.printStackTrace();
        }
	}
	@FindBy(xpath="//a[text()='Tshirts ']")
	private WebElement tshirt;
	
	public void clickontshirt() {
		try
		{
		tshirt.click();	
	}
		catch (Exception e) {
            e.printStackTrace();
        }
	}
	@FindBy(xpath="(//a[text()='View Product'])[1]")
	private WebElement viewproduct;
	public void clickonviewproduct() {
		viewproduct.click();
		
	}
	@FindBy(xpath="//button[@type='button']")
	private WebElement addtocart;
	public void clickonaddtocart() {
		addtocart.click();
		
	}
	@FindBy(xpath="(//input[@name='email'])[1]")
	private WebElement username;
	@FindBy(xpath="(//input[@name='password'])[1]")
	private WebElement password;
	public void enerusernamepassword() {
		username.sendKeys("gdha@gmail.com");
		password.sendKeys("Gdhgh@7365");
		
	}
	@FindBy(xpath="//button[text()='Login']")
	private WebElement login;
	public void login() {
		login.click();
	}
	@FindBy(xpath="//u[text()='View Cart']")
	private WebElement viewcart;
	public void viewcartbutton() {
		viewcart.click();
		
	}
	@FindBy(xpath="//a[text()='Proceed To Checkout']")
	private WebElement procedtochek;
	public void procedtochek() {
		procedtochek.click();
		
	}
	@FindBy(xpath="//a[text()='Place Order']")
	private WebElement placeorder;
	public void clickonplaceorder() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down by 1000 pixels vertically
        js.executeScript("window.scrollBy(0,500)");
		placeorder.click();
		
	}
	@FindBy(xpath="//input[@name='name_on_card']")
	private WebElement enertcardname;
	public void entercardname() {
		enertcardname.sendKeys("mastercard");
		
	}
	@FindBy(xpath="//input[@name='card_number']")
	private WebElement enertcardno;
	public void entercardno() {
		enertcardno.sendKeys("476674");
		
	}
	@FindBy(xpath="//input[@name='cvc']")
	private WebElement cvc;
	@FindBy(xpath="//input[@name='expiry_month']")
	private WebElement expiry_month;
	@FindBy(xpath="//input[@name='expiry_year']")
	private WebElement year;
	
	public void entercvcexpira() {
		cvc.sendKeys("767");
		expiry_month.sendKeys("7");
		 year.sendKeys("2999");
	}
	@FindBy(xpath="//button[text()='Pay and Confirm Order']")
	private WebElement pay;

	public void clickonpay() {
		
	pay.click();
		
	}
	
	
	
	
	
	 
}
	 
	 
	 

