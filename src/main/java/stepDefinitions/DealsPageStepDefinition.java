//package stepDefinitions;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.opera.OperaDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import junit.framework.Assert;
//
//public class DealsPageStepDefinition 
//{
//	WebDriver driver;
//	  
//	  @Given("^User is already on Login Page$") 
//	  public void user_already_on_login_page() 
//	  { 
//			
//			  System.setProperty("webdriver.opera.driver",
//			  "D:\\Softwares\\Selenium\\operadriver_win64\\operadriver.exe");
//			 
//				/*
//				 * System.setProperty("webdriver.chrome.driver",
//				 * "D:\\Softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
//				 * 
//				 * driver=new ChromeDriver();
//				 */
//			 
//			 driver=new OperaDriver(); 
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
//	  @Then("^user enters username and password$") 
//	  public void user_enters_username_and_password(DataTable table) 
//	  {
//		  List<List<String>> credentialsValues=table.asLists();
//		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(credentialsValues.get(0).get(0));
//		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(credentialsValues.get(0).get(1));
//	  }
//	  
//	  @Then("^user clicks on Login button$")
//	  public void user_clicks_on_login_button()
//	  {
//		  driver.findElement(By.xpath("//div[text()='Login']")).click();
//	  }
//	  
//	  @Then("^user is on home page$") public void user_is_on_home_page() 
//	  {
//		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); String
//		  username=driver.findElement(By.
//		  xpath("//div[@class='right menu']//span[@class='user-display']")).getText();
//		  Assert.assertEquals("Ramki K", username); 
//	  }
//	  
//	  @Then("^user clicks on deals link$")
//	  public void user_clicks_on_contacts_link() 
//	  {
//	     driver.findElement(By.xpath("//span[text()='Deals']")).click();
//	  }
//	  
//	  @Then("^user clicks on New button$")
//	  public void user_clicks_on_new_button() 
//	  {
//			
//			/*
//			 * WebDriverWait wait=new WebDriverWait(driver,10); WebElement
//			 * newElement=wait.until(ExpectedConditions.elementToBeClickable(driver.
//			 * findElement(By.linkText("New") ))); newElement.click();
//			 */
//			 			
//			  JavascriptExecutor je=(JavascriptExecutor)driver; WebElement
//			  newElement=driver.findElement(By.xpath("//button[text()='New']"));
//			  je.executeScript("arguments[0].click();", newElement);	 
//	  }
//	  
//	  @Then("^user enters title and amount and commission$") 
//	  public void user_enter_title_and_amount_and_commission(DataTable table) 
//	  {
//		  List<List<String>> DealsValues=table.asLists();
//		  driver.findElement(By.xpath("//input[@name='title']")).sendKeys(DealsValues.get(0).get(0));
//		  driver.findElement(By.xpath("//input[@name='amount']")).sendKeys(DealsValues.get(0).get(1));
//		  driver.findElement(By.xpath("//input[@name='commission']")).sendKeys(DealsValues.get(0).get(2));
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
//}
