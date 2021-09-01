import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm_css {

	public static void main(String[] args) {
	
		String username="Admin";
		String password="admin123";
		
		System.setProperty("webdriver.chrome.driver", "F:\\testing\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
	// 1. open orangehrmlive.com
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
	
	System.out.println(driver.getTitle());// 2. get title
	
	// 3. Css selectors for textboxes , Images and login 
	 driver.findElement(By.cssSelector("#txtUsername")).sendKeys(username);
	 
	driver.findElement(By.cssSelector("#txtPassword")).sendKeys(password);
	 
	driver.findElement(By.cssSelector("#btnLogin")).click();
	 
	
	 
	 
	 // 4. Validating dash board
	 String currentUrl=driver.getCurrentUrl();
	 if(currentUrl.contains("dashboard"))
		 System.out.println(" dashboard opened");
	 else
		 System.out.println(" dashboard not opened");
	 
	//  To click forgot password
	 driver.findElement(By.cssSelector("div:nth-child(2) form:nth-child(1) div:nth-child(9) div:nth-child(2) > a:nth-child(1)")).click();
	 
	 //enter OrangeHRM User name to reset password
	 driver.findElement(By.cssSelector("#securityAuthentication_userName")).sendKeys(username);
	 
	// reset password button
	 driver.findElement(By.cssSelector("#btnSearchValues")).click();
	 
	 //   cancel button
	 driver.findElement(By.cssSelector("#btnCancel")).click();

	 
	}

}
