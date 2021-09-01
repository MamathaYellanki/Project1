/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		String email1="6303216606";
		String pass1="bhavani1234";
		
		System.setProperty("webdriver.chrome.driver", "F:\\testing\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(email1);
		driver.findElement(By.id("pass")).sendKeys(pass1);
		driver.findElement(By.name("login")).click();
	}

}*/

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	String email="keerthigummula@gmail.com";
		String pass="16Ud1@0535";
		
        System.setProperty("webdriver.chrome.driver", "F:\\testing\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
		/*driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div/span")).click();
        driver.findElement(By.id("ap_email")).sendKeys(email);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(pass);
		driver.findElement(By.id("signInSubmit")).click();
        driver.findElement(By.name("field-keywords")).sendKeys("Macbook air");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();	
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span")).click();
       
        
        	  //driver.findElement(By.xpath("//*[@id=\"wishListMainButton\"]/span/a")).click();
        driver.findElement(By.xpath(".//input[@id='add-to-cart-button']")).click();*/
       
}
}