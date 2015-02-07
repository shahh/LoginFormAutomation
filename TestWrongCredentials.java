import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Log5 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("test_automation101sda");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("12345678dasdas");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		
		
	}
}
