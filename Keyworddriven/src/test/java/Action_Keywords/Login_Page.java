package Action_Keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_Page {
	static WebDriver driver;
	
      //open browser
	public static void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}
    //navigate to url
	public static void url() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	//enter username
	public static void username() {
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
	}
	//enter password
	public static void password() {
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
	}
	//login
	public static void login() throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		Thread.sleep(3000);
	}
	public static void directory() {
		WebElement directory = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a/span"));
		directory.click();
	}
	public static void title() {
		WebElement title = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));
		Select dropdown = new Select(title);
		dropdown.selectByVisibleText("QA Lead");
	}
	public static void search() {
		WebElement search = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
		search.click();
	}
}

