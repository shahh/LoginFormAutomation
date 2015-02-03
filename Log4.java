import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Log4 {

	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		
		
	}
}
