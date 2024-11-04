package Action_Keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class php_login {
static WebDriver driver;
public static void open() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
}
public static void url() {
	driver.navigate().to("https://www.phptravels.net/login");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
public static void username() {
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("user@phptravels.com");
}
public static void password() {
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("demouser");
}
public static void login() throws InterruptedException {
	WebElement login = driver.findElement(By.id("submitBTN"));
	login.click();
	Thread.sleep(3000);
}
public static void profile() {
	WebElement profile = driver.findElement(By.xpath("//*[@id=\"fadein\"]/main/div/div/div/div[2]/ul/li[3]/a"));
	profile.click();
}
public static void city() {
	WebElement city = driver.findElement(By.id("City"));
	city.clear();
	city.sendKeys("Chennai");
}
public static void pwd() {
	WebElement pwd = driver.findElement(By.name("password"));
	pwd.sendKeys("demouser");
}
public static void update() throws InterruptedException {
	WebElement update = driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[6]/button"));
	update.click();
	Thread.sleep(3000);
	driver.quit();
}
public static void close() {
	driver.quit();
}
}
