import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Log9 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("test_automation101");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		driver.findElement(By.xpath("//*[@id='gb_71']")).click(); //Xpath of the Logout button
		
		
	}
}
