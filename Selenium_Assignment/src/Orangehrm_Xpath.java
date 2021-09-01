import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm_Xpath {

	public static void main(String[] args) {
	
		String username="Admin";
		String password="admin123";
		
		
	System.setProperty("webdriver.chrome.driver", "F:\\testing\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
// 1. open orangehrmlive.com
driver.get("https://opensource-demo.orangehrmlive.com/");

driver.manage().window().maximize();

//2.Title of apllication
System.out.println(driver.getTitle());

 //3. Xpath for all textboxes and images and login
/*driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(username);
driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(password);
driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();*/


//3. Css selectors for textboxes and login 
	 driver.findElement(By.cssSelector("#txtUsername")).sendKeys(username);
	 driver.findElement(By.cssSelector("#txtPassword")).sendKeys(password);
	 driver.findElement(By.cssSelector("#btnLogin")).click();
	 
	 //4  Validating dashboard
String currentUrl=driver.getCurrentUrl();
if(currentUrl.contains("dashboard"))
	 System.out.println("dashboard is opened");
else
	 System.out.println("dashboard is not opened");

// Forgot password link
 /*driver.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a")).click();
 
// Valid Username to change password
 driver.findElement(By.xpath("//*[@id=\"securityAuthentication_userName\"]")).sendKeys(username);
 
//  reset password button
 driver.findElement(By.xpath("//*[@id=\"btnSearchValues\"]")).click();
 
 //  cancel button
 driver.findElement(By.xpath("//*[@id=\"btnCancel\"]")).click();*/
 
}

}
