package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSiteTest {

	private WebDriver driver;
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ictus arte\\Desktop\\Pedro\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException{
		driver.get("https://www.facebook.com/");
		assertTrue("titulo difere",driver.getTitle().contentEquals("Facebook – entre ou cadastre-se"));
		Thread.sleep(3000);
	}
}
