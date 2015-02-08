import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class form_finalautomation {

	public static void testCorrectCredentials() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("test_automation101");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
	}
	
	public static void testIncorrectPass() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("test_automation101");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("12345678aas");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
	}
	
	public static void testIncorrectUser(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("test_automation101sds");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
	}
	
	public static void testEmptyCredentials(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
	}
	
	public static void testWrongCredentials(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("test_automation101sda");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("12345678dasdas");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
	}
	
	public static void testSQLInjection(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("‘ or ‘1’=’1");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
	}
	
	public static void testEmptyUser() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
	}
	
	public static void testEmptyPass(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("test_automation101");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
	}
	
	public static void loginandLogout(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("test_automation101");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		driver.findElement(By.xpath("//*[@id='gb_71']")).click(); //Xpath of the Logout button
	}
	
	public static void loginLogOutandLogin(){
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
	
	public static void mailBoxRedirect(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("test_automation101");
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id='signIn']")).click();
		driver.findElement(By.xpath("//*[@id=':4y']/div/div[1]")).click(); //XPath of the Inbox Sign
	}
}
