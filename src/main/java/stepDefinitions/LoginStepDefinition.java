//package stepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.opera.OperaDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import junit.framework.Assert;
//
//public class LoginStepDefinition 
//{
//	
//	  WebDriver driver;
//	  
//	  @Given("^User is already on Login Page$") 
//	  public void user_already_on_login_page() 
//	  { 
//			/*
//			 * System.setProperty("webdriver.opera.driver",
//			 * "D:\\Softwares\\Selenium\\operadriver_win64\\operadriver.exe");
//			 */
//		  System.setProperty("webdriver.chrome.driver",
//				  "D:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
//			
//			  driver=new ChromeDriver();
//			 
//			/* driver=new OperaDriver(); */
//		  driver.get("https://ui.freecrm.com/"); 
//		 
//	  }
//	  
//	  @When("^title of Login Page is Free CRM$")
//	  public void title_of_login_page_is_free_crm() 
//	  {
//	    String title=driver.getTitle();
//	    System.out.println(title);
//	    Assert.assertEquals("Cogmento CRM", title);
//	  }
//	  
//	  @Then("^user enters \"(.*)\" and \"([^\"]*)\"$") //\"(.*)\" and \"([^\"]*)\" are alternatives
//	  public void user_enters_username(String username, String password) 
//	  {
//		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
//		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//	  }
//	  
//	  @Then("^user clicks on Login button$")
//	  public void user_clicks_on_login_button()
//	  {
//		  driver.findElement(By.xpath("//div[text()='Login']")).click();
//	  }
//		
//	  @Then("^user is on home page$") public void user_is_on_home_page() {
//	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); String
//	  username=driver.findElement(By.
//	  xpath("//div[@class='right menu']//span[@class='user-display']")).getText();
//	  Assert.assertEquals("Ramki K", username); }
//	  
//	  
//	  
//	  @Then("^user clicks on contacts link$")
//	  public void user_clicks_on_contacts_link() 
//	  {
//	     driver.findElement(By.xpath("//span[text()='Contacts']")).click();
//	  }
//		 
//	  @Then("^user clicks on New button$")
//	  public void user_clicks_on_new_button() 
//	  {
//	     driver.findElement(By.xpath("//button[text()='New']")).click();
//	  }
//	  
//	  @Then("^user enters \"(.*)\" and \"([^\"]*)\" and \"(.*)\" on contact creation page$")
//	  public void user_clicks_on_save(String firstname,String lastname,String position) 
//	  {
//	     driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
//	     driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
//	     driver.findElement(By.xpath("//input[@name='position']")).sendKeys(position);
//	  }
//	  
//	  @Then("^user clicks on save$")
//	  public void user_clicks_on_save() 
//	  {
//	     driver.findElement(By.xpath("//button[text()='Save']")).click();
//	  }
//	  
//	  @Then("^user closes the browser$")
//	  public void close_the_browser()
//	  {
//		  driver.quit();
//	  }
//
//}