import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Log6 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("‘ or ‘1’=’1");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
	}
}
