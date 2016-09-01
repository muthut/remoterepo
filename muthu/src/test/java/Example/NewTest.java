package Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Hello muthu");
	  System.out.println("githud");
  }
  @BeforeTest
  public void m()
  
  {
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.google.com");
  }
  
}
