package Cucumberstep;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjects.Signupobject;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.*;

public class Signupsteps  {
	
  WebDriver driver;
 public Signupobject obj;
 

 
 
@Given("user on login page")
public void user_on_login_page() {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.automationexercise.com/login");
	obj=new Signupobject(driver);
}

@When("user enter the name and email")
public void user_enter_the_password_and_username() {
	 
	obj.Enternmaeandemail();
}
@And("click on sinup")
public void click_on_login_button() {

	obj.clickonsignup();
}

@Then("verify the Home Page")
public void verify_the_home_page() {
    
String expextedtitel="Automation Exercise - Signup"	;
String Actualtitel = driver.getTitle();
// assert.assertEquals(true, expextedtitel, Actualtitel);
	
}

@Then("user select the titel")
public void user_select_the_titel() {

	obj.selectgender();
}

@Then("user create the password")
public void user_create_the_password() {
	obj.createpassword();
}

@Then("user select the birth date")
public void user_select_the_birth_date() {
	obj.selectDOB();
}

@Then("user eneter the firstname and lastname")
public void user_eneter_the_firstname_and_lastname() {
     obj.enterfirst_lastname();
}

@Then("user enter the Address")
public void user_enter_the_address() {
	obj.Address();
}

@Then("user enter the cityname")
public void user_enter_the_cityname() {

	obj.cityname();
}

@Then("user enter the statename")
public void user_enter_the_statename() {
	obj.statename();
}

@And("user enter the mobileno and zipcode")
public void user_enter_the_mobileno_and_zipcode() {

	obj.enterzip_mobno();
}

@And("user click on Create Account button")
public void user_click_on_create_account_button() {
	obj.crateaccountbutton();
}

@Then("verify the Account created Message is display")
public void verify_the_account_created_message_is_display() {
 String actmessage = driver.findElement(By.xpath("//b[text()='Account Created!']")).getText();
 String expmessage="Account Created!";
}

@When("user enter username and password")
public void user_enter_username_and_password() {
//	WebElement username = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
//	username.sendKeys("gdha@gmail.com");
//	WebElement password = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
//	password.sendKeys("Gdhgh@7365");
	obj.enerusernamepassword();
}
 @When("click on login button")
   public void click_on_login_button1() {
//	 WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
//		login.click();
	 obj.login();
}

@When("user click on product")
public void user_click_on_product() {
   obj.selectproduct();
}
@When("user click on man")
public void user_click_on_man() {
	obj.clickonman();

}
@When("user click on t-shirt")
public void user_click_on_t_shirt() {
  obj.clickontshirt();
}
@When("user click on view product button")
public void user_click_on_view_product_button() {
    obj.clickonviewproduct();
}
@When("user click on Addtocart button")
public void user_click_on_addtocart_button() {
  obj.clickonaddtocart();
}
@When("user click on viewcart button")
public void user_click_on_viewcart_button() {
  obj.viewcartbutton();
}
@When("user click on proced to check button")
public void user_click_on_proced_to_check_button() {
    obj.procedtochek();
}

@When("user click on place order button")
public void user_click_on_place_order_button() {
   obj.clickonplaceorder();
}
@When("user enter the card name")
public void user_enter_the_card_name() {
    obj.entercardname();
}
@When("user enter card number")
public void user_enter_card_number() {
	
	 obj.entercardno();
}
@When("user enter cvc and expiration")
public void user_enter_cvc_and_expiration() {
   obj.entercvcexpira();
}
@When("user click pay and confirm button")
public void user_click_pay_and_confirm_button() {
    obj.clickonpay();
}
@Then("verify order placed message")
public void verify_order_placed_message() {
    
}












}
