import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Log10 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("test_automation101");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div/div[3]/div[1]/a")).click(); //Xpath of the profile dropdown 
		driver.findElement(By.xpath("//*[@id='gb_71']")).click(); //Xpath of the logout button
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("test_automation101");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		
		
		
	}
}
