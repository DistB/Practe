import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\TEST AUTOMATION TOOLS\\Selenium\\Chrome\\Chromedriver.exe");
	  driver = new ChromeDriver() ;
	  driver.manage().window().maximize();
  }
  
  @Test
  public void f() {
	  driver.get("https://www.interswitchgroup.com");
	  driver.findElement(By.linkText("About Us")).click();
	  driver.findElement(By.linkText("Our Company")).click();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
