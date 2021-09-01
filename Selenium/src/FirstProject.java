import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class FirstProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Search_item="toys";
	
		
		System.setProperty("webdriver.chrome.driver","F:\\testing\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.amazon.in/");
		
		
		driver.manage().window().maximize();
		
		
		//searching items
		Select category=new Select(driver.findElement(By.id("searchDropdownBox")));
		category.selectByVisibleText("All Categories");
	driver.findElement(By.name("field-keywords")).sendKeys(Search_item);
	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();	
	
	driver.close();

	
	
	
	}
	
	

}
